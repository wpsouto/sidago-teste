# language: pt

@all @CadastrosAgropecuarios @Propriedade

Funcionalidade: Testando as funcionalidade de Propriedade

  Cenário: 1-Fluxo Principal
    Dado Eu faco login no sistema com o CPF "administrador" USUARIO "Administrador" tela inicial "Propriedade"
    Quando Eu "insiro" um registro de "Propriedade"
    Então Eu recebo a mensagem "inserido" do "Propriedade"
    Quando Eu "altero" um registro de "Propriedade"
    Então Eu recebo a mensagem "alterado" do "Propriedade"