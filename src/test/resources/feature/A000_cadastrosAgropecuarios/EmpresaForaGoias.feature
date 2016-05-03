# language: pt

@all @CadastrosAgropecuarios @EmpresaForaGoias

Funcionalidade: Testando as funcionalidade de Empresa Fora Goias

  Cenário: 1-Fluxo Principal
    Dado Eu faco login no sistema com o CPF "administrador" USUARIO "Administrador" tela inicial "Empresa-Fora Goiás"
    Quando Eu "insiro" um registro de "Empresa-Fora Goiás"
    Então Eu recebo a mensagem "inserido" do "Empresa-Fora Goiás"
    Quando Eu "altero" um registro de "Empresa-Fora Goiás"
    Então Eu recebo a mensagem "alterado" do "Empresa-Fora Goiás"


