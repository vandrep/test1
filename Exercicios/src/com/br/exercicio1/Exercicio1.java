package com.br.exercicio1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Exercicio1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Exercicio1() {
        super();
    }
    
    @Override
    public void init() throws ServletException {
    	System.out.println("Servlet " + this.getServletName() + " iniciado.");
    }
    
    @Override
    public void destroy() {
    	System.out.println("Servlet " + this.getServletName() + " encerrado.");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().println("Hello, World!");
		response.getWriter().println("Nome do servlet: " + this.getServletName());
		response.getWriter().println("Tipo de conteúdo: " + request.getContentType());
		response.getWriter().println("Encoding: " + request.getCharacterEncoding());
		response.getWriter().println("URL: " + request.getRequestURL());
		response.getWriter().println("URI: " + request.getRequestURI());
		response.getWriter().println("Servlet path: " + request.getServletPath());
		response.getWriter().println("Header: " + request.getHeaderNames());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
