package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestSingUp extends PageObject {

    public static final Target INPUT_NAME = Target.the("campo para registrar el nombre.")
            .located(By.id("firstName"));

    public static final Target INPUT_LASTNAME = Target.the("campo para registrar el apellido.")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("campo para registrar el email")
            .located(By.id("email"));

    public static final Target SELECT_MONTH = Target.the("campo para seleccionar el mes de nacimiento")
            .located(By.name("birthMonth"));

    public static final Target SELECT_DAY = Target.the("campo para seleccionar el día  de nacimiento")
            .located(By.name("birthDay"));

    public static final Target SELECT_YEAR = Target.the("campo para seleccionar el año de nacimiento")
            .located(By.name("birthYear"));

    public static final Target NEXT_BUTTON = Target.the("campo para seleccionar el año de nacimiento")
            .located(By.xpath("//a[@class='btn btn-blue']"));


}
