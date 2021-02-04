package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que Oscar quiere aprender automatizacion en la academia de Choucair$")
    public void queOscarquiereaprenderautomatizacionenlaacademiadeChoucair()
    {
        OnStage.theActorCalled("Oscar").wasAbleTo(OpenUp.thePage());
    }

    @Cuando("^Oscar busca el curso Recursos Automatizacion Bancolombia en la plataforma de la academia Choucair$")
    public void OscarbuscaelcursoRecursosAutomatizacionBancolombiaenlaplataformadelaacademiaChoucair()
    {
    }

    @Entonces("^Oscar encuentra los cursos llamados recursos Recursos de Automatizacion Bancolombia$")
    public void OscarencuentraloscursosllamadosrecursosRecursosdeAutomatizacionBancolombia()
    {
    }
}
