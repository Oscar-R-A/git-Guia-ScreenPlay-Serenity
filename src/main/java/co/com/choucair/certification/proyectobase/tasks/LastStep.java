package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.UTestSingUp4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

public class LastStep implements Task {

    private String strPassword;
    private String strConfirmPassword;
    private String strLogin;

    public LastStep(String strPassword, String strConfirmPassword) {
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public static LastStep password (String strPassword, String strConfirmPassword){
        return Tasks.instrumented(LastStep.class, strPassword, strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strPassword).into(UTestSingUp4.INPUT_PASSWORD),
                Enter.theValue(strConfirmPassword).into(UTestSingUp4.INPUT_CONFIRMPASSWORD),
                Click.on(UTestSingUp4.SELECT_TERMS_CONDITION),
                Click.on(UTestSingUp4.SELECT_PRIVACY_SECURITY),
                Click.on(UTestSingUp4.FINAL_BUTTON)
                );
    }
}
