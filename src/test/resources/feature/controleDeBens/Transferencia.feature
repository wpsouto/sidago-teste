# language: pt

@all @ControleDeBens @TransferenciaDeBens

Funcionalidade: Testando as funcionalidades do Transferencia de Bens

  Cenário de Fundo: Preparando o Sistema
    Dado Eu faco login no sistema com o CPF "administrador" USUARIO "Administrador" tela inicial "Transferencia"

  Cenário: 1-Fluxo Principal
    Quando Eu "insiro" um registro de "Transferencia"
    Então Eu recebo a mensagem "inserido" do "Transferencia"
    Quando Eu "confirmo" um registro de "Transferencia"
