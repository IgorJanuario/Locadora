package br.com.locadora.jdbc.dao;

import java.sql.Connection;

import br.com.locadora.jdbc.ConnectionFactory;

public class VeiculoDao {

	private Connection connection;
	
	public VeiculoDao()
	{
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void inserir()
	{
		
	}
}
