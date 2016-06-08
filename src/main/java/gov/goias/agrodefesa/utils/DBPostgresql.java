package gov.goias.agrodefesa.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by wemerson on 08/06/16.
 */
public class DBPostgresql {
    private static final Logger log = LoggerFactory.getLogger(DBPostgresql.class);
    private static final String URL = "jdbc:postgresql://bdteste.agrodefesa.go.gov.br:5432/sistemas_prod_19-01-2016";
    private static final String USER = "postgres";
    private static final String PASSWORD = "@postgres";

    private static Connection getConnectionManual() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            log.error("Erro fatal ao obter conexao com banco", e);
        }

        return conn;
    }

    public static void executeUpdate(String sql){
        try {
            Statement stm = getConnectionManual().createStatement();
            stm.executeUpdate(sql);
            getConnectionManual().close();
        } catch (SQLException e) {
            log.error("Erro fatal ao executar Update {}", sql, e);
        }
    }

    public static void main(String[] args) {
        DBPostgresql.executeUpdate("UPDATE agrofin.boleto SET situacao = 'p' WHERE id = 4493640");
    }
}
