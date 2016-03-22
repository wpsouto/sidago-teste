# language: pt
@login

Funcionalidade: Teste de Login

Contexto:
  	Dado Navego para a aplicação SIDAGO

Delineacao do Cenario: Login com usuarios e senhas corretos

    Quando Eu tento fazer o login com Login '<login>' Senha '<senha>'
  	Então Eu deveria estar logado como '<nome>'
  	Então Eu saio do sistema

Exemplos:
	| nome			                 | login			| senha		|
	| Administrador	                 | administrador	| admin		|
	| Naiara Pedrozo de Fatima	     | 75276003149   	| admin		|
