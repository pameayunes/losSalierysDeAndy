package edu.it.controllers;

import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;

public class AlumnosController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {
        
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.println("Mensaje del servidor www.salieris.com: ");
        out.println(System.currentTimeMillis()+"");
        response.setStatus(200);
    }
}
