package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestSingUp3 extends PageObject {

    public static final Target DEVICE_BOX = Target.the("campo para seleccionar dispositivo móvil.")
            .located(By.xpath("//*[contains(text(), 'Device')]//ancestor::div[contains(@class, 'select')]/div[contains(@class, 'select')]"));

    public static final Target SELECT_DEVICE = Target.the("Selecciona el dispositivo en la lista")
            .located(By.xpath("//span/div[contains(text(), 'Device')]//ancestor::div[contains(@class, 'select')]/div[contains(@class, 'select')]"));

    public static final Target MODEL_BOX = Target.the("campo para seleccionar el modelo del dispositivo móvil.")
            .located(By.xpath("//*[contains(text(), 'Model')]//ancestor::div[contains(@class, 'select')]/div[contains(@class, 'select')]"));

    public static final Target SELECT_MODEL = Target.the("Selecciona el modelo que se despliega en la lista")
            .located(By.xpath("//span/div[contains(text(), 'Model')]//ancestor::div[contains(@class, 'select')]/div[contains(@class, 'select')]"));

    public static final Target OS_BOX = Target.the("campo para seleccionar el Sistema Operativo del dispositivo móvil.")
            .located(By.xpath("//*[contains(text(), 'Operating')]//ancestor::div[contains(@class, 'select')]/div[contains(@class, 'select')]"));

    public static final Target SELECT_OS = Target.the("Selecciona el S.O. que se despliega en la lista")
            .located(By.xpath("//span/div[contains(text(), 'Operating')]//ancestor::div[contains(@class, 'select')]/div[contains(@class, 'select')]"));

    public static final Target SELECT_NEXTBUTTON = Target.the("Selecciona el boton para avanzar")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
