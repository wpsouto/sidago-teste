# language: pt

@all @DefesaSanitariaVegetal @UnidadeConsolidacao

Funcionalidade: Testando as funcionalidades do Unidade Consolidação

  Cenário de Fundo: Preparando o Sistema
    Dado Eu faco login no sistema com o CPF "administrador" USUARIO "Administrador" tela inicial "Unidade Consolidação"

  Cenário: 1-Fluxo Principal
    Quando Eu "insiro" um registro de "Unidade Consolidação"
    Então Eu recebo a mensagem "inserido" do "Unidade Consolidação"
    Quando Eu "altero" um registro de "Unidade Consolidação"
    Então Eu recebo a mensagem "alterado" do "Unidade Consolidação"
