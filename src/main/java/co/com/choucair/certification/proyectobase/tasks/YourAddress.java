package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.UTestPage;
import co.com.choucair.certification.proyectobase.userinterface.UTestSingUp;
import co.com.choucair.certification.proyectobase.userinterface.UTestSingUp2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.Keys;

public class YourAddress implements Task {
    private String strCity;
    private String strPostalCode;
    private String strSelectCity;

    public YourAddress(String strCity, String strPostalCode) {
        this.strCity = strCity;
        this.strPostalCode = strPostalCode;
       // this.strSelectCity = strSelectCity;
    }


    public static YourAddress address(String strCity, String strPostalCode) {
        return Tasks.instrumented(YourAddress.class, strCity, strPostalCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strCity).into(UTestSingUp2.INPUT_CITY),
                Enter.theValue(strPostalCode).into(UTestSingUp2.INPUT_POSTALCODE),
                Click.on(UTestSingUp2.BUTTON_NEXT_DEVICES)
        );

    }
}