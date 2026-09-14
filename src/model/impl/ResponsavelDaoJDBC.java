package model.impl;

import java.sql.Connection;
import java.util.List;

import model.dao.ResponsavelDao;
import model.entities.Responsavel;

public class ResponsavelDaoJDBC implements ResponsavelDao {

	private Connection conn;
	
	public ResponsavelDaoJDBC(Connection conn) { // injeção de dependencia
		this.conn = conn;
	}
	
@Override
	public void insert(Responsavel crianca) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Responsavel crianca) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Responsavel crianca) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Responsavel findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Responsavel> finAll(Responsavel crianca) {
		// TODO Auto-generated method stub
		return null;
	}

}
