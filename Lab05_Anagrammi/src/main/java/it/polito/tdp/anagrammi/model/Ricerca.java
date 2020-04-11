package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.List;

public class Ricerca {
	public List<String> soluzione;
	
	

	public List<String> ricerca(String parola){
		
		this.soluzione= new ArrayList<>();
		int livello = 0;
		
		List<Character> caratteri = new ArrayList<>();
		for (int i = 0; i < parola.length(); i++) { 
            caratteri.add(parola.charAt(i));
        } 
		Ricorsiva("", livello, caratteri);
		return soluzione;
	}
	
	private void Ricorsiva(String parziale, int livello, List<Character> caratteri) {
		if(caratteri.size()==0) {
			soluzione.add(parziale);
		}
		for(Character c: caratteri) {
			String soluzione = parziale + c;
			List<Character> rimanenti = new ArrayList<>(caratteri);
			rimanenti.remove(c);
			Ricorsiva(soluzione, livello+1, rimanenti);
			
			
		}
	}
	

}
