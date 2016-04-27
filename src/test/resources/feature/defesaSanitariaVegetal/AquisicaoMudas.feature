# language: pt

@all @DefesaSanitariaVegetal @AquisicaoMudas

Funcionalidade: Testando as funcionalidades do Autorização para Aquisição de Mudas

  PRE-REQUISITOS:

  -Ja ter uma propriedade cadastrada

  Cenário de Fundo: Preparando o Sistema
    Dado Eu faco login no sistema com o CPF "administrador" USUARIO "Administrador" tela inicial "Autorização para Aquisição de Mudas"

  Cenário: 1-Fluxo Principal
    Quando Eu "insiro" um registro de "Autorização para Aquisição de Mudas"
    Então Eu recebo a mensagem "inserido" do "Autorização para Aquisição de Mudas"
    Quando Eu "aprovo" um registro de "Autorização para Aquisição de Mudas"
    Então Eu recebo a mensagem "aprovado" do "Autorização para Aquisição de Mudas"
