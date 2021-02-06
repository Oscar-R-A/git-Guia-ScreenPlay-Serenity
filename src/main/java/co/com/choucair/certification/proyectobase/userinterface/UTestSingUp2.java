package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestSingUp2 extends PageObject {

    public static final Target INPUT_CITY = Target.the("campo para registrar la ciudad.")
            .located(By.id("city"));


    public static final Target INPUT_POSTALCODE = Target.the("campo para registrar el codigo postal.")
            .located(By.id("zip"));

    public static final Target BUTTON_NEXT_DEVICES = Target.the("campo para registrar el email")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));


}
