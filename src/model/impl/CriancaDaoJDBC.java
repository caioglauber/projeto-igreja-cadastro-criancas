package model.impl;

import java.sql.Connection;
import java.util.List;

import model.dao.CriancaDao;
import model.entities.Crianca;

public class CriancaDaoJDBC  implements CriancaDao{

	private Connection conn;

	public CriancaDaoJDBC(Connection conn) { // injeção de dependencia
		this.conn = conn;
	}
	
	@Override
	public void insert(Crianca crianca) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Crianca crianca) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Crianca crianca) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Crianca findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Crianca> finAll(Crianca crianca) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
