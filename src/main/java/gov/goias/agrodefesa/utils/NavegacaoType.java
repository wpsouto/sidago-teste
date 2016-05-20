package gov.goias.agrodefesa.utils;

import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.navigation.NavigationEmpresa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.navigation.NavigationEmpresaClassificacao;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.navigation.NavigationEmpresaForaGoias;
import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.navigation.NavigationLavoura;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.navigation.NavigationPessoa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.navigation.NavigationPropriedade;
import gov.goias.agrodefesa.chamado.abrirChamado.navigation.NavigationAbrirChamado;
import gov.goias.agrodefesa.concessaoDeDiarias.assinaturaDeDiarias.navigation.NavigationAssinaturaDeDiarias;
import gov.goias.agrodefesa.concessaoDeDiarias.cienciaDoServidor.navigation.NavigationCienciaDoServidor;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.navigation.NavigationDelegacaoDeAtividades;
import gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.navigation.NavigationPrestacaoDeContas;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.navigation.NavigationAlmoxarifado;
import gov.goias.agrodefesa.controleDeBens.material.navigation.NavigationMaterial;
import gov.goias.agrodefesa.controleDeBens.patrimonio.navigation.NavigationPatrimonio;
import gov.goias.agrodefesa.controleDeBens.transferencia.navigation.NavigationTransferencia;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.navigation.NavigationIngredienteAtivo;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.navigation.NavigationProduto;
import gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.navigation.NavigationBoletimProducao;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.navigation.NavigationAquisicaoMudas;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.navigation.NavigationCadastroLote;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.navigation.NavigationUnidadeConsolidacao;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.navigation.NavigationUnidadeProducao;
import gov.goias.agrodefesa.denuncia.abrirDenuncia.entity.AbrirDenuncia;
import gov.goias.agrodefesa.denuncia.abrirDenuncia.navigation.NavigationAbrirDenuncia;
import gov.goias.agrodefesa.denuncia.abrirDenuncia.view.AbrirDenunciaViewEdit;
import gov.goias.agrodefesa.denuncia.abrirDenuncia.view.AbrirDenunciaViewHome;
import gov.goias.agrodefesa.denuncia.abrirDenuncia.view.AbrirDenunciaViewInsert;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.navigation.NavigationTermoFiscalizacao;

/**
 * Created by Wemerson on 10/03/16.
 *
 */
public class NavegacaoType {
    public static final String HTTP_BASE = "http://qa.agrodefesa.go.gov.br/";
    //public static final String HTTP_BASE = "http://10.50.1.15/";

    public static final String CHAMADO = "chamado/";
    public static final NavegacaoType ABRIR_CHAMADO;

    public static final String CONTROLE_BENS = "controle-bens/";
    public static final NavegacaoType ALMOXARIFADO;
    public static final NavegacaoType MATERIAL;
    public static final NavegacaoType PATRIMONIO;
    public static final NavegacaoType TRANSFERENCIA_BENS;

    public static final String CONCESSAO_DE_DIARIAS = "diaria/";
    public static final NavegacaoType DELEGACAO_DE_ATIVIDADES;
    public static final NavegacaoType CIENCIA_DO_SERVIDOR;
    public static final NavegacaoType ASSINATURA_DE_DIARIAS;
    public static final NavegacaoType PRESTACAO_DE_CONTAS;

    public static final String CONTROLE_DE_PRODUTOS_AGROPECUARIOS = "produtos/";
    public static final NavegacaoType INGREDIENTE_ATIVO;
    public static final NavegacaoType PRODUTO;

    public static final String CADASTROS_AGROPECUARIOS = "cadastros-agropecuarios/";
    public static final NavegacaoType EMPRESA;
    public static final NavegacaoType EMPRESA_CLASSIFICACAO;
    public static final NavegacaoType EMPRESA_FORA_GOIAS;
    public static final NavegacaoType PESSOA;
    public static final NavegacaoType PROPRIEDADE;
    public static final NavegacaoType LAVOURA;

    public static final String DENUNCIA = "denuncia/";
    public static final NavegacaoType ABRIR_DENUNCIA;

    public static final String DEFESA_SANITARIA_ANIMAL = "defesa-sanitaria-animal/";
    public static final NavegacaoType BOLETIM_PRODUCAO;

    public static final String DEFESA_SANITARIA_VEGETAL = "gtv/";
    public static final NavegacaoType AQUISICAO_MUDAS;
    public static final NavegacaoType UNIDADE_CONSOLIDACAO;
    public static final NavegacaoType CADASTRO_LOTE;
    public static final NavegacaoType UNIDADE_PRODUCAO;

    public static final String FISCALIZACAO = "fiscalizacao/";
    public static final NavegacaoType TERMO_FISCALIZACAO;

    static {
        //CONTROLE_BENS
        ALMOXARIFADO = create("almoxarifado", CONTROLE_BENS, "almoxarifado", NavigationAlmoxarifado.class);
        MATERIAL = create("material", CONTROLE_BENS, "material", NavigationMaterial.class);
        PATRIMONIO = create("patrimonio", CONTROLE_BENS, "patrimonio", NavigationPatrimonio.class);
        TRANSFERENCIA_BENS = create("transferencia", CONTROLE_BENS, "controle-movimentacao", NavigationTransferencia.class);

        //CHAMADO
        ABRIR_CHAMADO = create("Abrir Chamado", CHAMADO, "abrir-chamado", NavigationAbrirChamado.class);

        //CONCESSAO_DE_DIARIAS
        DELEGACAO_DE_ATIVIDADES = create("Delegação de Atividades", CONCESSAO_DE_DIARIAS, "diaria", NavigationDelegacaoDeAtividades.class);
        CIENCIA_DO_SERVIDOR = create("Ciência do Servidor", CONCESSAO_DE_DIARIAS, "ciencia", NavigationCienciaDoServidor.class);
        ASSINATURA_DE_DIARIAS = create("Assinatura de Diárias", CONCESSAO_DE_DIARIAS, "assinar/assinar", NavigationAssinaturaDeDiarias.class);
        PRESTACAO_DE_CONTAS = create("Prestação de Contas", CONCESSAO_DE_DIARIAS, "prestacao", NavigationPrestacaoDeContas.class);

        //CONTROLE_DE_PRODUTOS_AGROPECUARIOS
        INGREDIENTE_ATIVO = create("Ingrediente Ativo", CONTROLE_DE_PRODUTOS_AGROPECUARIOS, "ingrediente-ativo", NavigationIngredienteAtivo.class);
        PRODUTO = create("Produto", CONTROLE_DE_PRODUTOS_AGROPECUARIOS, "produto", NavigationProduto.class);

        //CADASTROS_AGROPECUARIOS
        EMPRESA = create("Empresa", CADASTROS_AGROPECUARIOS, "empresas", NavigationEmpresa.class);
        EMPRESA_CLASSIFICACAO = create("Empresa Classificação", CADASTROS_AGROPECUARIOS, "classificacao", NavigationEmpresaClassificacao.class);
        EMPRESA_FORA_GOIAS = create("Empresa-Fora Goiás", CADASTROS_AGROPECUARIOS, "empresas-fora", NavigationEmpresaForaGoias.class);
        PESSOA = create("Pessoa", CADASTROS_AGROPECUARIOS, "produtor", NavigationPessoa.class);
        PROPRIEDADE = create("Propriedade", CADASTROS_AGROPECUARIOS, "propriedade", NavigationPropriedade.class);
        LAVOURA = create("Lavoura", CADASTROS_AGROPECUARIOS, "lavouras", NavigationLavoura.class);

        //DENUNCIA
        ABRIR_DENUNCIA = create("Abrir Denúncia", DENUNCIA, "abrir-denuncia", NavigationAbrirDenuncia.class, AbrirDenuncia.class, AbrirDenunciaViewHome.class, AbrirDenunciaViewInsert.class, AbrirDenunciaViewEdit.class);

        //DEFESA_SANITARIA_ANIMAL
        BOLETIM_PRODUCAO = create("Boletim de Produção", DEFESA_SANITARIA_ANIMAL, "boletim-producao", NavigationBoletimProducao.class);

        //DEFESA_SANITARIA_VEGETAL
        AQUISICAO_MUDAS = create("Autorização para Aquisição de Mudas", DEFESA_SANITARIA_VEGETAL, "autorizacao-aquisicao-mudas", NavigationAquisicaoMudas.class);
        UNIDADE_CONSOLIDACAO = create("Unidade Consolidação", DEFESA_SANITARIA_VEGETAL, "unidade-consolidacao", NavigationUnidadeConsolidacao.class);
        CADASTRO_LOTE = create("Cadastro de Lote", DEFESA_SANITARIA_VEGETAL, "lote", NavigationCadastroLote.class);
        UNIDADE_PRODUCAO = create("Unidade de Produção", DEFESA_SANITARIA_VEGETAL, "unidade-producao", NavigationUnidadeProducao.class);

        //FISCALIZACAO
        TERMO_FISCALIZACAO = create("Termo de Fiscalização", FISCALIZACAO, "termo-fiscalizacao", NavigationTermoFiscalizacao.class);
    }

    private final String key;
    private final String modulo;
    private final String url;
    private Class<?> navegacaoStrategy;

    NavegacaoType(String key, String modulo, String url, Class<?>... parameters) {
        this.key = key;
        this.modulo = modulo;
        this.url = url;
        this.navegacaoStrategy = parameters[0];
    }

    NavegacaoType(String key, String modulo, String url, Class<?> parameter) {
        this.key = key;
        this.modulo = modulo;
        this.url = url;
        this.navegacaoStrategy = parameter;
    }

    private static NavegacaoType create(String key, String modulo, String url, Class<?>... parameters) {
        return new NavegacaoType(key, modulo, url, parameters);
    }

    private static NavegacaoType create(String key, String modulo, String url, Class<?> parameter) {
        return new NavegacaoType(key, modulo, url, parameter);
    }

    public String getUrl() {
        return HTTP_BASE + this.getModulo() + this.url;
    }

    public String getKey() {
        return this.key;
    }

    public String getModulo() {
        return this.modulo;
    }

    public Class<?> getNavegacaoStrategy() {
        return navegacaoStrategy;
    }
}
