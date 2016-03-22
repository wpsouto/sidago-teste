# language: pt

@all @ControleDeProdutosAgropecuarios @Produto

Funcionalidade: Testando as funcionalidade de Produto

  Cenário: 1-Fluxo Principal
    Dado Eu faco login no sistema com o CPF "administrador" USUARIO "Administrador" tela inicial "Produto"
    Quando Eu "insiro" um registro de "Produto"
    Então Eu recebo a mensagem "inserido" do "Produto"
    Quando Eu "altero" um registro de "Produto"
    Então Eu recebo a mensagem "alterado" do "Produto"


