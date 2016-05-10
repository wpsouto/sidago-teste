package gov.goias.agrodefesa.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by usuario on 10/03/16.
 */
public class NavegacaoContext {

    protected static final Logger log = LoggerFactory.getLogger(NavegacaoContext.class);
    private static Hashtable<NavegacaoType, NavegacaoStrategy> _strategies = new Hashtable<>();

    private static List<NavegacaoType> _strategies1 = new ArrayList<>();

    static {

        //CONTROLE_BENS
        _strategies1.add(NavegacaoType.ALMOXARIFADO);
        _strategies1.add(NavegacaoType.MATERIAL);
        _strategies1.add(NavegacaoType.PATRIMONIO);
        _strategies1.add(NavegacaoType.TRANSFERENCIA_BENS);

        //FISCALIZACAO
        _strategies1.add(NavegacaoType.TERMO_FISCALIZACAO);

        //CHAMADO
        _strategies1.add(NavegacaoType.ABRIR_CHAMADO);

        //CADASTROS_AGROPECUARIOS
        _strategies1.add(NavegacaoType.EMPRESA);
        _strategies1.add(NavegacaoType.EMPRESA_CLASSIFICACAO);
/*

        //CONCESSAO_DE_DIARIAS
        _strategies.put(NavegacaoType.DELEGACAO_DE_ATIVIDADES, new NavigationDelegacaoDeAtividades());
        _strategies.put(NavegacaoType.CIENCIA_DO_SERVIDOR, new NavigationCienciaDoServidor());
        _strategies.put(NavegacaoType.ASSINATURA_DE_DIARIAS, new NavigationAssinaturaDeDiarias());
        _strategies.put(NavegacaoType.PRESTACAO_DE_CONTAS, new NavigationPrestacaoDeContas());

        //CHAMADO
        _strategies.put(NavegacaoType.ABRIR_CHAMADO, new NavigationAbrirChamado());

        //CONTROLE_DE_PRODUTOS_AGROPECUARIOS
        _strategies.put(NavegacaoType.INGREDIENTE_ATIVO, new NavigationIngredienteAtivo());
        _strategies.put(NavegacaoType.PRODUTO, new NavigationProduto());

        //CADASTROS_AGROPECUARIOS
        _strategies.put(NavegacaoType.EMPRESA, new NavigationEmpresa());
        _strategies.put(NavegacaoType.EMPRESA_CLASSIFICACAO, new NavigationEmpresaClassificacao());
        _strategies.put(NavegacaoType.EMPRESA_FORA_GOIAS, new NavigationEmpresaForaGoias());
        _strategies.put(NavegacaoType.PESSOA, new NavigationPessoa());
        _strategies.put(NavegacaoType.PROPRIEDADE, new NavigationPropriedade());
        _strategies.put(NavegacaoType.LAVOURA, new NavigationLavoura());

        //DENUNCIA
        _strategies.put(NavegacaoType.ABRIR_DENUNCIA, new NavigationAbrirDenuncia());

        //DEFESA_SANITARIA_ANIMAL
        _strategies.put(NavegacaoType.BOLETIM_PRODUCAO, new NavigationBoletimProducao());

        //FISCALIZACAO
        _strategies.put(NavegacaoType.TERMO_FISCALIZACAO, new NavigationTermoFiscalizacao(NavegacaoType.TERMO_FISCALIZACAO));

        //DEFESA_SANITARIA_VEGETAL
        _strategies.put(NavegacaoType.AQUISICAO_MUDAS, new NavigationAquisicaoMudas(NavegacaoType.AQUISICAO_MUDAS));
        _strategies.put(NavegacaoType.UNIDADE_CONSOLIDACAO, new NavigationUnidadeConsolidacao(NavegacaoType.UNIDADE_CONSOLIDACAO));
        _strategies.put(NavegacaoType.UNIDADE_PRODUCAO, new NavigationUnidadeProducao(NavegacaoType.UNIDADE_PRODUCAO));
        _strategies.put(NavegacaoType.CADASTRO_LOTE, new NavigationCadastroLote(NavegacaoType.CADASTRO_LOTE));
*/

    }

    public static NavegacaoStrategy parce(String key) throws IllegalArgumentException {

        Enumeration<NavegacaoType> types = _strategies.keys();
        while (types.hasMoreElements()) {
            NavegacaoType type = types.nextElement();
            if (type.getKey().equalsIgnoreCase(key)) {
                return _strategies.get(type);
            }
        }

        throw navegacaoType(key);
    }

    public static NavegacaoStrategy parce1(String key, NavegacaoStrategy strategy) {
        for (NavegacaoType type : _strategies1) {
            if (type.getKey().equalsIgnoreCase(key)) {
                try {
                    if (strategy != null && type.getNavegacaoStrategy().equals(strategy.getClass())) {
                        return strategy;
                    } else {
                        return (NavegacaoStrategy) (type.getNavegacaoStrategy()).getConstructor(NavegacaoType.class).newInstance(type);
                    }
                } catch (InstantiationException | NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                    throw NavegacaoContext.error("ERRO AO INSTANCIAR CLASSE STRATEGY", e);
                }
            }
        }

        throw navegacaoType(key);
    }

    private static IllegalArgumentException navegacaoType(String type) {
        return new IllegalArgumentException(("Invalid NavegacaoTYpe [" + type + "]"));
    }

    private static IllegalArgumentException error(String message, Throwable cause) {
        return new IllegalArgumentException(message, cause);
    }

}
