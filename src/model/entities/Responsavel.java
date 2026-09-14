package model.entities;

import java.io.Serializable;
import java.util.Objects;

import enumerador.Sexo;

public class Responsavel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private Sexo sexo;
	private String telefone;
	
	
	public Responsavel() {
	}

	public Responsavel(Integer id, String name, String telefone) {
		
		this.id = id;
		this.name = name;
		this.telefone = telefone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Responsavel other = (Responsavel) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Responsavel [id=" + id + ", name=" + name + ", telefone=" + telefone + "]";
	}
	
	
	
	
	
}
