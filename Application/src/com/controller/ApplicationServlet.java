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
		
		Long id 				    = 	Long.valueOf(req.getParameter("id"));
		String name 				= 	(String) req.getParameter("firstname");
		String middleName 			= 	(String) req.getParameter("middlename");
		String lastName 			= 	(String) req.getParameter("lastname");
		String day 	    		   	= 	(String) req.getParameter("day");
		String month			 	= 	(String) req.getParameter("month");
		String year				 	= 	(String) req.getParameter("year");
		String age				 	= 	(String) req.getParameter("age");
		String gender	 			= 	(String) req.getParameter("gender");
		String fatherName 			= 	(String) req.getParameter("fathername");
		String fatherOccupation 	= 	(String) req.getParameter("fatheroccupation");
		String motherName 			= 	(String) req.getParameter("mothername");
		String annualIncome 		= 	(String) req.getParameter("annualincome");
		String religion 			= 	(String) req.getParameter("religion");
		String caste	 			= 	(String) req.getParameter("caste");
		String stp 					= 	(String) req.getParameter("stp");
		String exserviceman 	    = 	(String) req.getParameter("exserviceman");
		String bloodGroup 			= 	(String) req.getParameter("bloodgroup");
		String permanentAddress		= 	(String) req.getParameter("permanentaddress");
		String permanentDistrict 	= 	(String) req.getParameter("permanentdistrict");
		String permanentTaluk 		= 	(String) req.getParameter("permanenttaluk");
		String residentalAddress 	= 	(String) req.getParameter("residentaladdress");
		String residentalDistrict	= 	(String) req.getParameter("residentaldistrict");
		String residentalTaluk 		= 	(String) req.getParameter("residentaltaluk");
		String mobileNumber1		= 	(String) req.getParameter("mobilenumber1");
		String mobileNumber2		= 	(String) req.getParameter("mobilenumber2");
		String email				= 	(String) req.getParameter("email");
		String sslcName				= 	(String) req.getParameter("sslcname");
		String hscName				= 	(String) req.getParameter("hscname");	
		String sslcMark				= 	(String) req.getParameter("sslcmark");
		String hscMark				= 	(String) req.getParameter("hscmark");
		String group				= 	(String) req.getParameter("group");
		String activity				= 	(String) req.getParameter("activity");
		String sports				= 	(String) req.getParameter("sports");
		String dance				= 	(String) req.getParameter("dance");
		String singing				= 	(String) req.getParameter("singing");		
		String drawing				= 	(String) req.getParameter("drawing");	
		String readBook				= 	(String) req.getParameter("readbook");
		String name1				= 	(String) req.getParameter("name1");
		String gender1				= 	(String) req.getParameter("gender1");
		String qualification1		= 	(String) req.getParameter("qualification1");
		String age1					= 	(String) req.getParameter("age1");
		String job1					= 	(String) req.getParameter("job1");
		String name2				= 	(String) req.getParameter("name2");
		String gender2				= 	(String) req.getParameter("gender2");
		String qualification2		= 	(String) req.getParameter("qualification2");
		String age2					= 	(String) req.getParameter("age2");
		String job2					= 	(String) req.getParameter("job2");
		String name3				= 	(String) req.getParameter("name3");
		String gender3				= 	(String) req.getParameter("gender3");
		String qualification3		= 	(String) req.getParameter("qualification3");
		String age3					= 	(String) req.getParameter("age3");
		String job3					= 	(String) req.getParameter("job3");
		String graduate				= 	(String) req.getParameter("graduate");
		String division				= 	(String) req.getParameter("division");
		String course				= 	(String) req.getParameter("course");
		
		
		System.out.println("FirstName "+name);
		System.out.println("MiddleName "+middleName);
		person.setId(id);
		person.setFirstName(name);
		person.setMiddleName(middleName);
		person.setLastName(lastName);
		person.setDay(day);
		person.setMonth(month);
		person.setYear(year);
		person.setAge(age);
		person.setGender(gender);
		person.setFatherName(fatherName);
		person.setFatherOccupation(fatherOccupation);
		person.setMotherName(motherName);
		person.setAnnualIncome(annualIncome);
		person.setReligion(religion);
		person.setCaste(caste);
		person.setStp(stp);
		person.setExserviceman(exserviceman);
		person.setBloogGroup(bloodGroup);
		person.setPermanentAddress(permanentAddress);
		person.setPermanentDistrict(permanentDistrict);
		person.setPermanentTaluk(permanentTaluk);
		person.setResidentalAddress(residentalAddress);
		person.setResidentalDistrict(residentalDistrict);
		person.setResidentalTaluk(residentalTaluk);
		person.setMobileNumber1(mobileNumber1);
		person.setMobileNumber2(mobileNumber2);
		person.setEmail(email);
		person.setSslcName(sslcName);
		person.setHscName(hscName);
		person.setSslcMark(sslcMark);
		person.setHscMark(hscMark);
		person.setGroup(group);
		person.setActivity(activity);
		person.setSports(sports);
		person.setDance(dance);
		person.setSinging(singing);
		person.setDrawing(drawing);
		person.setReadbook(readBook);
		person.setName1(name1);
		person.setGender1(gender1);
		person.setQualification1(qualification1);
		person.setAge1(age1);
		person.setJob1(job1);
		person.setName2(name2);
		person.setGender2(gender2);
		person.setQualification2(qualification2);
		person.setAge2(age2);
		person.setJob2(job2);
		person.setName3(name3);
		person.setGender3(gender3);
		person.setQualification3(qualification3);
		person.setAge3(age3);
		person.setJob3(job3);
		person.setGraduate(graduate);
		person.setDivision(division);
		person.setCourse(course);
		
		
		
		p.makePersistent(person);
		resp.setContentType("text/plain");
		resp.getWriter().println("Data Stored");
	}
}
