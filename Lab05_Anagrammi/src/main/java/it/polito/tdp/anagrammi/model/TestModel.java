package it.polito.tdp.anagrammi.model;

public class TestModel {

	public static void main(String[] args) {
		model model = new model();
	
		//System.out.println(model.getTuttiICorsi());
          System.out.println(model.isAnagramma("abaca"));
          for(String p: model.ricerca("eat")) {
        	 if(model.isAnagramma(p)==true) {
        		 System.out.println(p + " è vero");
        	 }else {
        		 System.out.println(p + " è falso");
        	 }
        	  
          }
         
          
	}

}
