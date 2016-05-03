# language: pt

@all @CadastrosAgropecuarios @Lavoura

Funcionalidade: Testando as funcionalidade de Lavoura

  Cenário: 1-Fluxo Principal
    Dado Eu faco login no sistema com o CPF "13499050110" USUARIO "Otacílio Ferreira Garcia" tela inicial "Lavoura"
    Quando Eu "insiro" um registro de "Lavoura"
    Então Eu recebo a mensagem "inserido" do "Lavoura"