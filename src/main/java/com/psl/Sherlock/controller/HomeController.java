package com.psl.Sherlock.controller;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Base64;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import com.psl.Sherlock.entity.Citizen;
import com.psl.Sherlock.entity.CreditHistory;
import com.psl.Sherlock.entity.Criminal;
import com.psl.Sherlock.service.CitizenService;
import com.psl.Sherlock.service.CreditHistoryService;
import com.psl.Sherlock.service.CriminalDetailsService;



@Controller
public class HomeController {

	@Autowired
	CitizenService c_service;
	
	@Autowired
	CriminalDetailsService cd_service;
	
	@Autowired
	CreditHistoryService ch_service;
	
	private XmlWebApplicationContext context;
	
	public void initializeContext(HttpServletRequest request){
		System.out.println("file initialized...");
		context = new  XmlWebApplicationContext();
		context.setConfigLocation("/WEB-INF/SpringDispatcher-servlet.xml");
		context.setServletContext(request.getSession().getServletContext());
		context.refresh();
	//	service = (DonorService)context.getBean("service");
	}
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	@RequestMapping(value="/citizen",method=RequestMethod.GET)
	public ModelAndView getCitizenDetailsGET(HttpServletRequest request,HttpServletResponse response,Model model){
		
		model.addAttribute(new Citizen());
		return new ModelAndView("search");
	}
	@RequestMapping(value="/citizen",method=RequestMethod.POST )
	public ModelAndView getCitizenDetailsPOST(HttpServletRequest request,HttpServletResponse response,Model model, Citizen citizen) throws IOException, SQLException{
			
		
		System.out.println( request.getSession().getServletContext().getRealPath(""));
		
		System.out.println("Welcome Citizen Search" );
		initializeContext(request);
		String country="in";
		c_service=(CitizenService)context.getBean("citizen_service");
		
		System.out.println(citizen.getUIN().toString());
	    citizen=c_service.getCitizenDetails(citizen.getUIN().toString());
		model.addAttribute("citizen",citizen);
		System.out.println(
					
				"UIN :"+citizen.getUIN()+
				"\nName :"+citizen.getF_name()+" "+citizen.getL_name()+
				"\nCountry :"+citizen.getCountry()+
				"\nDOB :"+citizen.getDob()+
				"\nHeight :"+citizen.getHeight()+
				"\nWeight :"+citizen.getWeight()+
				"\nSkin Color :"+citizen.getSkin_color()+
				"\nEmail :"+citizen.getEmail()
				);		
		
		 byte[ ] imgData = null ; 
		 imgData = citizen.getPhoto().getBytes(1,(int)citizen.getPhoto().length());
				
		String imgDataBase64=new String(Base64.getEncoder().encode(imgData));
		model.addAttribute("imgDataBase64", imgDataBase64);	
		
		
		return new ModelAndView("citizen");
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value="/criminal",method=RequestMethod.GET)
	public ModelAndView getCriminalDetailsGET(HttpServletRequest request,HttpServletResponse response,Model model){
		model.addAttribute(new Citizen());
		return new ModelAndView("search");
	}
	@RequestMapping(value="/criminal",method=RequestMethod.POST)
	public ModelAndView getCriminalDetailsPOST(HttpServletRequest request,HttpServletResponse response,Model model, Citizen citizen){
		
		System.out.println("Welcome Criminal Search" );
		String country="in";
		System.out.println(country);
		initializeContext(request);
		
		cd_service=(CriminalDetailsService)context.getBean("criminal_details_service");
		List<Criminal> criminal=cd_service.getCriminalDetails(citizen.getUIN().toString());
		model.addAttribute("criminal",criminal);		
		for(Criminal crime:criminal)
			System.out.println(crime.getDescription());
		return new ModelAndView("criminal_record");
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value="/credit" ,  method = RequestMethod.GET)
	public ModelAndView getCreditHistoryDetailsGET(HttpServletRequest request,HttpServletResponse response,Model model){
		model.addAttribute(new Citizen());
		return new ModelAndView("search");
	}
	
	
	@RequestMapping(value="/credit" ,  method = RequestMethod.POST)
	public ModelAndView getCreditHistoryDetailsPOST(HttpServletRequest request,HttpServletResponse response,Model model,Citizen citizen){
//		System.out.println(country);
		System.out.println("Welcome Credit Search" );
		String country="in";
		initializeContext(request);
		ch_service=(CreditHistoryService)context.getBean("credit_history_service");
		List<CreditHistory> credit_history=ch_service.getCreditDetails(citizen.getUIN().toString());
		model.addAttribute("credit_history",credit_history);
		for(CreditHistory cd: credit_history)
			System.out.println(cd.getBankName());	
		return new ModelAndView("credit_history");
	}
}
