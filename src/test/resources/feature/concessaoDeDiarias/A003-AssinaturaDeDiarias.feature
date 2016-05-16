# language: pt

@all @ConcessaoDeDiarias @AssinaturaDeDiarias

Funcionalidade: Testando o Fluxo Principal de Assinatura de diarias

  O gerente Assina a diaria

  Cenario: 1-Fluxo Principal
    Quando Eu faco login no sistema com o CPF "04151457836" USUARIO "Arthur Eduardo Alves de Toledo" tela inicial "Assinatura de Diárias"
    E Eu "confirmo" um registro de "Assinatura de Diárias"
    Então Eu recebo a mensagem "confirmado" do "Assinatura de Diárias"




