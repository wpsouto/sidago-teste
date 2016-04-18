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
import gov.goias.agrodefesa.controleDeBens.tranferencia.navigation.NavigationTransferencia;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.navigation.NavigationIngredienteAtivo;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.navigation.NavigationProduto;
import gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.navigation.NavigationBoletimProducao;
import gov.goias.agrodefesa.denuncia.abrirDenuncia.navigation.NavigationAbrirDenuncia;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by usuario on 10/03/16.
 */
public class NavegacaoContext {

    private static Hashtable<NavegacaoType, NavegacaoStrategy> _strategies =
            new Hashtable<>();

    static {

        //CONTROLE_BENS
        _strategies.put(NavegacaoType.ALMOXARIFADO, new NavigationAlmoxarifado());
        _strategies.put(NavegacaoType.MATERIAL, new NavigationMaterial());
        _strategies.put(NavegacaoType.PATRIMONIO, new NavigationPatrimonio());
        _strategies.put(NavegacaoType.TRANSFERENCIA_BENS, new NavigationTransferencia());

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

    }

    public static NavegacaoStrategy parce(String key) throws IllegalArgumentException{

        Enumeration<NavegacaoType> types = _strategies.keys();
        while (types.hasMoreElements()) {
            NavegacaoType type = types.nextElement();
            if (type.getKey().equalsIgnoreCase(key)){
                return _strategies.get(type);
            }
        }

        throw navegacaoType(key);
    }

    public static NavegacaoStrategy parce(NavegacaoType type) throws IllegalArgumentException{
        return parce(type.getKey());
    }

    private static IllegalArgumentException navegacaoType(String type) {
        return new IllegalArgumentException(("Invalid NavegacaoTYpe [" + type + "]"));
    }

}
