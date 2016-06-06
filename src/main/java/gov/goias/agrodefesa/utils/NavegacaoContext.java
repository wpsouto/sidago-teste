package gov.goias.agrodefesa.utils;

import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.navigation.NavigationEmpresa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.navigation.NavigationPessoa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.navigation.NavigationPropriedade;
import gov.goias.agrodefesa.chamado.abrirChamado.navigation.NavigationAbrirChamado;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.navigation.NavigationAlmoxarifado;
import gov.goias.agrodefesa.controleDeBens.material.navigation.NavigationMaterial;
import gov.goias.agrodefesa.controleDeBens.patrimonio.navigation.NavigationPatrimonio;
import gov.goias.agrodefesa.controleDeBens.transferencia.navigation.NavigationTransferencia;
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

    private static List<NavegacaoType> _strategies = new ArrayList<>();

    public static List<Class<?>> _strategies1 = new ArrayList<>();

    static {

        //CONTROLE_BENS
        _strategies1.add(NavigationAlmoxarifado.class);
        _strategies1.add(NavigationMaterial.class);
        _strategies1.add(NavigationPatrimonio.class);
        _strategies1.add(NavigationTransferencia.class);

        //FISCALIZACAO
        _strategies1.add(NavigationTermoFiscalizacao.class);

        //CHAMADO
        _strategies1.add(NavigationAbrirChamado.class);

        //CADASTROS_AGROPECUARIOS
        _strategies1.add(NavigationEmpresa.class);
        _strategies.add(NavegacaoType.EMPRESA_CLASSIFICACAO);
        _strategies.add(NavegacaoType.EMPRESA_FORA_GOIAS);
        _strategies1.add(NavigationPessoa.class);
        _strategies1.add(NavigationPropriedade.class);
        _strategies.add(NavegacaoType.LAVOURA);

        //CONTROLE_DE_PRODUTOS_AGROPECUARIOS
        _strategies.add(NavegacaoType.INGREDIENTE_ATIVO);
        _strategies.add(NavegacaoType.PRODUTO);

        //DEFESA_SANITARIA_ANIMAL
        _strategies.add(NavegacaoType.BOLETIM_PRODUCAO);

        //DEFESA_SANITARIA_VEGETAL
        _strategies.add(NavegacaoType.AQUISICAO_MUDAS);
        _strategies.add(NavegacaoType.UNIDADE_PRODUCAO);
        _strategies.add(NavegacaoType.UNIDADE_CONSOLIDACAO);
        _strategies.add(NavegacaoType.CADASTRO_LOTE);

        //DENUNCIA
        _strategies.add(NavegacaoType.ABRIR_DENUNCIA);

        //CONCESSAO_DE_DIARIAS
        _strategies.add(NavegacaoType.DELEGACAO_DE_ATIVIDADES);
        _strategies.add(NavegacaoType.CIENCIA_DO_SERVIDOR);
        _strategies.add(NavegacaoType.ASSINATURA_DE_DIARIAS);
        _strategies.add(NavegacaoType.PRESTACAO_DE_CONTAS);

    }

}
