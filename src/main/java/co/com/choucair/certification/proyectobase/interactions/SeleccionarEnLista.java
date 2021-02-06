package co.com.choucair.certification.proyectobase.interactions;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class SeleccionarEnLista implements Interaction {

    private Target lista;
    private String opcion;

    public SeleccionarEnLista(Target lista, String opcion) {
        this.lista = lista;
        this.opcion = opcion;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listaOpciones = lista.resolveAllFor(actor);
        for (int i = 0; i < listaOpciones.size(); i++) {
            if (listaOpciones.get(i).getText().trim().contains(opcion)) {
                Scroll.to(listaOpciones.get(i)).andAlignToBottom();
                listaOpciones.get(i).click();
                break;
            }
        }
    }
    public static SeleccionarEnLista opcionEnLista(Target lista, String opcion){
        return new SeleccionarEnLista(lista,opcion);
    }
}