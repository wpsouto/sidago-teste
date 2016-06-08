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
import gov.goias.agrodefesa.denuncia.abrirDenuncia.navigation.NavigationAbrirDenuncia;
import gov.goias.agrodefesa.financeiro.dare.navigation.NavigationDare;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.navigation.NavigationTermoFiscalizacao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by usuario on 10/03/16.
 * *
 */
public class NavegacaoContext {

    protected static final Logger log = LoggerFactory.getLogger(NavegacaoContext.class);

    public static List<Class<?>> _strategies = new ArrayList<>();

    static {

        //CONTROLE_BENS
        _strategies.add(NavigationAlmoxarifado.class);
        _strategies.add(NavigationMaterial.class);
        _strategies.add(NavigationPatrimonio.class);
        _strategies.add(NavigationTransferencia.class);

        //FISCALIZACAO
        _strategies.add(NavigationTermoFiscalizacao.class);

        //CHAMADO
        _strategies.add(NavigationAbrirChamado.class);

        //CADASTROS_AGROPECUARIOS
        _strategies.add(NavigationEmpresa.class);
        _strategies.add(NavigationEmpresaClassificacao.class);
        _strategies.add(NavigationEmpresaForaGoias.class);
        _strategies.add(NavigationPessoa.class);
        _strategies.add(NavigationPropriedade.class);
        _strategies.add(NavigationLavoura.class);

        //CONTROLE_DE_PRODUTOS_AGROPECUARIOS
        _strategies.add(NavigationIngredienteAtivo.class);
        _strategies.add(NavigationProduto.class);

        //DEFESA_SANITARIA_ANIMAL
        _strategies.add(NavigationBoletimProducao.class);

        //DEFESA_SANITARIA_VEGETAL
        _strategies.add(NavigationAquisicaoMudas.class);
        _strategies.add(NavigationUnidadeProducao.class);
        _strategies.add(NavigationUnidadeConsolidacao.class);
        _strategies.add(NavigationCadastroLote.class);

        //DENUNCIA
        _strategies.add(NavigationAbrirDenuncia.class);

        //CONCESSAO_DE_DIARIAS
        _strategies.add(NavigationDelegacaoDeAtividades.class);
        _strategies.add(NavigationCienciaDoServidor.class);
        _strategies.add(NavigationAssinaturaDeDiarias.class);
        _strategies.add(NavigationPrestacaoDeContas.class);

        //FINANCEIRO
        _strategies.add(NavigationDare.class);

    }

}
