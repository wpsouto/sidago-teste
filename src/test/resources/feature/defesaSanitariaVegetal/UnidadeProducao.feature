# language: pt

@all @DefesaSanitariaVegetal @UnidadeProducao

Funcionalidade: Testando as funcionalidades do Unidade de Produção

  Cenário de Fundo: Preparando o Sistema
    Dado Eu faco login no sistema com o CPF "administrador" USUARIO "Administrador" tela inicial "Unidade de Produção"

  Cenário: 1-Fluxo Principal
    Quando Eu "insiro" um registro de "Unidade de Produção"
    Então Eu recebo a mensagem "inserido" do "Unidade de Produção"
    Quando Eu "altero" um registro de "Unidade de Produção"
    Então Eu recebo a mensagem "alterado" do "Unidade de Produção"
