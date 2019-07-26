package com.visa.prj.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/AnswerServlet")
public class AnswerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String wordAsItIs = new String("johnsmith");
		char playersGuess = request.getParameter("playersGuess").charAt(0);
		int guessesRemaining = Integer.parseInt(request.getParameter("guessesRemaining"));
		int index = wordAsItIs.indexOf(playersGuess);
		StringBuilder toDisplay = new StringBuilder();
		if(index==-1) {
			response.getWriter().println("********");
			guessesRemaining--;
			}
		else {
			
		}
		
		
		
		
		try {         
			for (int i = 0; i < wordAsItIs .length(); i++) {
		            boolean theValue = Boolean.parseBoolean(word);
		            ArrayList<Boolean> booleans = new ArrayList<Boolean>();
		            booleans.add(theValue);
		            System.out.println(booleans);

		           if (booleans.contains(true) && wordAsItIs.charAt(i) == '*') {
		               wordAsItIs.setCharAt(i, playersGuess);
		           }

		           if (!booleans.contains(true))
		               guessesRemaining--;
		      }
			
		      displayGame();

		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		doGet(request, response);
	}


	

}
