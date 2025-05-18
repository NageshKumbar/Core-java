package com.hospital.appointment;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/contact", loadOnStartup = 1)
public class Contact extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String fname= servletRequest.getParameter("fname");
        String lname= servletRequest.getParameter("lname");
        String email= servletRequest.getParameter("email");
        String message= servletRequest.getParameter("message");
        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("<html><body style='background-color:#121212; color:#ffffff; font-family: Arial, sans-serif;'>");        writer.println("<h2 style='color: green;'>Your Contact details has been sent successfully !</h2>");
        writer.println("<h4>The details are:</h4>");
        writer.println("<p><strong>First Name:</strong> " + fname + "</p>");
        writer.println("<p><strong>Last Name:</strong> " + lname + "</p>");
        writer.println("<p><strong>Email:</strong> " + email + "</p>");
        writer.println("<p><strong>Message:</strong> " + message + "</p>");

        writer.println("</body></html>");


    }
}
