package it.polito.tdp.anagrammi.model;

public class Dizionario {
     private Integer id;
     private String nome;
     
     //Costruttore con chiave primaria
     //Costruttore con entrambi i campi
	/**
	 * @param id
	 */
	public Dizionario(Integer id) {
		super();
		this.id = id;
	}
	/**
	 * @param id
	 * @param nome
	 */
	public Dizionario(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	//Getter and Setters
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Controllo hash e equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dizionario other = (Dizionario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	//Funzione toString
	@Override
	public String toString() {
		return "id=" + id + ", nome=" + nome ;
	}
	
     
     
}
