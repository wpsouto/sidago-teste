# language: pt

@all @CadastrosAgropecuarios @Empresa

Funcionalidade: Testando as funcionalidade de Empresa

  Cenário: 1-Fluxo Principal
    Dado Eu faco login no sistema com o CPF "administrador" USUARIO "Administrador" tela inicial "Empresa"
    Quando Eu "insiro" um registro de "Empresa"
    Então Eu recebo a mensagem "inserido" do "Empresa"
    Quando Eu "altero" um registro de "Empresa"
    Então Eu recebo a mensagem "alterado" do "Empresa"


