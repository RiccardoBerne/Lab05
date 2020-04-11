package it.polito.tdp.anagrammi.model.AnagDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.anagrammi.model.Dizionario;

public class TestDB {
	
	public List<Dizionario> getTuttiICorsi() {

		final String sql = "SELECT * FROM parola";

		List<Dizionario> dizionario = new ArrayList<Dizionario>();

		try {
			Connection conn = ConnectionDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);

			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				Integer id= rs.getInt("id");
				String nome= rs.getString("nome");
	            Dizionario d = new Dizionario(id, nome);
	            dizionario.add(d);

			}

			conn.close();

			
		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db", e);
		}
		return dizionario;
	}


}
