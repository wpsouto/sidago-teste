# language: pt

@all @Denuncia @AbrirDenuncia

Funcionalidade: Testando as funcionalidades do Patrimonio

  Cenário de Fundo: Preparando o Sistema
    Dado Eu faco login no sistema com o CPF "administrador" USUARIO "Administrador" tela inicial "Abrir Denúncia"

  Cenário: 1-Fluxo Principal
    Quando Eu "insiro" um registro de "Abrir Denúncia"
    Então Eu recebo a mensagem "inserido" do "Abrir Denúncia"
    Quando Eu "altero" um registro de "Abrir Denúncia"
    Então Eu recebo a mensagem "alterado" do "Abrir Denúncia"
