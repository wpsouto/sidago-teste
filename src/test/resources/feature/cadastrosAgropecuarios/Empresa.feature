# language: pt

@all @CadastrosAgropecuarios @Empresa

Funcionalidade: Testando as funcionalidade de Empresa

  Cenário de Fundo: Preparando o Sistema
    Dado Eu faco login no sistema com o CPF "administrador" USUARIO "Administrador" tela inicial "Empresa"

  Delineacao do Cenario: 2-Fluxo Alternativo -Validar Aprovação de Empresa
    Quando Eu altero a a Classificao da Empresa para: "<id>" "<classificacao>"
    Então Eu recebo a mensagem "alterado" do "Empresa"
    Quando Eu aprovo um registro de Empresa

    Exemplos:
      | id  | classificacao                                                |
      |56   |ABATEDOURO - SIF                                              |