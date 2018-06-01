package com.example;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//@WebServlet("/Example")
public class Example extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
   
        
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		String name = request.getParameter("name");
		//****cookies*****
		/*
		if(name.equals("krishna")){
			Cookie cookie = new Cookie("name", name);
			cookie.setMaxAge(60*60*7);
			response.addCookie(cookie);
			
			RequestDispatcher rd = request.getRequestDispatcher("Example2");
			rd.forward(request,response);
			
		}else{
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.forward(request, response);
		}
		*/
		
		
		//*****SessionExample****
		
		/*
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		
		if(name.equals("krishna")){
			RequestDispatcher rd = request.getRequestDispatcher("Example2");
			rd.forward(request,response);
			
		}else{
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.forward(request, response);
		}
		*/
		//********* RequestDispacher Example********
		
		
		/*
		if(name.equals("krish")){
			RequestDispatcher rd = request.getRequestDispatcher("Example2");
			rd.forward(request,response);
			
		}else{
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.forward(request, response);
		}
		*/
		
		//******SendRedirect*******
		
		if(name.equals("krish")){
			response.sendRedirect("https://www.google.com/");
			//rd.forward(request,response);
			
		}
		
		
	}

}
