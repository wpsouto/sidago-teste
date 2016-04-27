# language: pt

@all @CadastrosAgropecuarios @Pessoa

Funcionalidade: Testando as funcionalidade de Pessoa

  Cenário: 1-Fluxo Principal
    Dado Eu faco login no sistema com o CPF "administrador" USUARIO "Administrador" tela inicial "Pessoa"
    Quando Eu "insiro" um registro de "Pessoa"
    Então Eu recebo a mensagem "inserido" do "Pessoa"
  #  Quando Eu "altero" um registro de "Pessoa"
  #  Então Eu recebo a mensagem "alterado" do "Pessoa"


