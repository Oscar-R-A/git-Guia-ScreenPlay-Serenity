package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.UTestData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.AboutYourself;
import co.com.choucair.certification.proyectobase.tasks.LastStep;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.YourAddress;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class UTestSpectDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que Oscar ingresa a la pagina$")
    public void queOscaringresaalapagina(){
        OnStage.theActorCalled("Oscar").wasAbleTo(OpenUp.thePage());
    }

        @Cuando("^Oscar complete el formulario de registro$")
        public void Oscarcompleteelformularioderegistro(List<UTestData> utest)throws Exception{
            OnStage.theActorInTheSpotlight().attemptsTo(AboutYourself.register (utest.get(0).getStrName(),utest.get(0).getStrLastName(),utest.get(0).getStrMail(),
                    utest.get(0).getStrMonth(), utest.get(0).getStrDay(), utest.get(0).getStrYear()));

            OnStage.theActorInTheSpotlight().attemptsTo(YourAddress.address(utest.get(0).getStrCity(), utest.get(0).getStrPostalCode()));
            System.out.println("Ingreso register");

            OnStage.theActorInTheSpotlight().attemptsTo(LastStep.password(utest.get(0).getStrPassword(), utest.get(0).getStrConfirmPassword()));

        }

        @Entonces("^Oscar puede comprobar la creacion del usuario$")
        public void Oscarpuedecomprobarlacreaciondelusuario (){

        }

    }