# language: pt

@all @CadastrosAgropecuarios @EmpresaClassificacao

Funcionalidade: Testando as funcionalidade de Empresa Classificacao

  Cenário: 1-Fluxo Principal
    Dado Eu faco login no sistema com o CPF "administrador" USUARIO "Administrador" tela inicial "Empresa Classificação"
    Quando Eu "insiro" um registro de "Empresa Classificação"
    Então Eu recebo a mensagem "inserido" do "Empresa Classificação"
    Quando Eu "altero" um registro de "Empresa Classificação"
    Então Eu recebo a mensagem "alterado" do "Empresa Classificação"


