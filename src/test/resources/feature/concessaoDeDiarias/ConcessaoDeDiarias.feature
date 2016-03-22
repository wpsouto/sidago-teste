# language: pt

@all @ConcessaoDeDiarias

Funcionalidade: Testando o Fluxo Principal de Concessao De Diarias

  O supervisor cria uma Delegacao de Atividade
  O servidor da Ciencia da atividade
  O gerente Assina a diaria
  O servidor Presta conta da diaria

  Cenario: 1-Fluxo Principal
#  O supervisor cria uma Delegacao de Atividade
    Dado Eu faco login no sistema com o CPF "97464210182" USUARIO "Antônio do Amaral Leal" tela inicial "Delegação de Atividades"
    Quando Eu "insiro" um registro de "Delegação de Atividades"
    Então Eu recebo a mensagem "inserido" do "Delegação de Atividades"
#  O servidor da Ciencia da atividade
    Quando Eu faco login no sistema com o CPF "41201183472" USUARIO "Carla Giovanna Nunes de Farias Leite Coelho" tela inicial "Ciência do Servidor"
    E Eu "confirmo" um registro de "Ciência do Servidor"
    Então Eu recebo a mensagem "confirmado" do "Ciência do Servidor"
#  O gerente Assina a diaria
    Quando Eu faco login no sistema com o CPF "04151457836" USUARIO "Arthur Eduardo Alves de Toledo" tela inicial "Assinatura de Diárias"
    E Eu "confirmo" um registro de "Assinatura de Diárias"
    Então Eu recebo a mensagem "confirmado" do "Assinatura de Diárias"
#  O servidor Presta conta da diaria
    Quando Eu faco login no sistema com o CPF "41201183472" USUARIO "Carla Giovanna Nunes de Farias Leite Coelho" tela inicial "Prestação de Contas"
    E Eu "confirmo" um registro de "Prestação de Contas"
    Então Eu recebo a mensagem "confirmado" do "Prestação de Contas"




