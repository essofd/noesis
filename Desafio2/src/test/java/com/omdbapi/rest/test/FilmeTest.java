package com.omdbapi.rest.test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


import org.junit.Test;

import com.omdbapi.rest.core.BaseTest;

public class FilmeTest extends BaseTest{
	
	private String ID_DO_FILME="tt1285016";
	private String API_KEY="52ec71bf"; 
	
	@Test
	public void deveValidarDadosFilme() {
		System.out.println("========== Dados do Filme ================");
		given()
			.pathParam("id", ID_DO_FILME)
			.pathParam("key", API_KEY)
		.when()   
			.get("/?i={id}&apikey={key}")
		.then()  
			.log().all()
			.statusCode(200) 
			.body("Title",is("The Social Network"))
			.body("Year", is("2010"))
			.body("Language",is("English, French"))
		;
		
	}
	
	

	@Test
	public void devoRetornarErroFilmeInexistente() {
		
		//consulta do tipo:
		//http://www.omdbapi.com/?i=tt1285016&apikey=52ec71bf&t=filmeinexistente
		System.out.println("========== Filme Inexistente ================");
		
		given()
			.pathParam("id", ID_DO_FILME)
			.pathParam("key", API_KEY)
			.pathParam("movie", "filmeinexistente")
		.when()   
			.get("/?i={id}&apikey={key}&t={movie}")
		.then()  
			.log().all()
			.statusCode(200)
			.body("Response",is("False"))	
			.body("Error",is("Movie not found!"))
		;
	}
	
}
