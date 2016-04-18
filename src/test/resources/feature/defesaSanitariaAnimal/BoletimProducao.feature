# language: pt

@all @DefesaSanitariaAnimal @BoletimProducao

Funcionalidade: Testando as funcionalidades do Boletim de Producao

  Cenário de Fundo: Preparando o Sistema
    Dado Eu faco login no sistema com o CPF "administrador" USUARIO "Administrador" tela inicial "Boletim de Produção"

  Cenário: 1-Fluxo Principal
    Quando Eu "insiro" um registro de "Boletim de Produção"
    Então Eu recebo a mensagem "inserido" do "Boletim de Produção"
    Quando Eu "cancelo" um registro de "Boletim de Produção"
    Então Eu recebo a mensagem "cancelado" do "Boletim de Produção"
