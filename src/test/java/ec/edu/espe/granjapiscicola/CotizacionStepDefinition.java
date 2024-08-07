package ec.edu.espe.granjapiscicola;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.fail;

public class CotizacionStepDefinition extends BasicStepDefinition {

    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.com$";
    private static final String NAME_REGEX = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$";
    private String nam;
    private String crr;

    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isValidName(String name) {
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    @Given("Quiero cotizar un producto")
    public void quiero_cotizar_un_producto() {
        createPDF("Comunicacion");
        addText("Inicio de prueba: Quiero cotizar un producto");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/noobp/Desktop/Requisitos (1)/Requisitos/Cotizar.html");
        captureScreenShot();
    }
    @When("Ingreso el nombre {string} y el correo {string}")
    public void ingreso_el_nombre_y_el_correo(String nombre, String correo){



    }


}
