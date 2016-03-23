package gov.goias.agrodefesa.constants;

public enum Action {

	HOME(new String[]{"inicio"}),
	INSERT(new String[]{"insiro"}),
    SEARCH(new String[]{"pesquiso"}),
    EDIT(new String[]{"altero"}),
    OK(new String[]{"confirmo"}),
    MENSAGEM_OK(new String[]{"confirmado"}),
    MENSAGEM_INSERT(new String[]{"inserido"}),
	MENSAGEM_EDIT(new String[]{"alterado"});

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

    private static IllegalArgumentException actionNotFound(String action) {
        return new IllegalArgumentException(("Invalid Action [" + action + "]"));
    }

}