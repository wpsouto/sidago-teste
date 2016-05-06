package gov.goias.agrodefesa.utils;

import gov.goias.agrodefesa.constants.Action;

/**
 * Created by usuario on 11/03/16.
 */
public interface NavegacaoStrategy {
    void home();
    void insert();
    void search();
    void edit();
    void confirm();
    void others(Action action);
}
