package br.com.locadora.jdbc.servlet;

import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.locadora.jdbc.dao.ClienteDAO;
import br.com.locadora.jdbc.model.Cliente;

@WebServlet("/cadastrocliente")
public class cadastrocliente extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse resp)
	{
		String nome = req.getParameter("nome");
		String RG = req.getParameter("RG");
		String CPF = req.getParameter("CPF");
		String telefone = req.getParameter("telefone");
		String sexo = req.getParameter("sexo");
		String email = req.getParameter("email");
		
		Calendar datadnascimento = Calendar.getInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String datanasc = req.getParameter("datadenascimento");

		try {
			Date data = (Date) sdf.parse(datanasc);
			datadnascimento.setTime(data);
		} catch (ParseException e1) {
			throw new RuntimeException(e1);
		}
		
		int numeroderegistro = Integer.parseInt(req.getParameter("numeroderegistro"));
		String estadoemissor = req.getParameter("estadoemissor");
		
		Calendar validade = Calendar.getInstance();
		Date validadeCNH;
		try {
			validadeCNH = (Date) sdf.parse(req.getParameter("validadeCNH"));
			validade.setTime(validadeCNH);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
		
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setRG(RG);
		cliente.setCPF(CPF);
		cliente.setTelefone(telefone);
		cliente.setSexo(sexo);
		cliente.setEmail(email);
		cliente.setDatadnascimento(datadnascimento);
		cliente.setNumeroderegistro(numeroderegistro);
		cliente.setEstadoemissor(estadoemissor);
		cliente.setValidadeCNH(validade);
		
		ClienteDAO dao = new ClienteDAO();
		dao.adicionar(cliente);

	}
}