package com.spring_servlet.test.bean;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.*;
/**
 * Servlet implementation class Servlet1
 */
@Service("Servlet1Service")
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Resource private serviceDAO sDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    
    public void init() throws ServletException {          
        super.init();
        ServletContext servletContext = this.getServletContext();  
        WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        sDAO = (serviceDAO)ctx.getBean("serviceDAO");
    }   
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//init();
		sDAO.dataService();
	}


	
}
