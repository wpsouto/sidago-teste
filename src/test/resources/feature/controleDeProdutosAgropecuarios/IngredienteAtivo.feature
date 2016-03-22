# language: pt

@all @ControleDeProdutosAgropecuarios @IngredienteAtivo

Funcionalidade: Testando as funcionalidade de Ingrediente Ativo

  Cenário: 1-Fluxo Principal
    Dado Eu faco login no sistema com o CPF "administrador" USUARIO "Administrador" tela inicial "Ingrediente Ativo"
    Quando Eu "insiro" um registro de "Ingrediente Ativo"
    Então Eu recebo a mensagem "inserido" do "Ingrediente Ativo"
    Quando Eu "altero" um registro de "Ingrediente Ativo"
    Então Eu recebo a mensagem "alterado" do "Ingrediente Ativo"


