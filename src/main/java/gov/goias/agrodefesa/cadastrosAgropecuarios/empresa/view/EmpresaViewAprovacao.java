package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view;

import gov.goias.agrodefesa.base.view.BaseViewEditImpl;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.containers.EmpresaPageContainerAprovacao;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.entity.Empresa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.entity.Grupo;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.junit.Assert;

import java.util.Enumeration;

public class EmpresaViewAprovacao extends BaseViewEditImpl {


    public EmpresaViewAprovacao(Object entity) {
        super(entity, EmpresaPageContainerAprovacao.class);
    }

    private Empresa getEntity() {
        return (Empresa) entity;
    }

    private EmpresaPageContainerAprovacao getContainer() {
        return (EmpresaPageContainerAprovacao) container;
    }


    @Override
    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);

        validarLabel();
        validarValue();
        BrowserDriver.screenshot();
    }


    private void validarLabel() {
        log.debug(Constants.MGS_SELECIONADO, "VALIDANDO LABEL");
        Grupo grupo = new Grupo();
        grupo.initialize(Integer.valueOf(getEntity().getInformacaoObrigatoria().getClassificacao().getId()));

        BrowserDriver.waitForElement(getContainer().table);
        String table = getContainer().table.getText();
        boolean valido;
        Enumeration names = grupo.labels().keys();
        while(names.hasMoreElements()) {
            String str = (String) names.nextElement();
            //log.debug(Constants.MGS_MENSAGEM, String.format("validando Label %s", str));
            valido = table.contains(str) == grupo.labels().get(str);
            Assert.assertTrue(String.format("Label %s %s encontrado", str, valido?"":"não"), valido);
        }
    }

    private void validarValue(){
        String table = getContainer().table.getText();
        log.debug(Constants.MGS_SELECIONADO, "VALIDANDO VALORES");

        boolean valido = table.contains(getEntity().getInformacaoComplementar().geteMail().getEMail());
        Assert.assertTrue(String.format("Email %s não encontrado", getEntity().getInformacaoComplementar().geteMail().getEMail()), valido);
    }

}
