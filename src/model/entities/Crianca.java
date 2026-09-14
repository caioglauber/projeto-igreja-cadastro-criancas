package model.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import enumerador.Sexo;

public class Crianca implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private Sexo sexo;
	private List<Responsavel> responsavel;
	
	public Crianca() {
	}

	public Crianca(Integer id, String name, Sexo sexo) {
		this.id = id;
		this.name = name;
		this.sexo = sexo;
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

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public List<Responsavel> getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(List<Responsavel> responsavel) {
		this.responsavel = responsavel;
	}

	@Override
	public String toString() {
		return "Crianca [id=" + id + ", name=" + name + ", sexo=" + sexo + "]";
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
		Crianca other = (Crianca) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
}
