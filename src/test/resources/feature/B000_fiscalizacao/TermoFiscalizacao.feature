# language: pt

@all @Fiscalizacao @TermoFiscalizacao

Funcionalidade: Testando as funcionalidades do Termo de Fiscalização

  Cenário de Fundo: Preparando o Sistema
    Dado Eu faco login no sistema com o CPF "administrador" USUARIO "Administrador" tela inicial "Termo de Fiscalização"

  Cenário: 1-Fluxo Principal
    Quando Eu "insiro" um registro de "Termo de Fiscalização"
    Então Eu recebo a mensagem "inserido" do "Termo de Fiscalização"
    Quando Eu "pesquiso" um registro de "Termo de Fiscalização"
