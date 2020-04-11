package it.polito.tdp.anagrammi.model.AnagDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.anagrammi.model.Dizionario;



public class AnagrammiDao {
	
	public boolean isAnagramma(String parola) {
		final String sql = "SELECT COUNT(*) AS tot FROM parola where nome= ? ";
		boolean isCorrect = false;
		try {
			Connection conn = ConnectionDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, parola);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				Integer tot = rs.getInt("tot");
				if(tot>0) {
					isCorrect=true;
				}else {
					isCorrect=false;
				}

			}

			conn.close();

			
		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db", e);
		}
		return isCorrect;
	}
	

	/*	List<Dizionario> dizionario = new ArrayList<Dizionario>();

		try {
			Connection conn = ConnectionDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, parola);
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
	*/

}
