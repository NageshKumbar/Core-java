package com.hospital.appointment;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/appointment", loadOnStartup = 1)
public class Appoint extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        int ages = 0;
        long numbers = 0;

        String fname = servletRequest.getParameter("fname");
        String lname = servletRequest.getParameter("lname");
        String email = servletRequest.getParameter("email");
        String age = servletRequest.getParameter("age");
        String address = servletRequest.getParameter("address");
        String gender = servletRequest.getParameter("gender");
        String sick = servletRequest.getParameter("sick");
        String number = servletRequest.getParameter("number");

        if (age != null && !age.isEmpty()) {
            ages = Integer.parseInt(age);
        }

        if (number != null && !number.isEmpty()) {
            numbers = Long.parseLong(number);
        }

        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();

        writer.println("<html><body style='background-color:#121212; color:#ffffff; font-family: Arial, sans-serif;'>");        writer.println("<h2 style='color: green;'>Your appointment has been successfully booked!</h2>");
        writer.println("<h4>The details are:</h4>");
        writer.println("<p><strong>First Name:</strong> " + fname + "</p>");
        writer.println("<p><strong>Last Name:</strong> " + lname + "</p>");
        writer.println("<p><strong>Email:</strong> " + email + "</p>");
        writer.println("<p><strong>Age:</strong> " + ages + "</p>");
        writer.println("<p><strong>Address:</strong> " + address + "</p>");
        writer.println("<p><strong>Gender:</strong> " + gender + "</p>");
        writer.println("<p><strong>Symptoms:</strong> " + sick + "</p>");
        writer.println("<p><strong>Contact Number:</strong> " + numbers + "</p>");
        writer.println("</body></html>");
    }
}
