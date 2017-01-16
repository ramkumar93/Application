package com.controller;

import java.io.IOException;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.controller.PMF;
import com.tables.personal;

public class ContactServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Data Stored");
		PersistenceManager p = PMF.get().getPersistenceManager();
		
		Long id = (long) 201435;
		try
		{
		Query q1 = p.newQuery(personal.class);
		q1.setFilter("id == "+id);
			

		List<personal> person = (List<personal>) q1.execute();
		
		for (personal cont : person) {
			
			resp.getWriter().println("FirstName : "+cont.getFirstName());
			resp.getWriter().println("LastName : "+cont.getLastName());
			resp.getWriter().println();
			resp.getWriter().println();
			resp.getWriter().println();
			
		}
		    
		
		}catch(Exception e){
			System.out.println(e);
		}
	}
		
		
}
