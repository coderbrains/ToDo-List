package com.todo.serlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.todo.entity.Notes;

public class deleteservlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) {

		try {
			
			int id = Integer.parseInt(request.getParameter("note_id"));
			Session s = new Configuration().configure().buildSessionFactory().openSession();
			Transaction t =  s.beginTransaction();
			
			Notes  n = s.get(Notes.class, id);
			
			s.delete(n);
			
			
			

			t.commit();
			s.close();
			
			response.sendRedirect("seeToDo.jsp");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
