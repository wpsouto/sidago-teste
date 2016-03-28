# sidago-teste

## LINUX CONFIG
sudo apt-get install xvfb x11-xkb-utils xfonts-100dpi xfonts-75dpi xfonts-scalable xfonts-cyrillic x11-apps

Xvfb :99 -ac -screen 0 1024x768x8

- Plugins: purge-job-history, xvfb

## JENKINS

###### REINICIAR
```cmd
cd /etc/init.d/
sudo ./jenkins stop
sudo ./jenkins start
```

##### CRIAR PROJETO
###### Build parametrizado


```cmd
Name:
cucumber.options

Description:
Escolha um modulo para o Teste Automatizado

Choices:
---------MODULOS---------------------------
--tags @all
--tags @CadastrosAgropecuarios
--tags @Chamado
--tags @ConcessaoDeDiarias
--tags @ControleDeBens
--tags @ControleDeProdutosAgropecuarios
---------APLICATIVOS------------------------
--tags @Propriedade
--tags @Empresa
--tags @EmpresaClassificacao
--tags @EmpresaForaGoias
--tags @Lavoura
--tags @AbrirChamado
--tags @Almoxarifado
--tags @Material
--tags @Patrimonio
--tags @TransferenciaDeBens
--tags @IngredienteAtivo
--tags @Produto
```

There is a feature overview page:

![feature overview page]
(https://github.com/damianszczepanik/cucumber-reporting/raw/master/.README/feature-overview.png)
