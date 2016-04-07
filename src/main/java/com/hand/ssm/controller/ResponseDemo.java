package com.hand.ssm.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseDemo extends HttpServlet{
	 public void doGet(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {
		 String path="testServlet";
		 RequestDispatcher requestDispatcher=request.getRequestDispatcher("/"+path);
    	    requestDispatcher.forward(request, response);
 }
     public void doPost(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {
            doGet(request,response);
     }

}
