package it.polito.tdp.anagrammi.model.AnagDAO;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionDB {
	private static final String jdbcURL = "jdbc:mysql://localhost/dizionario";
	private static HikariDataSource ds;

	public static Connection getConnection() {
		if (ds == null) {
			HikariConfig config = new HikariConfig();
			config.setJdbcUrl(jdbcURL);
			config.setUsername("root");
			config.setPassword("root");

			config.addDataSourceProperty("cachePrepStmts", true);
			config.addDataSourceProperty("prepStmtChacheSize", 250);
			config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

			ds = new HikariDataSource(config);
		}
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			System.err.println("Errore di connessione al DB");
			throw new RuntimeException(e);
		}
	}

}
