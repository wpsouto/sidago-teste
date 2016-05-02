package gov.goias.agrodefesa.utils;

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

    public static final String FISCALIZACAO = "fiscalizacao/";
    public static final NavegacaoType TERMO_FISCALIZACAO;

    private final String key;
    private final String modulo;
    private final String url;

    NavegacaoType(String key, String modulo, String url)  {
        this.key = key;
        this.modulo = modulo;
        this.url = url;
    }

    private static NavegacaoType create(String key, String modulo, String url) {
        return new NavegacaoType(key, modulo, url);
    }

    public String getUrl() {
        return HTTP_BASE+this.getModulo()+this.url;
    }

    public String getKey() {
        return this.key;
    }

    public String getModulo() {
        return this.modulo;
    }

    static {
        //CONTROLE_BENS
        ALMOXARIFADO = create("almoxarifado", CONTROLE_BENS, "almoxarifado");
        MATERIAL = create("material", CONTROLE_BENS,"material");
        PATRIMONIO = create("patrimonio", CONTROLE_BENS, "patrimonio");
        TRANSFERENCIA_BENS = create("transferencia", CONTROLE_BENS, "controle-movimentacao");

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

        //FISCALIZACAO
        TERMO_FISCALIZACAO = create("Termo de Fiscalização", FISCALIZACAO, "termo-fiscalizacao");
    }
}
