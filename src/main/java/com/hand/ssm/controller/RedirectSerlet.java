package com.hand.ssm.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectSerlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		String path="testServlet";
		 response.sendRedirect(path);
		System.out.println("这是RedirectSerlet的doGet方法"); 
		
}
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           doGet(request,response);
    }
	

}
