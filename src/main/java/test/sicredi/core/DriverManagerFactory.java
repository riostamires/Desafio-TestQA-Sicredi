package test.sicredi.core;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManagerFactory implements Constantes {

    public static WebDriver driver;

    public By perfilParaVoce = By.cssSelector("input[value=paraVoce]");
    public By perfilParaEmpresa = By.cssSelector("input[value=paraEmpresa]");
    public By valorAplicar = By.id("valorAplicar");
    public By valorInvestir = By.id("valorInvestir");
    public By valorTempo = By.id("tempo");
    public By listaSelect = By.cssSelector(".btSelect");
    public By opcaoMeses = By.linkText("Meses");
    public By opcaoAnos = By.linkText("Anos");
    public By botaoSimular = By.xpath("//*[@id=\"formInvestimento\"]/div[5]/ul/li[2]/button");
    public By valorAplicarErro = By.id("valorAplicar-error");
    public By valorInvestirErro = By.id("valorInvestir-error");
    public By visualizarForm = By.xpath("/html/body/div[3]/div/div/div[1]/div/div[2]/div[1]");

    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", CHROMEDRIVER);
        driver = new ChromeDriver();
        driver.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
        return driver;
    }
}
