package gov.goias.agrodefesa.constants;

public enum Action {

	HOME(new String[]{"inicio"}),
	INSERT(new String[]{"insiro"}),
    SEARCH(new String[]{"pesquiso"}),
    EDIT(new String[]{"altero"}),
    CANCEL(new String[]{"cancelo"}),
    CONFIRM(new String[]{"confirmo"}),
    APPROVE(new String[]{"aprovo"}),
    MENSAGEM_CONFIRM(new String[]{"confirmado"}),
    MENSAGEM_INSERT(new String[]{"inserido"}),
	MENSAGEM_EDIT(new String[]{"alterado"}),
    MENSAGEM_APROVO(new String[]{"aprovado"}),
    MENSAGEM_ERRO(new String[]{"erro"}),
    MENSAGEM_CANCEL(new String[]{"cancelado"});

    private String[] aliases;

    private Action(String[] aliases){
        this.aliases = aliases;
    }

	public static Action actionForName(String actionString) throws IllegalArgumentException{
        for(Action action: values()){
            for(String alias: action.aliases){
                if(alias.equalsIgnoreCase(actionString)){
                    return action;
                }
            }
        }
        throw actionNotFound(actionString);
    }

    public static IllegalArgumentException actionNotFound(String action) {
        return new IllegalArgumentException(("Invalid Action [" + action + "]"));
    }

}
