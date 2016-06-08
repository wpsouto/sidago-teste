# language: pt

@all @Financeiro @Dare

Funcionalidade: Testando as funcionalidades do DARE

  Cenário de Fundo: Preparando o Sistema
    Dado Eu faco login no sistema com o CPF "administrador" USUARIO "Administrador" tela inicial "DARE"

  Cenário: 1-Fluxo Principal
    Quando Eu "insiro" um registro de "DARE"
    Então Eu recebo a mensagem "inserido" do "DARE"
    Quando Eu "pesquiso" um registro de "DARE"