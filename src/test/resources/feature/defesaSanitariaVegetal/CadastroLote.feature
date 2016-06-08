# language: pt

#@all @DefesaSanitariaVegetal @CadastroLote

Funcionalidade: Testando as funcionalidades do Cadastro de Lote

  Cenário de Fundo: Preparando o Sistema
    Dado Eu faco login no sistema com o CPF "administrador" USUARIO "Administrador" tela inicial "Cadastro de Lote"

  Cenário: 1-Fluxo Principal
    Quando Eu "insiro" um registro de "Cadastro de Lote"
    Então Eu recebo a mensagem "inserido" do "Cadastro de Lote"
    Quando Eu "altero" um registro de "Cadastro de Lote"
    Então Eu recebo a mensagem "alterado" do "Cadastro de Lote"
