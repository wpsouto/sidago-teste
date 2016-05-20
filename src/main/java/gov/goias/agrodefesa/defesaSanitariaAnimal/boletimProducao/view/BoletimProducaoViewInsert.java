package gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.view;

import gov.goias.agrodefesa.base.view.BaseViewInsertImpl;
import gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.containers.BoletimProducaoPageContainerInsert;
import gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.entity.BoletimProducao;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class BoletimProducaoViewInsert extends BaseViewInsertImpl {

    public BoletimProducaoViewInsert(Object entity) {
        super(entity, BoletimProducaoPageContainerInsert.class);
    }

    private BoletimProducao getEntity() {
        return (BoletimProducao) entity;
    }

    private BoletimProducaoPageContainerInsert getContainer() {
        return (BoletimProducaoPageContainerInsert) container;
    }

    @Override
    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);

        log.debug(Constants.MGS_INSERIDO, "PROPRIEDADE", getEntity().getPropriedade());
        getContainer().pesquisar.click();
        BrowserDriver.waitForElement(getContainer().propriedadeHome);
        getContainer().cnpjCpf.sendKeys(getEntity().getPropriedade().getPessoa().getCpfCnpj());
        getContainer().realizarPesquisa.click();
        BrowserDriver.waitForElement(getContainer().selecionar);
        getContainer().selecionar.click();
        BrowserDriver.waitForElementIsNotPresent(getContainer().propriedadeHome);

        log.debug(Constants.MGS_INSERIDO, "ASSUNTO", getEntity().getMateriaPrimaOrigem());
        BrowserDriver.selectByVisibleText(getContainer().materiaPrimaOrigem, getEntity().getMateriaPrimaOrigem());

        log.debug(Constants.MGS_INSERIDO, "TOTAL ANIMAIS ALOJADOS", getEntity().getTotalDeAnimaisAlojados());
        getContainer().totalDeAnimaisAlojados.clear();
        getContainer().totalDeAnimaisAlojados.sendKeys(getEntity().getTotalDeAnimaisAlojados());

        log.debug(Constants.MGS_INSERIDO, "MONITORAMENTO MICRO ORGANISMOS", getEntity().getMonitoramentoDeMicroOrganismos());
        BrowserDriver.selectByVisibleText(getContainer().monitoramentoMicroOrganismos, getEntity().getMonitoramentoDeMicroOrganismos());

        log.debug(Constants.MGS_INSERIDO, "DATA INICIO LOTE", getEntity().getDataInicioDoLote());
        now(getContainer().dataInicioLote);

        log.debug(Constants.MGS_INSERIDO, "MORTALIDADE ESTIMADA", getEntity().getMortalidadeEstimada());
        getContainer().mortalidadeEstimada.clear();
        getContainer().mortalidadeEstimada.sendKeys(getEntity().getMortalidadeEstimada());

        log.debug(Constants.MGS_INSERIDO, "QDT ANIMAIS DESPESCADOS", getEntity().getQtdAnimaisDespescados());
        getContainer().qdtAnimaisDespescados.clear();
        getContainer().qdtAnimaisDespescados.sendKeys(getEntity().getQtdAnimaisDespescados());

        log.debug(Constants.MGS_INSERIDO, "ANIMAIS SUBMETIDOS JEJUM", getEntity().getAnimaisSubmetidosJejum());
        BrowserDriver.selectByVisibleText(getContainer().animaisSubmetidosJejum, getEntity().getAnimaisSubmetidosJejum());

        log.debug(Constants.MGS_INSERIDO, "ANIMAIS ARROACADOS", getEntity().getAnimaisArroacados());
        BrowserDriver.selectByVisibleText(getContainer().animaisArroacados, getEntity().getAnimaisArroacados());

        log.debug(Constants.MGS_INSERIDO, "DATA INICIO PESCA", getEntity().getDataInicioPesca());
        now(getContainer().dataInicioPesca);

        log.debug(Constants.MGS_INSERIDO, "DATA FIM PESCA", getEntity().getDataFimPesca());
        now(getContainer().dataFimPesca);

        log.debug(Constants.MGS_INSERIDO, "APRESENTACAO MATERIA PRIMA", getEntity().getApresentacaoMateriaPrima());
        BrowserDriver.selectByVisibleText(getContainer().apresentacaoMateriaPrima, getEntity().getApresentacaoMateriaPrima());

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
        getContainer().salvar.click();
    }

}
