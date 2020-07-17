package test.sicredi.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.sicredi.core.DriverManagerFactory;

import java.io.IOException;

import static org.junit.Assert.*;

public class PageObject extends DriverManagerFactory {
    DriverManagerFactory driverManager = new DriverManagerFactory();

    public void escolherDriver() {
        driver = driverManager.getDriver();
    }

    public void escolherPerfilParaVoce() {
        driver.findElement(perfilParaVoce).click();
    }

    public void escolherPerfilParaEmpresa() {
        driver.findElement(perfilParaEmpresa).click();
    }

    public String preencherValorAplicar(String valor) {
        driver.findElement(valorAplicar).sendKeys(valor);
        return valor;
    }

    public String preencherValorInvestir(String valor) {
        driver.findElement(valorInvestir).sendKeys(valor);
        return valor;
    }

    public String preencherTempo(String tempo) {
        driver.findElement(valorTempo).sendKeys(tempo);
        return tempo;
    }

    public void escolherMeses() {
        driver.findElement(listaSelect).click();
        driver.findElement(opcaoMeses).click();
    }

    public void escolherAnos() {
        driver.findElement(listaSelect).click();
        driver.findElement(opcaoAnos).click();
    }

    public void clicarSimular() {
        driver.findElement(botaoSimular).click();
    }

    public void aguardar() {
        new WebDriverWait(driver, 5).until(ExpectedConditions.
                elementToBeClickable((By.xpath("/html/body/div[3]/div/div/div[1]/div/div[2]"))));
    }

    public String visualizarFormulario(String mensagem) throws IOException {
        WebElement formulario = driver.findElement(visualizarForm);
        String resultado = formulario.getText();
        assertTrue(resultado.contains(mensagem));
        return mensagem;}


        public String visualizarErroAplicar(String mensagem){
            driver.findElement(valorTempo).click();
            String mensagemOrientacao = driver.findElement(valorAplicarErro).getText();
            assertEquals(mensagem, mensagemOrientacao);
            return mensagem;
        }

    public String visualizarErroInvestir(String mensagem){
        driver.findElement(valorTempo).click();
        String mensagemOrientacao = driver.findElement(valorInvestirErro).getText();
        assertEquals(mensagem, mensagemOrientacao);
        return mensagem;
    }

        public void fecharPagina () {
            driver.quit();
        }
    }

