package com.controller;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.jdo.annotations.Persistent;
import javax.servlet.http.*;

import com.controller.PMF;
import com.tables.personal;

@SuppressWarnings("serial")
public class ApplicationServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		PersistenceManager p 	= 	PMF.get().getPersistenceManager();
		personal person			=	new personal();
		
		Long id 					    = 	Long.valueOf(req.getParameter("id"));
		String name 					= 	(String) req.getParameter("firstname");
		String middleName 				= 	(String) req.getParameter("middlename");
		String lastName 				= 	(String) req.getParameter("lastname");
		String day 	    		    	= 	(String) req.getParameter("day");
		String month			 		= 	(String) req.getParameter("month");
		String year				 		= 	(String) req.getParameter("year");
		String age				 		= 	(String) req.getParameter("age");
		String gender	 				= 	(String) req.getParameter("gender");
		String fatherName 				= 	(String) req.getParameter("fathername");
		String fatherOccupation 		= 	(String) req.getParameter("fatheroccupation");
		String motherName 				= 	(String) req.getParameter("mothername");
		String annualIncome 			= 	(String) req.getParameter("annualincome");
		String religion 				= 	(String) req.getParameter("religion");
		String caste			 		= 	(String) req.getParameter("caste");
		String stp 						= 	(String) req.getParameter("stp");
		String exserviceman 			= 	(String) req.getParameter("exserviceman");
		String bloodGroup 				= 	(String) req.getParameter("bloodgroup");
		
		System.out.println("FirstName "+name);
		System.out.println("MiddleName "+middleName);
		person.setId(id);
		person.setFirstName(name);
		person.setMiddleName(middleName);
		person.setLastName(lastName);
		person.setDay(day);
		person.setMonth(month);
		person.setYear(year);
		person.setGender(gender);
		person.setFatherName(fatherName);
		person.setFatherOccupation(fatherOccupation);
		person.setMotherName(motherName);
		person.setAnnualIncome(annualIncome);
		person.setReligion(religion);
		person.setCaste(caste);
		person.setBloogGroup(bloodGroup);
		person.setExserviceman(exserviceman);
		person.setStp(stp);
		person.setAge(age);
	
	
		
		
		p.makePersistent(person);
		resp.setContentType("text/plain");
		resp.getWriter().println("Data Stored");
	}
}
