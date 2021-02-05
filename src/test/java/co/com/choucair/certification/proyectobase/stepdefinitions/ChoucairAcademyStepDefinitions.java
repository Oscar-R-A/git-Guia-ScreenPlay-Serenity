package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
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
        OnStage.theActorCalled("Oscar").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }

    @Cuando("^Oscar busca el curso Recursos (.*) en la plataforma de la academia Choucair$")
    public void OscarbuscaelcursoRecursosAutomatizacionBancolombiaenlaplataformadelaacademiaChoucair(String course)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Entonces("^Oscar encuentra los cursos llamados recursos (.*)$")
    public void OscarencuentraloscursosllamadosrecursosRecursosdeAutomatizacionBancolombia(String question)
    {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
