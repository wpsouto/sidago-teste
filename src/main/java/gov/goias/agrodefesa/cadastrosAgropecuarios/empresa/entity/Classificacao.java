package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.entity;

public enum Classificacao {

    CLUBE_DE_LAÇO_EMPRESA_PRIVADA(new String[]{"109", "CLUBE DE LAÇO - EMPRESA PRIVADA"}),
    ABATEDOURO_SIF(new String[]{"56", "Abatedouro SIF"}),
    ABATEDOURO_SIM(new String[]{"150", "Abatedouro SIM"});

    public Integer id;
    public String descricao;

    Classificacao(String[] aliases){
        this.id = Integer.valueOf(aliases[0]);
        this.descricao = aliases[1];
    }

    public static Classificacao classificacaoForName(String classificacaoString) throws IllegalArgumentException{
        for(Classificacao classificacao: values()){
                if(classificacao.descricao.equalsIgnoreCase(classificacaoString)){
                    return classificacao;
                }
        }
        throw classificacaoNotFound(classificacaoString);
    }

    private static IllegalArgumentException classificacaoNotFound(String classificacao) {
        return new IllegalArgumentException(("Invalid Action [" + classificacao + "]"));
    }

}
