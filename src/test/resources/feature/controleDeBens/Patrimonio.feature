# language: pt

@all @ControleDeBens @Patrimonio

Funcionalidade: Testando as funcionalidades do Patrimonio

  Cenário de Fundo: Preparando o Sistema
    Dado Eu faco login no sistema com o CPF "administrador" USUARIO "Administrador" tela inicial "Patrimonio"

  Cenário: 1-Fluxo Principal
    Quando Eu "insiro" um registro de "Patrimonio"
    Então Eu recebo a mensagem "inserido" do "Patrimonio"
    Quando Eu "altero" um registro de "Patrimonio"
    Então Eu recebo a mensagem "alterado" do "Patrimonio"
