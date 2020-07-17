package test.sicredi.tests;

import org.junit.*;
import org.openqa.selenium.WebDriverException;
import java.io.IOException;

public class Runner extends PageObject {

    PageObject simuladorPO = new PageObject();

    @Test
    public void sucessoParaVoceAnos() throws IOException {
        simuladorPO.escolherDriver();
        simuladorPO.escolherPerfilParaVoce();
        simuladorPO.preencherValorAplicar("10000,00");
        simuladorPO.preencherValorInvestir("5000,00");
        simuladorPO.preencherTempo("2");
        simuladorPO.escolherAnos();
        simuladorPO.clicarSimular();
        simuladorPO.aguardar();
        simuladorPO.visualizarFormulario("Tempo (Meses) Valor");
    }

    @Test
    public void sucessoParaEmpresaMeses() throws IOException {
        simuladorPO.escolherDriver();
        simuladorPO.escolherPerfilParaEmpresa();
        simuladorPO.preencherValorAplicar("10000,00");
        simuladorPO.preencherValorInvestir("5000,00");
        simuladorPO.preencherTempo("24");
        simuladorPO.escolherMeses();
        simuladorPO.clicarSimular();
        simuladorPO.aguardar();
        simuladorPO.visualizarFormulario("Tempo (Meses) Valor");
    }

    @Test
    public void falhaValorMinimoAplicar() throws IOException {
        simuladorPO.escolherDriver();
        simuladorPO.preencherValorAplicar("10,00");
        simuladorPO.preencherValorInvestir("100,00");
        simuladorPO.visualizarErroAplicar("Valor mínimo de 20.00");
    }

    @Test
    public void falhaValorMinimoInvestir() throws IOException {
        simuladorPO.escolherDriver();
        simuladorPO.preencherValorAplicar("100,00");
        simuladorPO.preencherValorInvestir("10,00");
        simuladorPO.visualizarErroInvestir("Valor mínimo de 20.00");
    }

    @After
    public void CloseBrowser() throws WebDriverException {
        simuladorPO.fecharPagina();
    }

}
