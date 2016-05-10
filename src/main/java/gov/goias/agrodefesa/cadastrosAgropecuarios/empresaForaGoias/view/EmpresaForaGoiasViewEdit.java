package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.view;

import gov.goias.agrodefesa.base.view.BaseViewEditImpl;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.containers.EmpresaForaGoiasPageContainerEdit;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.entity.EmpresaForaGoias;

public class EmpresaForaGoiasViewEdit extends BaseViewEditImpl {

    public EmpresaForaGoiasViewEdit(Object entity) {
        super(entity, EmpresaForaGoiasPageContainerEdit.class);
    }

    private EmpresaForaGoias getEntity() {
        return (EmpresaForaGoias) entity;
    }

    private EmpresaForaGoiasPageContainerEdit getContainer() {
        return (EmpresaForaGoiasPageContainerEdit) container;
    }


}
