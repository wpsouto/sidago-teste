# language: pt

#@all @CadastrosAgropecuarios @Empresa

Funcionalidade: Testando as funcionalidade de Empresa

  Cenário de Fundo: Preparando o Sistema
    Dado Eu faco login no sistema com o CPF "administrador" USUARIO "Administrador" tela inicial "Empresa"

  Delineacao do Cenario: 1-Fluxo Principal
    Quando Eu insiro um registro de Empresa com a Classificacao: "<id>" "<classificacao>"
    Então Eu recebo a mensagem "inserido" do "Empresa"
    Quando Eu "altero" um registro de "Empresa"
    Então Eu recebo a mensagem "alterado" do "Empresa"
    Quando Eu "aprovo" um registro de "Empresa"

    Exemplos:
      | id  | classificacao                                                |
      |56   |ABATEDOURO - SIF                                              |
      |62   |CASA AGROPECUÁRIA - AGROTÓXICO                                |
      |97   |CASA AGROPECUÁRIA - PRODUTOS VETERINARIOS                     |
      |63   |CASA AGROPECUÁRIA - SEMENTES                                  |
      |152  |CENTRO DE DISTRIBUIÇÃO DE AGROTÓXICOS                         |
      |64   |CERTIFICADORA                                                 |
      |109  |CLUBE DE LAÇO - EMPRESA PRIVADA                               |
      |96   |COMERCIANTE DE MUDAS (CNPJ)                                   |
      |69   |CONFINAMENTO                                                  |
      |70   |CRIATÓRIO DE ANIMAIS SILVESTRES E EXÓTICOS                    |
      |71   |DEPÓSITO DE AGROTÓXICOS                                       |
      |76   |GRANJA SUÍNA                                                  |
      |80   |INCUBATORIO                                                   |
      |87   |PRESTADORA SERVIÇOS FITOSSANITÁRIOS                           |
      |88   |PROCESSADORA DE TOMATES                                       |
      |139  |PRODUÇÃO DE AGENTE DE CONTROLE BIOLÓGICO                      |
      |133  |SIE - ENTREPOSTO DE CARNES E DERIVADOS (TRIPARIA)             |
      |127  |SIE - ENTREPOSTO DE LATICÍNIOS                                |
      |100  |SIE - ENTREPOSTO DE MEL                                       |
      |73   |SIE - ENTREPOSTO OU ABATEDOURO DE PESCADO                     |
      |72   |SIE - ENTREPOSTO OVOS                                         |
      |75   |SIE - FÁBRICA DE PRODUTOS CÁRNEOS                             |
      |81   |SIE - INDÚSTRIA DE PRODUTOS NÃO COMESTÍVEIS                   |
      |85   |SIE - LATICÍNIOS                                              |
      |93   |UNIDADE DE RECEBIMENTO EMBALAGENS VAZIAS DE AGROTÓXICOS       |