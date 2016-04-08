package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa;

import java.util.HashSet;
import java.util.Set;

public enum Label {

    CPF_CNPJ(new String[]{"CPF/CNPJ", "true", "0"}),
    INSCRICAO_ESTADUAL(new String[]{"Inscrição Estadual", "true", "0"}),
    RAZAO_SOCIAL(new String[]{"Razão Social", "true", "0"}),
    NOME_FANTASIA(new String[]{"Nome Fantasia", "true", "0"}),
    SOCIOS(new String[]{"Sócios", "true", "0"}),
    ENDERECO(new String[]{"Endereço", "true", "0"}),
    MUNICIPIO(new String[]{"Munícipio", "true", "0"}),
    TELEFONE(new String[]{"Telefone", "true", ""}),
    CLASSIFICACAO(new String[]{"Classificação", "true", "0"}),
    FINALIDADE(new String[]{"Finalidade", "true", "0"}),
    PESSOA_CONTATO(new String[]{"Pessoa para contato", "true", "0"}),
    N_PROCESSO(new String[]{"Nº processo", "true", "0"}),
    DATA_CREDENCIAMENTO(new String[]{"Data de Credenciamento", "true", "0"}),
    DATA_RESPONSAVEL_ALTERACAO(new String[]{"Data e responsável pela última alteração no cadastro", "true", "0"}),
    EMAIL(new String[]{"Email", "true", "0"}),
    PROCURADOR(new String[]{"Procurador", "true", "0"}),

    RESPONSAVEL_TECNICO(new String[]{"Responsável técnico", "false", "52-53-54-55-59-60-62-63-65-71-72-73-74-75-76-77-78-85-81-86-87-90-91-92-93-95-97-102-107-108-109-100-101-110-111-112-113-114-115-116-117-118-119-120-121-122-123-124-125-126-127-128-129-131-132-133-134-135-136-138-139-137-141-142-144-146-149-152"}),
    PORTE_EMPRESA(new String[]{"Porte da Empresa", "false", "60-62-63-71-87-93-97-127-128-129-131-134-135-136-138-139-137-141-142-144-152"}),
    N_RENASEM(new String[]{"Nº RENASEM", "false", "96-145"}),
    CAPACIDADE_ALOJAMENTO(new String[]{"Capacidade de alojamento", "false", "76-77-102"}),
    SISBI(new String[]{"Sisbi", "false", "52-53-54-55-72-73-75-81-85-100-101-127-133-146"}),
    N_SERVICO_INSPECAO(new String[]{"Nº Serviço Inspeção", "false", "52-53-54-55-72-73-75-81-85-100-101-127-133-146"}),
    QTDE_ANIMAIS_PROCESSADOS(new String[]{"Qtde animais processados/dia (Kgs)", "false", "73-75-81-101-133"}),
    QTDE_ANIMAIS_ABATIDOS(new String[]{"Qtde animais abatidos", "false", "52-53-54-55"}),
    QTDE_LITROS_LEITE(new String[]{"Qtde litros de leite/dia", "false", "52-53-54-55-85-146"}),
    VACINAS(new String[]{"Vacinas", "false", "62-63-71-97-128-129-131-136-139-137-141-142-147-152"}),
    N_EVENTO(new String[]{"Nº do Evento", "false", "59-65-74-78-86-90-91-92-95-107-108-109-110-111-112-113-114-115-116-117-118-119-120-121-122-123-124-125-126-132-149"});

    public String descricao;
    public Boolean obrigatorio;
    public Set classificacao = new HashSet<>();

    Label(String[] aliases) {
        this.descricao = aliases[0];
        this.obrigatorio = Boolean.valueOf(aliases[1]);
        if (!this.obrigatorio) {
            String[] str = aliases[2].split("-");
            for (int i = 0; i < str.length; i++) {
                classificacao.add(Integer.valueOf(str[i]));
            }
        }
    }

}
