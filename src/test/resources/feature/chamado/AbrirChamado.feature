# language: pt

@Chamado @Chamado @AbrirChamado

Funcionalidade: Testando as funcionalidades de Abrir Chamado

  Cenário de Fundo: Preparando o Sistema
    Dado Eu faco login no sistema com o CPF "administrador" USUARIO "Administrador" tela inicial "Abrir Chamado"

  Cenário: 1-Fluxo Principal
    Quando Eu "insiro" um registro de "Abrir Chamado"
    Então Eu recebo a mensagem "inserido" do "Abrir Chamado"