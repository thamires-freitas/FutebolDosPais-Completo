package br.com.futeboldospais.futeboldospais.dao;

import android.provider.BaseColumns;

/**
 * Created by Daniel Almeida on 05/10/2017.
 * Esta classe contem todas as informações necessárias para a criação das
 * tabelas do banco de dados SQLite utilizado na aplicação
 */

public class BancoDados {

    /**
     * Construtor privado, classe não deve ser instanciada diretamente
     */
    private BancoDados() {
    }

    ;

    /**
     * Versão do banco de dados da aplicação
     */
    public static final int BANCO_VERSAO = 1;
    /**
     * Nome do banco de dados da aplicação
     */
    public static final String BANCO_NOME = "FutebolDosPais.db";

    /**
     * Esta classe interna contem todas as informações necessárias para criação
     * e acesso as tabelas do banco de dados
     */
    public static class Tabela implements BaseColumns {

        /**
         * Dados padrão SQL
         */
        private static final String CRIAR_TABELA = "CREATE TABLE IF NOT EXISTS ";
        private static final String EXCLUIR_TABELA = "DROP TABLE IF EXISTS ";
        private static final String CHAVE_PRIMARIA = " PRIMARY KEY";
        private static final String AUTO_INCREMENTO = " AUTOINCREMENT";
        private static final String PARENTESES_ENTRADA = " (";
        private static final String PARENTESES_SAIDA = " )";
        private static final String VIRGULA = ",";

        /**
         * Tipos de dados dos atributos das colunas
         */
        private static final String TIPO_TEXTO = " TEXT";
        private static final String TIPO_INTEIRO = " INTEGER";
        private static final String TIPO_NUMERICO = " NUMERIC";

        /**
         * Dados da tabela de configuração
         */
        public static final String TABELA_CONFIGURACAO = "tabelaConfiguracao";
        public static final String COLUNA_CONFIGURACAO_ULTIMA_ATUALIZACAO = "ultimaAtualizacao";
        public static final String COLUNA_CONFIGURACAO_CAMPEONATO_ANO = "campeonatoAno";
        public static final String COLUNA_CONFIGURACAO_HOMENAGEADO = "homenageado";
        public static final String COLUNA_CONFIGURACAO_TEMA = "tema";
        public static final String COLUNA_CONFIGURACAO_VERSAO_ATUALIZACAO = "versaoAtualizacao";

        /**
         * Dados da tabela de classificação geral
         */
        public static final String TABELA_CLASSIFICACAO_GERAL = "tabelaClassificacaoGeral";
        public static final String COLUNA_CLASSIFICACAO_GERAL_EQUIPE = "equipe";
        public static final String COLUNA_CLASSIFICACAO_GERAL_PONTOS_GANHOS = "pontosGanhos";
        public static final String COLUNA_CLASSIFICACAO_GERAL_JOGOS = "jogos";
        public static final String COLUNA_CLASSIFICACAO_GERAL_VITORIAS = "vitorias";
        public static final String COLUNA_CLASSIFICACAO_GERAL_EMPATES = "empates";
        public static final String COLUNA_CLASSIFICACAO_GERAL_DERROTAS = "derrotas";
        public static final String COLUNA_CLASSIFICACAO_GERAL_GOLS_PRO = "golsPro";
        public static final String COLUNA_CLASSIFICACAO_GERAL_GOLS_CONTRA = "golsContra";
        public static final String COLUNA_CLASSIFICACAO_GERAL_SALDO_GOLS = "saldoGols";
        public static final String COLUNA_CLASSIFICACAO_GERAL_CARTOES_AMARELOS = "cartoesAmarelos";
        public static final String COLUNA_CLASSIFICACAO_GERAL_CARTOES_VERMELHOS = "cartoesVermelhos";

        /**
         * @author Denilson Araújo on 24/10/2017
         * @modifield Pâmela Fidelis and Vinicius Lopes on 28/10/2017
         * Dados da tabela de quartasFinais
         */
        public static final String TABELA_CLASSIFICACAO_QUARTAS = "tabelaClassificacaoQuartas";
        public static final String COLUNA_CLASSIFICACAO_QUARTAS_EQUIPE = "equipe";
        public static final String COLUNA_CLASSIFICACAO_QUARTAS_CATEGORIA = "categoria";
        public static final String COLUNA_CLASSIFICACAO_QUARTAS_GRUPO = "grupo";
        public static final String COLUNA_CLASSIFICACAO_QUARTAS_POSICAO = "posicao";
        public static final String COLUNA_CLASSIFICACAO_QUARTAS_PONTOS_GANHOS = "pontosGanhos";
        public static final String COLUNA_CLASSIFICACAO_QUARTAS_JOGOS = "jogos";
        public static final String COLUNA_CLASSIFICACAO_QUARTAS_VITORIAS = "vitorias";
        public static final String COLUNA_CLASSIFICACAO_QUARTAS_EMPATES = "empates";
        public static final String COLUNA_CLASSIFICACAO_QUARTAS_DERROTAS = "derrotas";
        public static final String COLUNA_CLASSIFICACAO_QUARTAS_GOLS_PRO = "golsPro";
        public static final String COLUNA_CLASSIFICACAO_QUARTAS_GOLS_CONTRA = "golsContra";
        public static final String COLUNA_CLASSIFICACAO_QUARTAS_SALDO_GOLS = "saldoGols";

        /**
         * Dados da tabela de artilharia
         */
        public static final String TABELA_ARTILHARIA = "tabelaArtilharia";
        public static final String COLUNA_ARTILHARIA_NOME = "nome";
        public static final String COLUNA_ARTILHARIA_GOLS = "gols";
        public static final String COLUNA_ARTILHARIA_EQUIPE = "equipe";
        public static final String COLUNA_ARTILHARIA_NUMERO = "numero";
        public static final String COLUNA_ARTILHARIA_POSICAO = "posicao";
        public static final String COLUNA_ARTILHARIA_CATEGORIA = "categoria";
        public static final String COLUNA_ARTILHARIA_CARTOES_AMARELOS = "cartoesAmarelos";
        public static final String COLUNA_ARTILHARIA_CARTOES_VERMELHOS = "cartoesVermelhos";

        /**
         * Dados da tabela de cartão amarelo
         */
        public static final String TABELA_CARTAO_AMARELO = "tabelaCartaoAmarelo";
        public static final String COLUNA_CARTAO_AMARELO_EQUIPE = "equipe";
        public static final String COLUNA_CARTAO_AMARELO_NUMERO = "numero";
        public static final String COLUNA_CARTAO_AMARELO_JOGADOR = "jogador";
        public static final String COLUNA_CARTAO_AMARELO_DATA = "data";
        public static final String COLUNA_CARTAO_AMARELO_TEMPO = "tempo";
        public static final String COLUNA_CARTAO_AMARELO_ADVERSARIO = "adversario";
        public static final String COLUNA_CARTAO_AMARELO_ARBITRO = "arbitro";

        /**
         * Dados da tabela de cartão vermelho
         */
        public static final String TABELA_CARTAO_VERMELHO = "tabelaCartaoVermelho";
        public static final String COLUNA_CARTAO_VERMELHO_EQUIPE = "equipe";
        public static final String COLUNA_CARTAO_VERMELHO_NUMERO = "numero";
        public static final String COLUNA_CARTAO_VERMELHO_JOGADOR = "jogador";
        public static final String COLUNA_CARTAO_VERMELHO_DATA = "data";
        public static final String COLUNA_CARTAO_VERMELHO_TEMPO = "tempo";
        public static final String COLUNA_CARTAO_VERMELHO_ADVERSARIO = "adversario";
        public static final String COLUNA_CARTAO_VERMELHO_ARBITRO = "arbitro";

        /**
         * Dados da tabela de suspensão
         */
        public static final String TABELA_SUSPENSAO = "tabelaSuspensao";
        public static final String COLUNA_SUSPENSAO_EQUIPE = "equipe";
        public static final String COLUNA_SUSPENSAO_JOGADOR = "jogador";
        public static final String COLUNA_SUSPENSAO_NUMERO = "numero";
        public static final String COLUNA_SUSPENSAO_CATEGORIA = "categoria";
        public static final String COLUNA_SUSPENSAO_CRITERIO = "criterio";
        public static final String COLUNA_SUSPENSAO_JOGOS = "jogos";
        public static final String COLUNA_SUSPENSAO_MOTIVO = "motivo";

        /**
         * Dados da tabela de resultado
         */
        public static final String TABELA_RESULTADO = "tabelaResultado";
        public static final String COLUNA_RESULTADO_DATA = "data";
        public static final String COLUNA_RESULTADO_HORARIO = "horario";
        public static final String COLUNA_RESULTADO_EQUIPE1 = "equipe1";
        public static final String COLUNA_RESULTADO_GOLS_EQUIPE1 = "golsEquipe1";
        public static final String COLUNA_RESULTADO_EQUIPE2 = "equipe2";
        public static final String COLUNA_RESULTADO_GOLS_EQUIPE2 = "golsEquipe2";
        public static final String COLUNA_RESULTADO_CARTOES_AMARELOS = "cartoesAmarelos";
        public static final String COLUNA_RESULTADO_CARTOES_VERMELHOS = "cartoesVermelhos";
        public static final String COLUNA_RESULTADO_TOTAL_CARTOES = "totalCartoes";
        public static final String COLUNA_RESULTADO_CATEGORIA = "categoria";
        public static final String COLUNA_RESULTADO_ARBITRO = "arbitro";
        public static final String COLUNA_RESULTADO_ASSISTENTE1 = "assistente1";
        public static final String COLUNA_RESULTADO_ASSISTENTE2 = "assistente2";
        public static final String COLUNA_RESULTADO_NOTA_ARBITRO_MEDIA = "notaArbitroMedia";
        public static final String COLUNA_RESULTADO_NOTA_ARBITRO_EQUIPE1 = "notaArbitroEquipe1";
        public static final String COLUNA_RESULTADO_NOTA_ARBITRO_EQUIPE2 = "notaArbitroEquipe2";
        public static final String COLUNA_RESULTADO_RODADA = "rodada";
        public static final String COLUNA_RESULTADO_TURNO = "turno";
        public static final String COLUNA_RESULTADO_VENCEDOR = "vencedor";
    }

    /**
     * Comando SQL para criar a tabela de configuração
     */
    public static final String CRIAR_TABELA_CONFIGURACAO = Tabela.CRIAR_TABELA + Tabela.TABELA_CONFIGURACAO + Tabela.PARENTESES_ENTRADA +
            Tabela._ID + Tabela.TIPO_INTEIRO + Tabela.CHAVE_PRIMARIA + Tabela.AUTO_INCREMENTO + Tabela.VIRGULA +
            Tabela.COLUNA_CONFIGURACAO_ULTIMA_ATUALIZACAO + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_CONFIGURACAO_CAMPEONATO_ANO + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_CONFIGURACAO_HOMENAGEADO + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_CONFIGURACAO_TEMA + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_CONFIGURACAO_VERSAO_ATUALIZACAO + Tabela.TIPO_INTEIRO + Tabela.PARENTESES_SAIDA;

    /**
     * Comando SQL para criar a tabela de classificaçao
     */
    public static final String CRIAR_TABELA_CLASSIFICACAO_GERAL = Tabela.CRIAR_TABELA + Tabela.TABELA_CLASSIFICACAO_GERAL + Tabela.PARENTESES_ENTRADA +
            Tabela._ID + Tabela.TIPO_INTEIRO + Tabela.CHAVE_PRIMARIA + Tabela.AUTO_INCREMENTO + Tabela.VIRGULA +
            Tabela.COLUNA_CLASSIFICACAO_GERAL_EQUIPE + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_CLASSIFICACAO_GERAL_PONTOS_GANHOS + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_CLASSIFICACAO_GERAL_JOGOS + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_CLASSIFICACAO_GERAL_VITORIAS + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_CLASSIFICACAO_GERAL_EMPATES + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_CLASSIFICACAO_GERAL_DERROTAS + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_CLASSIFICACAO_GERAL_GOLS_PRO + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_CLASSIFICACAO_GERAL_GOLS_CONTRA + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_CLASSIFICACAO_GERAL_SALDO_GOLS + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_CLASSIFICACAO_GERAL_CARTOES_AMARELOS + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_CLASSIFICACAO_GERAL_CARTOES_VERMELHOS + Tabela.TIPO_INTEIRO + Tabela.PARENTESES_SAIDA;

    /**
     * @author : Denilson araújo on 24/10/2017
     * @modifield : Pâmela Fidelis and Vinicius Lopes on 28/10/2017
     * Comando SQL para criar a tabela de quartas de finais
     */
    public static final String CRIAR_TABELA_CLASSIFICACAO_QUARTAS = Tabela.CRIAR_TABELA + Tabela.TABELA_CLASSIFICACAO_QUARTAS + Tabela.PARENTESES_ENTRADA +
            Tabela._ID + Tabela.TIPO_INTEIRO + Tabela.CHAVE_PRIMARIA + Tabela.AUTO_INCREMENTO + Tabela.VIRGULA +
            Tabela.COLUNA_CLASSIFICACAO_QUARTAS_EQUIPE + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_CLASSIFICACAO_QUARTAS_CATEGORIA + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_CLASSIFICACAO_QUARTAS_GRUPO + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_CLASSIFICACAO_QUARTAS_POSICAO + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_CLASSIFICACAO_QUARTAS_PONTOS_GANHOS + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_CLASSIFICACAO_QUARTAS_JOGOS + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_CLASSIFICACAO_QUARTAS_VITORIAS + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_CLASSIFICACAO_QUARTAS_EMPATES + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_CLASSIFICACAO_QUARTAS_DERROTAS + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_CLASSIFICACAO_QUARTAS_GOLS_PRO + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_CLASSIFICACAO_QUARTAS_GOLS_CONTRA + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_CLASSIFICACAO_QUARTAS_SALDO_GOLS + Tabela.TIPO_INTEIRO + Tabela.PARENTESES_SAIDA;

    /**
     * Comando SQL para criar a tabela de artilharia
     */
    public static final String CRIAR_TABELA_ARTILHARIA = Tabela.CRIAR_TABELA + Tabela.TABELA_ARTILHARIA + Tabela.PARENTESES_ENTRADA +
            Tabela._ID + Tabela.TIPO_INTEIRO + Tabela.CHAVE_PRIMARIA + Tabela.AUTO_INCREMENTO + Tabela.VIRGULA +
            Tabela.COLUNA_ARTILHARIA_NOME + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_ARTILHARIA_GOLS + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_ARTILHARIA_EQUIPE + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_ARTILHARIA_NUMERO + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_ARTILHARIA_POSICAO + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_ARTILHARIA_CATEGORIA + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_ARTILHARIA_CARTOES_AMARELOS + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_ARTILHARIA_CARTOES_VERMELHOS + Tabela.TIPO_INTEIRO + Tabela.PARENTESES_SAIDA;

    /**
     * Comando SQL para criar a tabela de cartão amarelo
     */
    public static final String CRIAR_TABELA_CARTAO_AMARELO = Tabela.CRIAR_TABELA + Tabela.TABELA_CARTAO_AMARELO + Tabela.PARENTESES_ENTRADA +
            Tabela._ID + Tabela.TIPO_INTEIRO + Tabela.CHAVE_PRIMARIA + Tabela.AUTO_INCREMENTO + Tabela.VIRGULA +
            Tabela.COLUNA_CARTAO_AMARELO_EQUIPE + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_CARTAO_AMARELO_NUMERO + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_CARTAO_AMARELO_JOGADOR + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_CARTAO_AMARELO_DATA + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_CARTAO_AMARELO_TEMPO + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_CARTAO_AMARELO_ADVERSARIO + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_CARTAO_AMARELO_ARBITRO + Tabela.TIPO_TEXTO + Tabela.PARENTESES_SAIDA;

    /**
     * Comando SQL para criar a tabela de cartão vermelho
     */
    public static final String CRIAR_TABELA_CARTAO_VERMELHO = Tabela.CRIAR_TABELA + Tabela.TABELA_CARTAO_VERMELHO + Tabela.PARENTESES_ENTRADA +
            Tabela._ID + Tabela.TIPO_INTEIRO + Tabela.CHAVE_PRIMARIA + Tabela.AUTO_INCREMENTO + Tabela.VIRGULA +
            Tabela.COLUNA_CARTAO_VERMELHO_EQUIPE + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_CARTAO_VERMELHO_NUMERO + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_CARTAO_VERMELHO_JOGADOR + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_CARTAO_VERMELHO_DATA + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_CARTAO_VERMELHO_TEMPO + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_CARTAO_VERMELHO_ADVERSARIO + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_CARTAO_VERMELHO_ARBITRO + Tabela.TIPO_TEXTO + Tabela.PARENTESES_SAIDA;

    /**
     * Comando SQL para criar a tabela de suspensão
     */
    public static final String CRIAR_TABELA_SUSPENSAO = Tabela.CRIAR_TABELA + Tabela.TABELA_SUSPENSAO + Tabela.PARENTESES_ENTRADA +
            Tabela._ID + Tabela.TIPO_INTEIRO + Tabela.CHAVE_PRIMARIA + Tabela.AUTO_INCREMENTO + Tabela.VIRGULA +
            Tabela.COLUNA_SUSPENSAO_EQUIPE + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_SUSPENSAO_JOGADOR + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_SUSPENSAO_NUMERO + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_SUSPENSAO_CATEGORIA + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_SUSPENSAO_CRITERIO + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_SUSPENSAO_JOGOS + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_SUSPENSAO_MOTIVO + Tabela.TIPO_TEXTO + Tabela.PARENTESES_SAIDA;

    /**
     * Comando SQL para criar a tabela de resultado
     */
    public static final String CRIAR_TABELA_RESULTADO = Tabela.CRIAR_TABELA + Tabela.TABELA_RESULTADO + Tabela.PARENTESES_ENTRADA +
            Tabela._ID + Tabela.TIPO_INTEIRO + Tabela.CHAVE_PRIMARIA + Tabela.AUTO_INCREMENTO + Tabela.VIRGULA +
            Tabela.COLUNA_RESULTADO_DATA + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_RESULTADO_HORARIO + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_RESULTADO_EQUIPE1 + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_RESULTADO_GOLS_EQUIPE1 + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_RESULTADO_EQUIPE2 + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_RESULTADO_GOLS_EQUIPE2 + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_RESULTADO_CARTOES_AMARELOS + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_RESULTADO_CARTOES_VERMELHOS + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_RESULTADO_TOTAL_CARTOES + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_RESULTADO_CATEGORIA + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_RESULTADO_ARBITRO + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_RESULTADO_ASSISTENTE1 + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_RESULTADO_ASSISTENTE2 + Tabela.TIPO_TEXTO + Tabela.VIRGULA +
            Tabela.COLUNA_RESULTADO_NOTA_ARBITRO_MEDIA + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_RESULTADO_NOTA_ARBITRO_EQUIPE1 + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_RESULTADO_NOTA_ARBITRO_EQUIPE2 + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_RESULTADO_RODADA + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_RESULTADO_TURNO + Tabela.TIPO_INTEIRO + Tabela.VIRGULA +
            Tabela.COLUNA_RESULTADO_VENCEDOR + Tabela.TIPO_INTEIRO + Tabela.PARENTESES_SAIDA;

    /**
     * Comando SQL para excluir a tabela de configuração
     */
    public static final String DELETAR_TABELA_CONFIGURACAO =
            Tabela.EXCLUIR_TABELA + Tabela.TABELA_CONFIGURACAO;

    /**
     * Comando SQL para excluir a tabela de classificação geral
     */
    public static final String DELETAR_TABELA_CLASSIFICACAO_GERAL =
            Tabela.EXCLUIR_TABELA + Tabela.TABELA_CLASSIFICACAO_GERAL;

    /**
     * @author: Pâmela Fidelis and Vinicius on 28/10/2017
     * Comando SQL para excluir a tabela de Quartas de finais
     */
    public static final String DELETAR_TABELA_CLASSIFICACAO_QUARTAS =
            Tabela.EXCLUIR_TABELA + Tabela.TABELA_CLASSIFICACAO_QUARTAS;

    /**
     * Comando SQL para excluir a tabela de artilharia
     */
    public static final String DELETAR_TABELA_ARTILHARIA =
            Tabela.EXCLUIR_TABELA + Tabela.TABELA_ARTILHARIA;

    /**
     * Comando SQL para excluir a tabela de cartão amarelo
     */
    public static final String DELETAR_TABELA_AMARELO =
            Tabela.EXCLUIR_TABELA + Tabela.TABELA_CARTAO_AMARELO;

    /**
     * Comando SQL para excluir a tabela de cartão vermelho
     */
    public static final String DELETAR_TABELA_VERMELHO =
            Tabela.EXCLUIR_TABELA + Tabela.TABELA_CARTAO_VERMELHO;

    /**
     * Comando SQL para excluir a tabela de suspensão
     */
    public static final String DELETAR_TABELA_SUSPENSAO =
            Tabela.EXCLUIR_TABELA + Tabela.TABELA_SUSPENSAO;

    /**
     * Comando SQL para excluir a tabela de resultado
     */
    public static final String DELETAR_TABELA_RESULTADO =
            Tabela.EXCLUIR_TABELA + Tabela.TABELA_RESULTADO;

}
