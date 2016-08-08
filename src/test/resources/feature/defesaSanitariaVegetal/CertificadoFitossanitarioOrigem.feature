# language: pt

@all @DefesaSanitariaVegetal @CertificadoFitossanitarioOrigem

Funcionalidade: Testando as funcionalidades do Certificado Fitossanitário de Origem

  Cenário de Fundo: Preparando o Sistema
    Dado Eu faco login no sistema com o CPF "42089077387" USUARIO "LUDIMAR SOARES DOS SANTOS" tela inicial "Certificado Fitossanitário de Origem"

  Cenário: 1-Fluxo Principal
    Quando Eu "insiro" um registro de "Certificado Fitossanitário de Origem"
    Então Eu recebo a mensagem "inserido" do "Certificado Fitossanitário de Origem"