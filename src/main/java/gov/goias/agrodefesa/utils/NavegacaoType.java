package gov.goias.agrodefesa.utils;

import gov.goias.agrodefesa.controleDeBens.almoxarifado.entity.Almoxarifado;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.navigation.NavigationAlmoxarifado;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.view.AlmoxarifadoViewEdit;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.view.AlmoxarifadoViewHome;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.view.AlmoxarifadoViewInsert;
import gov.goias.agrodefesa.controleDeBens.material.entity.Material;
import gov.goias.agrodefesa.controleDeBens.material.navigation.NavigationMaterial;
import gov.goias.agrodefesa.controleDeBens.material.view.MaterialViewEdit;
import gov.goias.agrodefesa.controleDeBens.material.view.MaterialViewHome;
import gov.goias.agrodefesa.controleDeBens.material.view.MaterialViewInsert;
import gov.goias.agrodefesa.controleDeBens.patrimonio.entity.Patrimonio;
import gov.goias.agrodefesa.controleDeBens.patrimonio.navigation.NavigationPatrimonio;
import gov.goias.agrodefesa.controleDeBens.patrimonio.view.PatrimonioViewEdit;
import gov.goias.agrodefesa.controleDeBens.patrimonio.view.PatrimonioViewHome;
import gov.goias.agrodefesa.controleDeBens.patrimonio.view.PatrimonioViewInsert;
import gov.goias.agrodefesa.controleDeBens.transferencia.entity.Transferencia;
import gov.goias.agrodefesa.controleDeBens.transferencia.navigation.NavigationTransferencia;
import gov.goias.agrodefesa.controleDeBens.transferencia.view.TransferenciaViewHome;
import gov.goias.agrodefesa.controleDeBens.transferencia.view.TransferenciaViewInsert;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.entity.TermoFiscalizacao;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.navigation.NavigationTermoFiscalizacao;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.view.TermoFiscalizacaoViewHome;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.view.TermoFiscalizacaoViewInsert;

/**
 * Created by usuario on 10/03/16.
 */
public class NavegacaoType {
    public static final String HTTP_BASE = "http://qa.agrodefesa.go.gov.br/";
    //public static final String HTTP_BASE = "http://localhost/";

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
        ALMOXARIFADO = create("almoxarifado", CONTROLE_BENS, "almoxarifado", NavigationAlmoxarifado.class, Almoxarifado.class, AlmoxarifadoViewHome.class, AlmoxarifadoViewInsert.class, AlmoxarifadoViewEdit.class);
        MATERIAL = create("material", CONTROLE_BENS, "material", NavigationMaterial.class, Material.class, MaterialViewHome.class, MaterialViewInsert.class, MaterialViewEdit.class);
        PATRIMONIO = create("patrimonio", CONTROLE_BENS, "patrimonio", NavigationPatrimonio.class, Patrimonio.class, PatrimonioViewHome.class, PatrimonioViewInsert.class, PatrimonioViewEdit.class);
        TRANSFERENCIA_BENS = create("transferencia", CONTROLE_BENS, "controle-movimentacao", NavigationTransferencia.class, Transferencia.class, TransferenciaViewHome.class, TransferenciaViewInsert.class, null);

        //CHAMADO
        ABRIR_CHAMADO = create("Abrir Chamado", CHAMADO, "abrir-chamado");

        //CONCESSAO_DE_DIARIAS
        DELEGACAO_DE_ATIVIDADES = create("Delegação de Atividades", CONCESSAO_DE_DIARIAS, "diaria");
        CIENCIA_DO_SERVIDOR = create("Ciência do Servidor", CONCESSAO_DE_DIARIAS, "ciencia");
        ASSINATURA_DE_DIARIAS = create("Assinatura de Diárias", CONCESSAO_DE_DIARIAS, "assinar/assinar");
        PRESTACAO_DE_CONTAS = create("Prestação de Contas", CONCESSAO_DE_DIARIAS, "prestacao");

        //CONTROLE_DE_PRODUTOS_AGROPECUARIOS
        INGREDIENTE_ATIVO = create("Ingrediente Ativo", CONTROLE_DE_PRODUTOS_AGROPECUARIOS, "ingrediente-ativo");
        PRODUTO = create("Produto", CONTROLE_DE_PRODUTOS_AGROPECUARIOS, "produto");

        //CADASTROS_AGROPECUARIOS
        EMPRESA = create("Empresa", CADASTROS_AGROPECUARIOS, "empresas");
        EMPRESA_CLASSIFICACAO = create("Empresa Classificação", CADASTROS_AGROPECUARIOS, "classificacao");
        EMPRESA_FORA_GOIAS = create("Empresa-Fora Goiás", CADASTROS_AGROPECUARIOS, "empresas-fora");
        PESSOA = create("Pessoa", CADASTROS_AGROPECUARIOS, "produtor");
        PROPRIEDADE = create("Propriedade", CADASTROS_AGROPECUARIOS, "propriedade");
        LAVOURA = create("Lavoura", CADASTROS_AGROPECUARIOS, "lavouras");

        //DENUNCIA
        ABRIR_DENUNCIA = create("Abrir Denúncia", DENUNCIA, "abrir-denuncia");

        //DEFESA_SANITARIA_ANIMAL
        BOLETIM_PRODUCAO = create("Boletim de Produção", DEFESA_SANITARIA_ANIMAL, "boletim-producao");

        //DEFESA_SANITARIA_VEGETAL
        AQUISICAO_MUDAS = create("Autorização para Aquisição de Mudas", DEFESA_SANITARIA_VEGETAL, "autorizacao-aquisicao-mudas");
        UNIDADE_CONSOLIDACAO = create("Unidade Consolidação", DEFESA_SANITARIA_VEGETAL, "unidade-consolidacao");
        CADASTRO_LOTE = create("Cadastro de Lote", DEFESA_SANITARIA_VEGETAL, "lote");
        UNIDADE_PRODUCAO = create("Unidade de Produção", DEFESA_SANITARIA_VEGETAL, "unidade-producao");

        //FISCALIZACAO
        TERMO_FISCALIZACAO = create("Termo de Fiscalização", FISCALIZACAO, "termo-fiscalizacao", NavigationTermoFiscalizacao.class, TermoFiscalizacao.class, TermoFiscalizacaoViewHome.class, TermoFiscalizacaoViewInsert.class, null);
    }

    private final String key;
    private final String modulo;
    private final String url;
    private Class<?> navegacaoStrategy;
    private Class<?> classToProxy;
    private Class<?> home;
    private Class<?> insert;
    private Class<?> edit;

    NavegacaoType(String key, String modulo, String url) {
        this.key = key;
        this.modulo = modulo;
        this.url = url;
    }

    NavegacaoType(String key, String modulo, String url, Class<?>... parameters) {
        this.key = key;
        this.modulo = modulo;
        this.url = url;
        this.navegacaoStrategy = parameters[0];
        this.classToProxy = parameters[1];
        this.home = parameters[2];
        this.insert = parameters[3];
        this.edit = parameters[4];
    }

/*
    NavegacaoType(String key, String modulo, String url, Class<?> navegacaoStrategy, Class<?> classToProxy, Class<?> home, Class<?> insert, Class<?> edit) {
        this.key = key;
        this.modulo = modulo;
        this.url = url;
        this.navegacaoStrategy = navegacaoStrategy;
        this.classToProxy = classToProxy;
        this.home = home;
        this.insert = insert;
        this.edit = edit;
    }
*/

    private static NavegacaoType create(String key, String modulo, String url) {
        return new NavegacaoType(key, modulo, url);
    }

    private static NavegacaoType create(String key, String modulo, String url,Class<?> navegacaoStrategy, Class<?> classToProxy, Class<?> home, Class<?> insert, Class<?> edit) {
        return new NavegacaoType(key, modulo, url, navegacaoStrategy, classToProxy, home, insert, edit);
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

    public Class<?> getClassToProxy() {
        return classToProxy;
    }

    public Class<?> getHome() {
        return home;
    }

    public Class<?> getInsert() {
        return insert;
    }

    public Class<?> getEdit() {
        return edit;
    }

    public Class<?> getNavegacaoStrategy() {
        return navegacaoStrategy;
    }
}
