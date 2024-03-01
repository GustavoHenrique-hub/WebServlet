package br.edu.senaisp.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/olababe")
public class OlaMundo extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		Integer valor1 = Integer.parseInt(req.getParameter("param1"));
		Integer valor2 = Integer.parseInt(req.getParameter("param2"));
		String operacao = req.getParameter("param3");
		
		try {
			
			if(operacao.equals("soma")) {
				res.getWriter().append("<html><h1>" + valor1 + " + " + valor2 + " = " + (valor1 + valor2) + "</h1></html>");	
			}else {
				res.getWriter().append("<html><h1>" + valor1 + " - " + valor2 + " = " +  (valor1 - valor2) + "</h1></html>");	
			}
		}catch(Exception e) {
			res.getWriter().append("<html><h1>ERRO: " + e + "</h1></html>");
			}
		
		
		
		
	}
}
