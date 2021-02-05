package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("botón que nos muestra el formulario del login")
            .located(By.xpath("//a [@class='btn btn-info btn-sm text-white']"));

    public static final Target INPUT_USER = Target.the("donde se escribe el usuario")
            .located(By.xpath("//input[@type='text']"));

    public static final Target INPUT_PASSWORD = Target.the("donde se escribe la contraseña")
            .located(By.xpath("//input[@type='password']"));

    public static final Target ENTER_BUTTON = Target.the("botón para confirmar el login")
            .located(By.xpath("//button[@type='submit']"));

}
