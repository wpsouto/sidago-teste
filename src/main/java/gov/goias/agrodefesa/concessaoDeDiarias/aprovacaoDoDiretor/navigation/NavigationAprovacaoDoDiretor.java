package gov.goias.agrodefesa.concessaoDeDiarias.aprovacaoDoDiretor.navigation;

import gov.goias.agrodefesa.concessaoDeDiarias.aprovacaoDoDiretor.view.AprovacaoDoDiretorViewHome;
import gov.goias.agrodefesa.utils.BrowserDriver;

public class NavigationAprovacaoDoDiretor {

    public NavigationAprovacaoDoDiretor() {

    }

    public void homeCheck() {
        AprovacaoDoDiretorViewHome.isDisplayedCheck();
    }

    public void aprovar() {
        AprovacaoDoDiretorViewHome.aprovar("Carla Giovanna Nunes de Farias Leite Coelho");
    }

    public void concordar() {
        AprovacaoDoDiretorViewHome.concordar();
        BrowserDriver.screenshot();
    }

}
