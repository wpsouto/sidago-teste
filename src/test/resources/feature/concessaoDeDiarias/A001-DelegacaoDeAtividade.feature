# language: pt

@all @ConcessaoDeDiarias @DelegacaoDeAtividade

Funcionalidade: Testando o Fluxo Principal de Delegacao de Atividade

  O supervisor cria uma Delegacao de Atividade

  Cenario: 1-Fluxo Principal
    Dado Eu faco login no sistema com o CPF "97464210182" USUARIO "Antônio do Amaral Leal" tela inicial "Delegação de Atividades"
    Quando Eu "insiro" um registro de "Delegação de Atividades"
    Então Eu recebo a mensagem "inserido" do "Delegação de Atividades"
    Quando Eu "pesquiso" um registro de "Delegação de Atividades"




