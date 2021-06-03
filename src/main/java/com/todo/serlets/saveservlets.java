package com.todo.serlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.todo.entity.Notes;


public class saveservlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		
		try {
			String title = request.getParameter("title");
			String content = request.getParameter("description");
			
			
			Notes notes = new Notes(title, content, new Date());
			session.save(notes);
			
			response.sendRedirect("seeToDo.jsp");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		t.commit();
		session.close();
	}

}
