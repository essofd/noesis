package br.coop.unimed.page;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;

import br.coop.unimed.core.BasePage;

public class GuiaMedicoPage extends BasePage {
	
	public void fecharCookies() {
		
		clicarBotao("closeModalLGPD");
	}

	public void informarEspecialidade() {
		aguardarPorElemento(By.id("titulo_o_que_voce_procura"));
		escrever("campo_pesquisa", "cardiologia");
	}

	public void clicarPesquisar() {
		aguardarPorElemento(By.id("btn_pesquisar"));
		clicarBotao("btn_pesquisar");
	}

	public void selecionarEstado() throws InterruptedException {

		//clica na pesquisa da combo
		clicarElemento(By.xpath(
				"*//form/div/div[@class='s-field control-group selecione-rede big-field pesquisa-avancada']/div/div/div[@class='css-1wy0on6']"));
		
		//pausa
		//pausar(2000);
		
		//clica no Estado do Rio de Janeiro
		clicarElemento(By.id("react-select-2-option-18"));
		
		//pausa
		//pausar(3000);
	}

	public void selecionarCidade() throws InterruptedException {

		//clica na pesquisa da combo
		clicarElemento(By.xpath(
				"*//form/div/div[@class='s-field control-group selecione-plano big-field pesquisa-avancada']/div/div/div[@class='css-1wy0on6']"));
		
		//pausa
		//pausar(3000);
		
		//clica na cidade do Rio de Janeiro
		clicarElemento(By.id("react-select-3-option-67"));
		
		//pausa
		//pausar(3000);

	}

	public void selecionarRegiao() throws InterruptedException {
		//clicarElemento(By.xpath("*//form/label/div/input[@value='37']"));
		clicarElemento(By.xpath("*//div[contains(text(),'UNIMED RIO')]/../div/input"));
		//pausar(2000);
	}

	public void clicarContinuar() {
		clicarBotaoPorTexto("Continuar");
	}

	public void verificarCidadeEEspecialidade() throws Exception {

		// Aguarda pela paginação
		aguardarPorElemento(By.xpath("*//a[contains(text(),'1')]"));
		
		// Validação pela Cidade
		assertTrue(buscarPorTextoNaPagina("RJ"));
		
		// Validação pela Especialidade
		assertTrue(buscarPorTextoNaPagina("Cardiologia"));
		
		

	}

	public void verificarCidadeSaoPaulo() throws Exception {
		int pagina;

		for (int j = 1; j <= 3; j++) {
			
			// Aguarda carregar toda a pagina
			aguardarPorElemento(By.xpath("//*[@id='menuAcessoRapido']/div/ul[1]/li/a"));
			
			//faz busca na página por ocorrencias pela cidade de São Paulo
			assertFalse(buscarPorTextoNaPagina("São Paulo"));

			if (j < 3) {
				// clica na pagina seguinte
				pagina=j+1;

				clicarNoLinkJavaScript("*//a[contains(text(),'"+Integer.toString(pagina)+"')]");
				
			}
		}

	}

}




