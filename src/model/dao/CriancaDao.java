package model.dao;

import java.util.List;

import model.entities.Crianca;

public interface CriancaDao {

	void insert(Crianca crianca);
	void update(Crianca crianca);
	void delete(Crianca crianca);
	Crianca findById(Integer id);
	List<Crianca> finAll(Crianca crianca);
	
}
