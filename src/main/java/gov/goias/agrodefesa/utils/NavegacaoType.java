package gov.goias.agrodefesa.utils;

import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.entity.Empresa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.navigation.NavigationEmpresa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view.EmpresaViewEdit;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view.EmpresaViewHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view.EmpresaViewInsert;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.entity.Classificacao;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.navigation.NavigationEmpresaClassificacao;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.view.EmpresaClassificacaoViewEdit;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.view.EmpresaClassificacaoViewHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.view.EmpresaClassificacaoViewInsert;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.entity.EmpresaForaGoias;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.navigation.NavigationEmpresaForaGoias;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.view.EmpresaForaGoiasViewEdit;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.view.EmpresaForaGoiasViewHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.view.EmpresaForaGoiasViewInsert;
import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.entity.Lavoura;
import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.navigation.NavigationLavoura;
import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.view.LavouraViewEdit;
import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.view.LavouraViewHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.view.LavouraViewInsert;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.navigation.NavigationPessoa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.view.PessoaViewEdit;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.view.PessoaViewHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.view.PessoaViewInsert;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.entity.Propriedade;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.navigation.NavigationPropriedade;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.view.PropriedadeViewEdit;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.view.PropriedadeViewHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.view.PropriedadeViewInsert;
import gov.goias.agrodefesa.chamado.abrirChamado.entity.Chamado;
import gov.goias.agrodefesa.chamado.abrirChamado.navigation.NavigationAbrirChamado;
import gov.goias.agrodefesa.chamado.abrirChamado.view.AbrirChamadoViewHome;
import gov.goias.agrodefesa.chamado.abrirChamado.view.AbrirChamadoViewInsert;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.entity.DelegacaoAtividade;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.navigation.NavigationDelegacaoDeAtividades;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.view.DelegacaoDeAtividadesViewHome;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.view.DelegacaoDeAtividadesViewInsert;
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
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.entity.Ingrediente;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.navigation.NavigationIngredienteAtivo;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.view.IngredienteAtivoViewEdit;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.view.IngredienteAtivoViewHome;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.view.IngredienteAtivoViewInsert;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.entity.ProdutoaAnimal;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.navigation.NavigationProduto;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.view.ProdutoViewEdit;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.view.ProdutoViewHome;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.view.ProdutoViewInsert;
import gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.entity.BoletimProducao;
import gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.navigation.NavigationBoletimProducao;
import gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.view.BoletimProducaoViewHome;
import gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.view.BoletimProducaoViewInsert;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.entity.AquisicaoMudas;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.navigation.NavigationAquisicaoMudas;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.view.AquisicaoMudasViewHome;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.view.AquisicaoMudasViewInsert;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.entity.CadastroLote;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.navigation.NavigationCadastroLote;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.view.CadastroLoteViewEdit;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.view.CadastroLoteViewHome;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.view.CadastroLoteViewInsert;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.entity.UnidadeConsolidacao;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.navigation.NavigationUnidadeConsolidacao;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.view.UnidadeConsolidacaoViewEdit;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.view.UnidadeConsolidacaoViewHome;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.view.UnidadeConsolidacaoViewInsert;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.entity.UnidadeProducao;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.navigation.NavigationUnidadeProducao;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.view.UnidadeProducaoViewEdit;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.view.UnidadeProducaoViewHome;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.view.UnidadeProducaoViewInsert;
import gov.goias.agrodefesa.denuncia.abrirDenuncia.entity.AbrirDenuncia;
import gov.goias.agrodefesa.denuncia.abrirDenuncia.navigation.NavigationAbrirDenuncia;
import gov.goias.agrodefesa.denuncia.abrirDenuncia.view.AbrirDenunciaViewEdit;
import gov.goias.agrodefesa.denuncia.abrirDenuncia.view.AbrirDenunciaViewHome;
import gov.goias.agrodefesa.denuncia.abrirDenuncia.view.AbrirDenunciaViewInsert;
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
        ABRIR_CHAMADO = create("Abrir Chamado", CHAMADO, "abrir-chamado", NavigationAbrirChamado.class, Chamado.class, AbrirChamadoViewHome.class, AbrirChamadoViewInsert.class, null);

        //CONCESSAO_DE_DIARIAS
        DELEGACAO_DE_ATIVIDADES = create("Delegação de Atividades", CONCESSAO_DE_DIARIAS, "diaria", NavigationDelegacaoDeAtividades.class, DelegacaoAtividade.class, DelegacaoDeAtividadesViewHome.class, DelegacaoDeAtividadesViewInsert.class, null);
        CIENCIA_DO_SERVIDOR = create("Ciência do Servidor", CONCESSAO_DE_DIARIAS, "ciencia");
        ASSINATURA_DE_DIARIAS = create("Assinatura de Diárias", CONCESSAO_DE_DIARIAS, "assinar/assinar");
        PRESTACAO_DE_CONTAS = create("Prestação de Contas", CONCESSAO_DE_DIARIAS, "prestacao");

        //CONTROLE_DE_PRODUTOS_AGROPECUARIOS
        INGREDIENTE_ATIVO = create("Ingrediente Ativo", CONTROLE_DE_PRODUTOS_AGROPECUARIOS, "ingrediente-ativo", NavigationIngredienteAtivo.class, Ingrediente.class, IngredienteAtivoViewHome.class, IngredienteAtivoViewInsert.class, IngredienteAtivoViewEdit.class);
        PRODUTO = create("Produto", CONTROLE_DE_PRODUTOS_AGROPECUARIOS, "produto", NavigationProduto.class, ProdutoaAnimal.class, ProdutoViewHome.class, ProdutoViewInsert.class, ProdutoViewEdit.class);

        //CADASTROS_AGROPECUARIOS
        EMPRESA = create("Empresa", CADASTROS_AGROPECUARIOS, "empresas", NavigationEmpresa.class, Empresa.class, EmpresaViewHome.class, EmpresaViewInsert.class, EmpresaViewEdit.class);
        EMPRESA_CLASSIFICACAO = create("Empresa Classificação", CADASTROS_AGROPECUARIOS, "classificacao", NavigationEmpresaClassificacao.class, Classificacao.class, EmpresaClassificacaoViewHome.class, EmpresaClassificacaoViewInsert.class, EmpresaClassificacaoViewEdit.class);
        EMPRESA_FORA_GOIAS = create("Empresa-Fora Goiás", CADASTROS_AGROPECUARIOS, "empresas-fora", NavigationEmpresaForaGoias.class, EmpresaForaGoias.class, EmpresaForaGoiasViewHome.class, EmpresaForaGoiasViewInsert.class, EmpresaForaGoiasViewEdit.class);
        PESSOA = create("Pessoa", CADASTROS_AGROPECUARIOS, "produtor", NavigationPessoa.class, Pessoa.class, PessoaViewHome.class, PessoaViewInsert.class, PessoaViewEdit.class);
        PROPRIEDADE = create("Propriedade", CADASTROS_AGROPECUARIOS, "propriedade", NavigationPropriedade.class, Propriedade.class, PropriedadeViewHome.class, PropriedadeViewInsert.class, PropriedadeViewEdit.class);
        LAVOURA = create("Lavoura", CADASTROS_AGROPECUARIOS, "lavouras", NavigationLavoura.class, Lavoura.class, LavouraViewHome.class, LavouraViewInsert.class, LavouraViewEdit.class);

        //DENUNCIA
        ABRIR_DENUNCIA = create("Abrir Denúncia", DENUNCIA, "abrir-denuncia", NavigationAbrirDenuncia.class, AbrirDenuncia.class, AbrirDenunciaViewHome.class, AbrirDenunciaViewInsert.class, AbrirDenunciaViewEdit.class);

        //DEFESA_SANITARIA_ANIMAL
        BOLETIM_PRODUCAO = create("Boletim de Produção", DEFESA_SANITARIA_ANIMAL, "boletim-producao", NavigationBoletimProducao.class, BoletimProducao.class, BoletimProducaoViewHome.class, BoletimProducaoViewInsert.class, null);

        //DEFESA_SANITARIA_VEGETAL
        AQUISICAO_MUDAS = create("Autorização para Aquisição de Mudas", DEFESA_SANITARIA_VEGETAL, "autorizacao-aquisicao-mudas", NavigationAquisicaoMudas.class, AquisicaoMudas.class, AquisicaoMudasViewHome.class, AquisicaoMudasViewInsert.class, null);
        UNIDADE_CONSOLIDACAO = create("Unidade Consolidação", DEFESA_SANITARIA_VEGETAL, "unidade-consolidacao", NavigationUnidadeConsolidacao.class, UnidadeConsolidacao.class, UnidadeConsolidacaoViewHome.class, UnidadeConsolidacaoViewInsert.class, UnidadeConsolidacaoViewEdit.class);
        CADASTRO_LOTE = create("Cadastro de Lote", DEFESA_SANITARIA_VEGETAL, "lote", NavigationCadastroLote.class, CadastroLote.class, CadastroLoteViewHome.class, CadastroLoteViewInsert.class, CadastroLoteViewEdit.class);
        UNIDADE_PRODUCAO = create("Unidade de Produção", DEFESA_SANITARIA_VEGETAL, "unidade-producao", NavigationUnidadeProducao.class, UnidadeProducao.class, UnidadeProducaoViewHome.class, UnidadeProducaoViewInsert.class, UnidadeProducaoViewEdit.class);

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

    private static NavegacaoType create(String key, String modulo, String url) {
        return new NavegacaoType(key, modulo, url);
    }

    private static NavegacaoType create(String key, String modulo, String url, Class<?>... parameters) {
        return new NavegacaoType(key, modulo, url, parameters);
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
