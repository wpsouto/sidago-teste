package gov.goias.agrodefesa.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by usuario on 10/03/16.
 */
public class NavegacaoContext {

    protected static final Logger log = LoggerFactory.getLogger(NavegacaoContext.class);

    private static List<NavegacaoType> _strategies = new ArrayList<>();

    static {

        //CONTROLE_BENS
        _strategies.add(NavegacaoType.ALMOXARIFADO);
        _strategies.add(NavegacaoType.MATERIAL);
        _strategies.add(NavegacaoType.PATRIMONIO);
        _strategies.add(NavegacaoType.TRANSFERENCIA_BENS);

        //FISCALIZACAO
        _strategies.add(NavegacaoType.TERMO_FISCALIZACAO);

        //CHAMADO
        _strategies.add(NavegacaoType.ABRIR_CHAMADO);

        //CADASTROS_AGROPECUARIOS
        _strategies.add(NavegacaoType.EMPRESA);
        _strategies.add(NavegacaoType.EMPRESA_CLASSIFICACAO);
        _strategies.add(NavegacaoType.EMPRESA_FORA_GOIAS);
        _strategies.add(NavegacaoType.PESSOA);
        _strategies.add(NavegacaoType.PROPRIEDADE);
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

    public static NavegacaoStrategy parce1(String key, NavegacaoStrategy strategy) {
        for (NavegacaoType type : _strategies) {
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
