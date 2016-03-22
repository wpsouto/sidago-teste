package gov.goias.agrodefesa.admin.navigation;

public class NavegacaoFactory {
	private static Navegacao navigator = null;
	
	public static synchronized Navegacao getNavigator(){
		if(navigator == null){
			navigator = new Navegacao();
		}
		return navigator;
	}
}
