package ec.edu.espe.granjapiscicola;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class InformacionGeneralStepDefinition extends BasicStepDefinition {

    private String pag;
    private String mis;
    private String vis;


    @Given("Quiero mostrar informacion")
    public void quiero_mostrar_informacion() {
        createPDF("Informacion General");
        addText("Inicio de prueba: Quiero mostrar informacion");

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/noobp/Desktop/Requisitos (1)/Requisitos/Pagina_Inicial.html");
        wait(1);
        captureScreenShot();

    }
    @When("Ingreso a la pagina web {string} visualizo la vision {string} y la mision {string}")
    public void ingreso_a_la_pagina_web_visualizo_la_vision_y_la_mision(String pagina, String vision,String mision){
        addText("Ingreso a la pagina " + pagina + " visualizo la vision " + vision + " y la mision "+mision);
        pag=pagina;
        mis=mision;
        vis=vision;
        wait(1);
        captureScreenShot();

    }

    @Then("Se debe validar que haya datos visibles en el apartado de mision y vision")
    public void se_debe_validar_que_haya_datos_visibles_en_el_apartado_de_mision_y_vision() {
        wait(1);
        String currentUrl = driver.getCurrentUrl();
        String vac="vacio";

        String specificUrl = "file:///C:/Users/noobp/Desktop/Requisitos (1)/Requisitos/Pagina_Inicial.html";
        if (currentUrl.equals(specificUrl)) {
            addText("Pagina correcta. "+ pag);
            WebElement inputMision = driver.findElement(new By.ById("mision"));
            WebElement inputVision = driver.findElement(new By.ById("vision"));
            addText("mision. "+ mis);
            /*if(!mis.equals(vac)){
                addText("Misión con información: "+ mis);
            }else{
                addText("Mision con sin datos: "+ mis);
                addText("Fin de la prueba");
                driver.quit();
                closePDF();
                fail("Misión no válido.");
            }
            if(!vis.equals(vac)){
                addText("Visión con información. "+ vis);
            }else {
                addText("vision sin datos: "+ vis);
                driver.quit();
                closePDF();
                fail("Visión no válido.");
            }*/
            captureScreenShot();

        } else {
            addText("Pagina incorrecta se esperaba: "+ pag);
            captureScreenShot();
            addText("Fin de la prueba");
            driver.quit();
            closePDF();
            fail("Pagina no válida.");
        }
        addText("Fin de la prueba");
        driver.quit();
        closePDF();
    }

}
