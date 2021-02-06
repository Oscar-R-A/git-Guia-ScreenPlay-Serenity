package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.UTestPage;
import co.com.choucair.certification.proyectobase.userinterface.UTestSingUp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class AboutYourself implements Task {
    private String strName;
    private String strLastName;
    private String strMail;
    private String strMonth;
    private String strDay;
    private String strYear;

    public AboutYourself(String strName, String strLastName, String strMail, String strMonth, String strDay, String strYear) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strMail = strMail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
    }



    public static AboutYourself register(String strName, String strLastName, String strMail, String strMonth, String strDay, String strYear) {
        return Tasks.instrumented(AboutYourself.class, strName, strLastName, strMail, strMonth, strDay, strYear);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestPage.JOIN_BUTTON),
                Enter.theValue(strName).into(UTestSingUp.INPUT_NAME),
                Enter.theValue(strLastName).into(UTestSingUp.INPUT_LASTNAME),
                Enter.theValue(strMail).into(UTestSingUp.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strMonth).from(UTestSingUp.SELECT_MONTH),
                SelectFromOptions.byVisibleText(strDay).from(UTestSingUp.SELECT_DAY),
                SelectFromOptions.byVisibleText(strYear).from(UTestSingUp.SELECT_YEAR),
                Click.on(UTestSingUp.NEXT_BUTTON)
        );

    }
}
