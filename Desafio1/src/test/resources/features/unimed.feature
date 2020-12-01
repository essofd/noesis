#language:pt

Funcionalidade: Validar apresentacao
	Como um usuario
	Eu quero realizar uma pesquisa de medicos
	Para que eu possa validar a apresentacao de resultados

Contexto:
	Dado que estou acessando a aplicacao
	E eu acesso a guia medico
	Quando realizo a pesquisa de medicos do Rio de Janeiro

Cenario: Deve validar a apresentacao de resultados com a Especialidade e cidade
	Entao deve apresentar os resultados com a especialidade e a cidade
	
Cenario: Deve validar nas paginas 1, 2 e 3 se nao apresentou nos resultados a cidade de Sao Paulo
	Entao nao deve apresentar a cidade de Sao Paulo nas 3 primeiras paginas