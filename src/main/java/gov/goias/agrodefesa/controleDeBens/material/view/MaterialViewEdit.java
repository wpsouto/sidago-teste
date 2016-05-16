package gov.goias.agrodefesa.controleDeBens.material.view;

import gov.goias.agrodefesa.base.view.BaseViewEditImpl;
import gov.goias.agrodefesa.controleDeBens.material.containers.MaterialPageContainerEdit;

public class MaterialViewEdit extends BaseViewEditImpl {

    public MaterialViewEdit(Object entity) {
        super(entity, MaterialPageContainerEdit.class);
    }

    protected MaterialPageContainerEdit getContainer() {
        return (MaterialPageContainerEdit) container;
    }


}
