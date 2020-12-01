package br.coop.unimed.steps;

import static br.coop.unimed.core.DriverFactory.getDriver;
import static br.coop.unimed.core.DriverFactory.killDriver;

import br.coop.unimed.page.GuiaMedicoPage;
import br.coop.unimed.page.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class unimedSteps {
	private String url = "https://www.unimed.coop.br/";
	HomePage page = new HomePage();
	GuiaMedicoPage guia = new GuiaMedicoPage();
	

	@Dado("que estou acessando a aplicacao")
	public void que_estou_acessando_a_aplicacao() {
		getDriver().get(url);

	}


	@Dado("eu acesso a guia medico")
	public void eu_acesso_a_guia_medico() {

		page.acessarGuiaMedico();

	}

	@Quando("realizo a pesquisa de medicos do Rio de Janeiro")
	public void realizo_a_pesquisa_de_medicos_do_Rio_de_Janeiro()  throws InterruptedException {

		guia.informarEspecialidade();
		guia.clicarPesquisar();
		guia.selecionarEstado();
		guia.selecionarCidade();
		guia.selecionarRegiao();
		guia.clicarContinuar();

	}
	

	@Entao("deve apresentar os resultados com a especialidade e a cidade")
	public void deve_apresentar_os_resultados_com_a_especialidade_e_a_cidade() throws Exception {

		guia.verificarCidadeEEspecialidade();

	}
	
	@Entao("nao deve apresentar a cidade de Sao Paulo nas {int} primeiras paginas")
	public void nao_deve_apresentar_a_cidade_de_Sao_Paulo_nas_primeiras_paginas(Integer int1) throws Exception {
		guia.verificarCidadeSaoPaulo();
	}


	@After
	public void tearDown() {
		killDriver();
	}
}

