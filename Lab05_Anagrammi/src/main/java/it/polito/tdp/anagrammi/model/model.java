package it.polito.tdp.anagrammi.model;

import java.util.List;

import it.polito.tdp.anagrammi.model.AnagDAO.AnagrammiDao;
import it.polito.tdp.anagrammi.model.AnagDAO.TestDB;

public class model {
	private AnagrammiDao anagramma;
    private TestDB controllo;
    private Ricerca ricerca;
	/**
	 * @param dizionario
	 */
	public model() {
		this.controllo= new TestDB();
		this.anagramma = new AnagrammiDao();
		this.ricerca= new Ricerca();
	}
	
	//Controllo Generale
	public List<Dizionario> getTuttiICorsi(){
		return controllo.getTuttiICorsi();
	}
	//Controllo Parola
	public boolean isAnagramma(String parola){
		return anagramma.isAnagramma(parola);
	}
	public List<String> ricerca(String parola){
		return ricerca.ricerca(parola);
	}
	

}
