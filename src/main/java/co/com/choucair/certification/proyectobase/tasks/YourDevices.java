package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.interactions.SeleccionarEnLista;
import co.com.choucair.certification.proyectobase.userinterface.UTestSingUp3;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class YourDevices implements Task {
    private String nameDevice;

    public YourDevices (String nameDevice){
        this.nameDevice = nameDevice;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SeleccionarEnLista.opcionEnLista(UTestSingUp3.DEVICE_BOX,nameDevice),
                SeleccionarEnLista.opcionEnLista(UTestSingUp3.SELECT_DEVICE, nameDevice),
                SeleccionarEnLista.opcionEnLista(UTestSingUp3.MODEL_BOX, nameDevice),
                SeleccionarEnLista.opcionEnLista(UTestSingUp3.SELECT_MODEL, nameDevice),
                SeleccionarEnLista.opcionEnLista(UTestSingUp3.OS_BOX, nameDevice),
                SeleccionarEnLista.opcionEnLista(UTestSingUp3.SELECT_OS, nameDevice),
                Click.on(UTestSingUp3.SELECT_NEXTBUTTON));

    }
}
