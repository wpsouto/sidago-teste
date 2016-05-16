# language: pt

@all @ConcessaoDeDiarias @PrestacaoDeContas

Funcionalidade: Testando o Fluxo Principal de Prestação de Contas

  O servidor Presta conta da diaria

  Cenario: 1-Fluxo Principal
    Quando Eu faco login no sistema com o CPF "41201183472" USUARIO "Carla Giovanna Nunes de Farias Leite Coelho" tela inicial "Prestação de Contas"
    E Eu "altero" um registro de "Prestação de Contas"
    Então Eu recebo a mensagem "alterado" do "Prestação de Contas"




