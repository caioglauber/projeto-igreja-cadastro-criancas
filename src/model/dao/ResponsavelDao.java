package model.dao;

import java.util.List;

import model.entities.Crianca;
import model.entities.Responsavel;

public interface ResponsavelDao {

	void insert(Responsavel crianca);
	void update(Responsavel crianca);
	void delete(Responsavel crianca);
	Responsavel findById(Integer id);
	List<Responsavel> finAll(Responsavel crianca);
}
