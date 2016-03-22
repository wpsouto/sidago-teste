# language: pt
@all @ControleDeBens @Material

Funcionalidade: Testando as funcionalidades do Material

  Cenário de Fundo: Preparando o Sistema
    Dado Eu faco login no sistema com o CPF "administrador" USUARIO "Administrador" tela inicial "Material"

  Cenário: 1-Fluxo Principal
    Quando Eu "insiro" um registro de "Material"
    Então Eu recebo a mensagem "inserido" do "Material"
    Quando Eu "altero" um registro de "Material"
    Então Eu recebo a mensagem "alterado" do "Material"

  Cenario: 2-Fluxo Alternativo -Todos os campos em branco
    Quando Eu insiro um novo registro de Material em branco
    Então Recebo a mensagem de Validacao
