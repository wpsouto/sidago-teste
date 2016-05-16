package gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.view;

import gov.goias.agrodefesa.base.view.BaseViewEditImpl;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.containers.PessoaPageContainerEdit;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;

public class PessoaViewEdit extends BaseViewEditImpl {

    public PessoaViewEdit(Object entity) {
        super(entity, PessoaPageContainerEdit.class);
    }

    private Pessoa getEntity() {
        return (Pessoa) entity;
    }

    private PessoaPageContainerEdit getContainer() {
        return (PessoaPageContainerEdit) container;
    }

}
