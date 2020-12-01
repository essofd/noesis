package lojista.tests;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LojistaTest {
	// LISTA DE VALORES
	private int[] carrinho = { 1, 2, 3, 4, 5, 6 };
	private String[] genero = { "FANASIA", "COMEDIA", "ACAO", "ACAO", "DRAMA", "ANIMACAO" };
	private Double[] valor = { 45.00, 55.00, 100.00, 55.00, 100.00, 200.00 };
	private Double valorTotal = 0.0;
	private Double valorDescontoGenero = 0.0;
	private Boolean descontoGeneroAcao=false;

	@Test
	public void deveCalcularDesconto10PorcentoValorAcima100EAbaixoDe200() {
		double valorTotalComDesconto = 0.0;
		double valorEsperadoComDesconto=123.25;
		
		//informando valores de compra R$ 45.00 e 100.00 (FANTASIA e AÇÃO)
		//45+100= 145*0.85 = R$ 123,25
		
		valorTotalComDesconto = calcularTotalComDesconto(valor[0], carrinho[0]);
		valorTotalComDesconto = calcularTotalComDesconto(valor[2], carrinho[2]);
		
		if (descontoGeneroAcao){
			valorDescontoGenero = valorTotal * 0.05;
		}
		valorTotalComDesconto-=valorDescontoGenero;
 		
 		System.out.println("===== DESCONTO 10 PORCENTO VALOR ACIMA DE 100 E ABAIXO DE 200 ==========");
 		
 		System.out.println("VALOR TOTAL COM DESCONTO ====>"+valorTotalComDesconto);
 		
 		System.out.println("");
 	
		assertEquals(valorEsperadoComDesconto, valorTotalComDesconto, 0.002);
		
	}
	
	@Test
	public void deveCalcularDesconto20PorcentoValorAcima200EAbaixoDe300() {
		double valorTotalComDesconto = 0.0;
		double valorEsperadoComDesconto=240.0;
		
		//informando valores de compra R$ 100.00 e 200.00 (DRAMA E ANIMACAO)
		//100+200= 300*0.8 = R$ 240,00
		
		valorTotalComDesconto = calcularTotalComDesconto(valor[4], carrinho[4]);
		valorTotalComDesconto = calcularTotalComDesconto(valor[5], carrinho[5]);
		
		if (descontoGeneroAcao){
			valorDescontoGenero = valorTotal * 0.05;
		}
		valorTotalComDesconto-=valorDescontoGenero;
 		
 		System.out.println("===== DESCONTO 20 PORCENTO VALOR ACIMA DE 200 E ABAIXO DE 300 ==========");
 		
 		System.out.println("VALOR TOTAL COM DESCONTO ====>"+valorTotalComDesconto);
		
 		System.out.println("");
		
 		assertEquals(valorEsperadoComDesconto, valorTotalComDesconto, 0.002);
		
	}
	
	@Test
	public void deveCalcularDesconto25PorcentoValorAcima300EAbaixoDe400() {
		double valorTotalComDesconto = 0.0;
		double valorEsperadoComDesconto=280.0;
		
		//informando valores de compra R$ 100.00, R$ 100.00 e R$ 200.00 (AÇÂO, DRAMA E ANIMACAO)
		//100+100+200= 400*0.7 = R$ 280,00
		
		valorTotalComDesconto = calcularTotalComDesconto(valor[2], carrinho[2]);
		valorTotalComDesconto = calcularTotalComDesconto(valor[4], carrinho[4]);
		valorTotalComDesconto = calcularTotalComDesconto(valor[5], carrinho[5]);
		
		if (descontoGeneroAcao){
			valorDescontoGenero = valorTotal * 0.05;
		}
		valorTotalComDesconto-=valorDescontoGenero;

 	
 		System.out.println("===== DESCONTO 25 PORCENTO VALOR ACIMA DE 300 E ABAIXO DE 400 ==========");
 		
 		System.out.println("VALOR TOTAL COM DESCONTO ====>"+valorTotalComDesconto);
 		
		System.out.println("");
		
		assertEquals(valorEsperadoComDesconto, valorTotalComDesconto, 0.002);
		
	}
	
	@Test
	public void deveCalcularDesconto30PorcentoValorAcima400() {
		double valorTotalComDesconto = 0.0;
		double valorEsperadoComDesconto=360.75;
		
		//informando valores de TODOS os itens
		//45+55+100+55+100+200= 555*0.65 = R$ 360,75
		
		valorTotalComDesconto = calcularTotalComDesconto(valor[0], carrinho[0]);
		valorTotalComDesconto = calcularTotalComDesconto(valor[1], carrinho[1]);
		valorTotalComDesconto = calcularTotalComDesconto(valor[2], carrinho[2]);
		valorTotalComDesconto = calcularTotalComDesconto(valor[3], carrinho[3]);
		valorTotalComDesconto = calcularTotalComDesconto(valor[4], carrinho[4]);
		valorTotalComDesconto = calcularTotalComDesconto(valor[5], carrinho[5]);
		
		if (descontoGeneroAcao){
			valorDescontoGenero = valorTotal * 0.05;
		}
		valorTotalComDesconto-=valorDescontoGenero;
 		
 		System.out.println("===== DESCONTO 30 PORCENTO VALOR ACIMA DE 400 ==========");
 		
 		System.out.println("VALOR TOTAL COM DESCONTO ====>"+valorTotalComDesconto);
 	
		assertEquals(valorEsperadoComDesconto, valorTotalComDesconto, 0.002);
		
	}

	public double calcularTotalComDesconto(double valorCompra, int Filme) {
		double valorDesconto = 0.0;

		valorTotal += valorCompra;

		if ((valorTotal > 100.00) && (valorTotal <= 200.00)) {
			valorDesconto = valorTotal * 0.10;
		}
		if ((valorTotal > 200.00) && (valorTotal <= 300.00)) {
			valorDesconto = valorTotal * 0.20;
		}
		if ((valorTotal > 300.00) && (valorTotal <= 400.00)) {
			valorDesconto = valorTotal * 0.25;
		}
		if (valorTotal > 400.00) {
			valorDesconto = valorTotal * 0.30;
		}
		if (genero[Filme - 1] == "ACAO") { // filmes do genero Ação
			descontoGeneroAcao=true;
		}

		return valorTotal - valorDesconto;
	
	}

}
