# sidago-teste

## INSTALL
### LINUX
sudo apt-get install xvfb x11-xkb-utils xfonts-100dpi xfonts-75dpi xfonts-scalable xfonts-cyrillic x11-apps

Xvfb :99 -ac -screen 0 1024x768x8

### CENTOS
sudo yum install git
yum install xorg-X11-server-Xvfb
yum install firefox

## JENKINS
##### CONFIG
###### Plugins
```cmd
Cucumber-jvm reports
Git plugin
Maven Integration plugin
Xvfb plugin
Extensible Choice Parameter plugin
purge-job-history
```
###### REINICIAR
```cmd
cd /etc/init.d/
sudo ./jenkins stop
sudo ./jenkins start
```

###### Xvfb installation
![Xvfb installation]
(https://github.com/wpsouto/sidago-teste/raw/master/.README/xvfb_installation.png)

##### CRIAR PROJETO
###### Build parametrizado


```cmd
Name:
cucumber.options

Description:
Escolha um modulo para o Teste Automatizado

Choices:
--tags @all
.
........................FISCALIZACAO
--tags @TermoFiscalizacao
.
........................DEFESA SANITARIA VEGETAL
--tags @UnidadeProducao
--tags @UnidadeConsolidacao
--tags @AquisicaoMudas
.
........................DEFESA SANITARIA ANIMAL
--tags @BoletimProducao
.
........................DENUNCIA
--tags @AbrirDenuncia
.
........................CADASTROS AGROPECUARIOS
--tags @Pessoa
--tags @Propriedade
--tags @Empresa
--tags @EmpresaClassificacao
--tags @EmpresaForaGoias
--tags @Lavoura
.
........................CHAMADO
--tags @AbrirChamado
.
........................CONTROLE DE BENS
--tags @Almoxarifado
--tags @Material
--tags @Patrimonio
--tags @TransferenciaDeBens
.
........................CONTROLE DE PRODUTOS AGROPECUARIOS
--tags @IngredienteAtivo
--tags @Produto
```

![build e parametrizado]
(https://github.com/wpsouto/sidago-teste/raw/master/.README/build_parametrizado.png)

###### Gerenciador de codigo fonte
![Git]
(https://github.com/wpsouto/sidago-teste/raw/master/.README/git.png)

###### Ambiente de build
![Git]
(https://github.com/wpsouto/sidago-teste/raw/master/.README/ambiente_build.png)

###### build Maven
![Git]
(https://github.com/wpsouto/sidago-teste/raw/master/.README/build_maven.png)

###### Pos Build Cucumber-jvm
![Git]
(https://github.com/wpsouto/sidago-teste/raw/master/.README/pos_cucumber.png)
