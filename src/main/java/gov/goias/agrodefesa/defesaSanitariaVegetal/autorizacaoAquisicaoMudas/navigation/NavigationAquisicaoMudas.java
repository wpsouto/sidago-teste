package gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.navigation;

import cucumber.api.PendingException;
import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.entity.Propriedade;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.navigation.NavigationPropriedade;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.entity.AquisicaoMudas;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.view.AquisicaoMudasViewAprovacao;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.view.AquisicaoMudasViewHome;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.view.AquisicaoMudasViewInsert;
import gov.goias.agrodefesa.utils.*;
import org.apache.commons.lang.StringUtils;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationAquisicaoMudas implements NavegacaoStrategy {

    private AquisicaoMudas entity;
    private NavegacaoType type;

    public NavigationAquisicaoMudas(NavegacaoType type) {
        Propriedade propriedade = ((NavigationPropriedade) NavegacaoFactory.getNavigator().pageLoad(NavegacaoType.PROPRIEDADE)).getPropriedade();

        this.type = type;
        this.entity = ResourceFactory.init(AquisicaoMudas.class);
        this.entity.setPropriedade(propriedade);
        this.entity.setPessoa(propriedade.getPessoa());
    }

    public AquisicaoMudas getEntity() {
        return entity;
    }

    private void aprovar() {
        search();
        AquisicaoMudasViewHome.aprovacao();
        AquisicaoMudasViewAprovacao.isDisplayedCheck();
        AquisicaoMudasViewAprovacao.observacao(this.entity.getObservacao());
        AquisicaoMudasViewAprovacao.situacao(this.entity.getSituacao());
        AquisicaoMudasViewAprovacao.salvar();
    }

    @Override
    public void home() {
        BrowserDriver.loadPage(type.getUrl());
        AquisicaoMudasViewHome.isDisplayedCheck();

    }

    @Override
    public void insert() {
        if (StringUtils.isEmpty(this.entity.getPessoa().getCpfCnpj())){
            throw new PendingException(String.format(Constants.MGS_DEPENDENCIA, "@Propriedade"));
        }

        AquisicaoMudasViewHome.incluirRegistro();
        AquisicaoMudasViewInsert.isDisplayedCheck();
        AquisicaoMudasViewInsert.cnpjCpfOrigem(this.entity.getPessoa().getCpfCnpj());
        AquisicaoMudasViewInsert.pesquisar();
        AquisicaoMudasViewInsert.registroRenasem(this.entity.getRegistroEnasem());
        AquisicaoMudasViewInsert.eMailOrigem(this.entity.getEmailOrigem());
        AquisicaoMudasViewInsert.telefoneOrigem(this.entity.getTelefoneOrigem());

        AquisicaoMudasViewInsert.tipoDestino(this.entity.getTipoDestino());
        AquisicaoMudasViewInsert.cnpjCpfDestino(this.entity.getPropriedade().getPessoa().getCpfCnpj());
        AquisicaoMudasViewInsert.pesquisarDestino();
        AquisicaoMudasViewInsert.propriedadeDestino();
        AquisicaoMudasViewInsert.telefoneDestino(this.entity.getTelefoneDestino());
        AquisicaoMudasViewInsert.adicionarTransportador(this.entity.getTransporte());
        AquisicaoMudasViewInsert.adicionarMudas(this.entity.getMudas());
        BrowserDriver.screenshot();
        AquisicaoMudasViewInsert.salvar();

    }

    @Override
    public void search() {
        AquisicaoMudasViewHome.isDisplayedCheck();
        AquisicaoMudasViewHome.cpfCnpjOrigem(this.entity.getPessoa().getCpfCnpj());
        AquisicaoMudasViewHome.pesquisar();

    }

    @Override
    public void edit() {

    }

    @Override
    public void others(Action action) {
        switch(action){
            case APPROVE:
                aprovar();
                break;
            case MENSAGEM_INSERT:
                AquisicaoMudasViewInsert.aviso("Registro inserido com sucesso!");
                break;
            case MENSAGEM_APROVO:
                AquisicaoMudasViewAprovacao.aviso("Pronto! A situação foi atualizada.");
                break;
            default:
                throw Action.actionNotFound(action.name());

        }

    }

}
