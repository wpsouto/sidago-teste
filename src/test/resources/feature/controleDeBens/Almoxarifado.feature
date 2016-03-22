# language: pt

@all @ControleDeBens @Almoxarifado

Funcionalidade: Testando as funcionalidade de Almoxarifado

  Cenário: 1-Fluxo Principal do cadastro de Almoxarifado
    Dado Eu faco login no sistema com o CPF "administrador" USUARIO "Administrador" tela inicial "Almoxarifado"
    Quando Eu "insiro" um registro de "Almoxarifado"
    Então Eu recebo a mensagem "inserido" do "Almoxarifado"
    Quando Eu "altero" um registro de "Almoxarifado"
    Então Eu recebo a mensagem "alterado" do "Almoxarifado"


