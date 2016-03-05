package br.com.locadora.jdbc.teste;

import java.util.ArrayList;

import br.com.locadora.jdbc.dao.ClienteDAO;
import br.com.locadora.jdbc.model.Cliente;

public class Teste {

	public static void main(String[] args) {
		
		ClienteDAO dao = new ClienteDAO();
		ArrayList<Cliente> clientes = dao.getLista();
		
		for(Cliente cliente : clientes)
		{
			System.out.println(cliente.getNome());
		}

	}

}
