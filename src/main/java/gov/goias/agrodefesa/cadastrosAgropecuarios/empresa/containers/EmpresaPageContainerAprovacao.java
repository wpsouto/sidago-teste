package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmpresaPageContainerAprovacao {
    private static final Logger log = LoggerFactory.getLogger(EmpresaPageContainerAprovacao.class);

    @FindBy(how = How.ID, using = "divEdicao")
    public WebElement home;

    @FindBy(how = How.XPATH, using = "//*[@id=\"divEdicao\"]/table/tbody")
    public WebElement table;

    @FindBy(how = How.ID, using = "aprovar")
    public WebElement aprovar;

    public boolean isVisible(String label) {
        List<WebElement> tableRows = table.findElements(By.xpath("tr"));
        for (WebElement row : tableRows) {
            List<WebElement> tableCells = row.findElements(By.xpath("td"));
            for (WebElement cell : tableCells) {
                log.debug("Value = {}", cell.getText());
                if (label.equalsIgnoreCase(cell.getText())){
                    log.debug("Value = {} encontrado", cell.getText());
                    return true;
                }
            }
        }

        return false;
    }


}
