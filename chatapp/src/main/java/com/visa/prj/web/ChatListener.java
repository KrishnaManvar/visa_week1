package com.visa.prj.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class ChatListener implements ServletContextListener {

    
    public ChatListener() {
        // TODO Auto-generated constructor stub
    }

	
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	
    public void contextInitialized(ServletContextEvent sce)  { 
    	ServletContext ctx = sce.getServletContext();
    	System.out.println("Adding data into Servlet Context");
    	ctx.setAttribute("Company", "VISA");
    }
	
}
