# language: pt

@all @CadastrosAgropecuarios @Empresa

Funcionalidade: Testando as funcionalidade de Empresa

  Cenário de Fundo: Preparando o Sistema
    Dado Eu faco login no sistema com o CPF "administrador" USUARIO "Administrador" tela inicial "Empresa"

  Delineacao do Cenario: 1-Fluxo Principal
    Quando Eu insiro um registro de Empresa com a Classificacao: "<id>" "<classificacao>"
    Então Eu recebo a mensagem "inserido" do "Empresa"
    Quando Eu "altero" um registro de "Empresa"
    Então Eu recebo a mensagem "alterado" do "Empresa"
    Quando Eu aprovo um registro de Empresa

    Exemplos:
      | id  | classificacao         |
      |	56	|	ABATEDOURO - SIF	|
      |	59	|	SOCIEDADE HÍPICA - SINDICATO RURAL/ASSOCIAÇÃO	|
      |	60	|	PRESTADORA DE SERVIÇOS FITOSSANITÁRIOS -AVIAÇÃO AGRÍCOLA (CPF)	|
      |	62	|	CASA AGROPECUÁRIA - AGROTÓXICO	|
      |	63	|	CASA AGROPECUÁRIA - SEMENTES	|
      |	64	|	CERTIFICADORA	|
      |	65	|	CLUBE DE LAÇO - SINDICATO RURAL/ASSOCIAÇÃO	|
      |	68	|	MATERIAL DE MULTIPLICAÇÃO ANIMAL	|
      |	69	|	CONFINAMENTO	|
      |	70	|	CRIATÓRIO DE ANIMAIS SILVESTRES E EXÓTICOS	|
      |	71	|	DEPÓSITO DE AGROTÓXICOS	|
      |	72	|	SIE - ENTREPOSTO OVOS	|
      |	73	|	SIE - ENTREPOSTO OU ABATEDOURO DE PESCADO	|
      |	74	|	EXPOSIÇÃO AGROPECUÁRIA - SINDICATO RURAL/ASSOCIAÇÃO	|
      |	75	|	SIE - FÁBRICA DE PRODUTOS CÁRNEOS	|
      |	76	|	GRANJA SUÍNA	|
      |	77	|	GRANJA AVÍCOLA - CNPJ	|
      |	78	|	HARAS - SINDICATO RURAL/ASSOCIAÇÃO	|
      |	80	|	INCUBATORIO	|
      |	81	|	SIE - INDÚSTRIA DE PRODUTOS NÃO COMESTÍVEIS	|
      |	85	|	SIE - LATICÍNIOS	|
      |	86	|	LEILÃO - SINDICATO RURAL/ASSOCIAÇÃO	|
      |	87	|	PRESTADORA SERVIÇOS FITOSSANITÁRIOS	|
      |	88	|	PROCESSADORA DE TOMATES	|
      |	89	|	PRODUÇÃO DE AGENTE BIOLÓGICO DE CONTROLE	|
      |	90	|	PROMOTORA DE EVENTOS - SINDICATO RURAL/ASSOCIAÇÃO	|
      |	91	|	RODEIO - SINDICATO RURAL/ASSOCIAÇÃO	|
      |	92	|	TORNEIO LEITEIRO - SINDICATO RURAL/ASSOCIAÇÃO	|
      |	93	|	UNIDADE DE RECEBIMENTO EMBALAGENS VAZIAS DE AGROTÓXICOS	|
      |	95	|	VAQUEJADA - SINDICATO RURAL/ASSOCIAÇÃO	|
      |	96	|	COMERCIANTE DE MUDAS (CNPJ)	|
      |	97	|	CASA AGROPECUÁRIA - PRODUTOS VETERINARIOS	|
      |	100	|	SIE - ENTREPOSTO DE MEL	|
      |	101	|	SIE - FÁBRICA DE PRODUTOS CÁRNEOS - AGRICULTURA FAMILIAR (CPF)	|
      |	102	|	GRANJA AVÍCOLA - CPF	|
      |	104	|	ENTREPOSTO OU ABATEDOURO DE PESCADO - SIF	|
      |	105	|	ENTREPOSTO OU ABATEDOURO DE PESCADO - SIM	|
      |	106	|	LATICÍNIOS - SIF	|
      |	107	|	FEIRA - SINDICATO RURAL/ASSOCIAÇÃO	|
      |	108	|	LEILÃO - EMPRESA PRIVADA	|
      |	109	|	CLUBE DE LAÇO - EMPRESA PRIVADA	|
      |	110	|	CLUBE DE LAÇO - PREFEITURA	|
      |	111	|	EXPOSIÇÃO AGROPECUÁRIA - EMPRESA PRIVADA	|
      |	112	|	EXPOSIÇÃO AGROPECUÁRIA - PREFEITURA	|
      |	113	|	FEIRA - EMPRESA PRIVADA	|
      |	114	|	FEIRA - PREFEITURA	|
      |	115	|	HARAS - EMPRESA PRIVADA	|
      |	116	|	HARAS - PREFEITURA	|
      |	117	|	PROMOTORA DE EVENTOS - EMPRESA PRIVADA	|
      |	118	|	PROMOTORA DE EVENTOS - PREFEITURA	|
      |	119	|	RODEIO - EMPRESA PRIVADA	|
      |	120	|	RODEIO - PREFEITURA	|
      |	121	|	SOCIEDADE HÍPICA - EMPRESA PRIVADA	|
      |	122	|	SOCIEDADE HÍPICA - PREFEITURA	|
      |	123	|	TORNEIO LEITEIRO - EMPRESA PRIVADA	|
      |	124	|	TORNEIO LEITEIRO - PREFEITURA	|
      |	125	|	VAQUEJADA - EMPRESA PRIVADA	|
      |	126	|	VAQUEJADA - PREFEITURA	|
      |	127	|	SIE - ENTREPOSTO DE LATICÍNIOS	|
      |	128	|	CASA AGROPECUÁRIA - AGROTÓXICOS E SEMENTES	|
      |	129	|	CASA AGROPECUÁRIA - PRODUTOS VETERINÁRIOS - AGROTÓXICOS E SEMENTES	|
      |	130	|	CASA AGROPECUARIA - PRODUTOS VETERINARIOS E SEMENTES	|
      |	131	|	CASA AGROPECUÁRIA - PRODUTOS VETERINÁRIOS - AGROTÓXICOS	|
      |	133	|	SIE - ENTREPOSTO DE CARNES E DERIVADOS (TRIPARIA)	|
      |	134	|	PRESTADORA DE SERVIÇOS FITOSSANITÁRIOS  E COMÉRCIO DE AGROTÓXICOS	|
      |	135	|	PROCESSADORA DE TOMATES COM  REPASSE DE AGROTÓXICOS	|
      |	136	|	DEPÓSITO DE PRODUTOS VETERINÁRIOS  E AGROTÓXICOS	|
      |	137	|	DEPÓSITO DE AGROTÓXICOS E SEMENTES	|
      |	138	|	COMERCIANTE DE MUDAS E PRESTADORA DE SERVIÇOS FITOSSANITÁRIOS	|
      |	139	|	PRODUÇÃO DE AGENTE DE CONTROLE BIOLÓGICO	|
      |	143	|	CASA ATACADISTA DE PRODUTOS DE ORIGEM ANIMAL	|
      |	144	|	PRESTADORA DE SERVIÇOS FITOSSANITÁRIOS - AVIAÇÃO AGRÍCOLA	|
      |	145	|	COMERCIANTE DE MUDAS (CPF)	|
      |	146	|	SIE - LATICÍNIO - AGRICULTURA FAMILIAR (CPF)	|
      |	148	|	AÇOUGUE	|
      |	149	|	LEILÃO - PREFEITURA	|
      |	150	|	ABATEDOURO - SIM	|
      |	151	|	HIPÓDROMO - SINDICATO RURAL/ASSOCIAÇÃO	|
      |	152	|	CENTRO DE DISTRIBUIÇÃO DE AGROTÓXICOS	|
      |	154	|	COMERCIANTE DE SEMENTES E MUDAS CPF	|