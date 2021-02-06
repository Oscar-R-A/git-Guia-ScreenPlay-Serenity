package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestSingUp4 extends PageObject {

    public static final Target INPUT_PASSWORD = Target.the("campo para ingresar la contraseña.")
            .located(By.id("password"));

    public static final Target INPUT_CONFIRMPASSWORD = Target.the("campo para confirmar la contraseña.")
            .located(By.xpath("confirmPassword"));

    public static final Target SELECT_TERMS_CONDITION = Target.the("campo para seleccionar el check de politicas de privacidad y seguridad.")
            .located(By.xpath("//label[contains (text(), 'I have')]//following::input[1]"));

    public static final Target SELECT_PRIVACY_SECURITY = Target.the("campo para seleccionar el check de politicas de privacidad y seguridad.")
            .located(By.xpath("//label[contains (text(), 'I have')]//following::input[2]"));

    public static final Target FINAL_BUTTON = Target.the("campo para seleccionar el check de politicas de privacidad y seguridad.")
            .located(By.xpath("//a[@class='btn btn-blue']"));

    public static final Target VALIDATE_LOGIN = Target.the("campo para validar el homepage.")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__link']"));

}
