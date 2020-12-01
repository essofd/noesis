package com.omdbapi.rest.core;

import io.restassured.http.ContentType;


public interface Constantes {
	
	String APP_BASE_URL = "http://www.omdbapi.com"; 
	Integer APP_PORT = 80; //http --> 80, https-->443
	String APP_BASE_PATH = "";
	
	ContentType APP_CONTENT_TYPE = ContentType.JSON;
	
	Long MAX_TIMEOUT = 5000L;
	
	
}
