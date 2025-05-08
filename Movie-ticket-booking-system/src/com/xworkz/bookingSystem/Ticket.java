package com.xworkz.bookingSystem;

import javax.jws.WebService;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submit", loadOnStartup = 1)
public class Ticket extends GenericServlet {
    public int ticket=0;
    public int amount=0;
    public int totalAmount = 0;

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name =  servletRequest.getParameter("name");
        String email = servletRequest.getParameter("email");
        String movie = servletRequest.getParameter("movie");
        String tickets = servletRequest.getParameter("tickets");
        String price = servletRequest.getParameter("price");

        if (tickets != null) {
            ticket = Integer.parseInt(tickets);
        }

        if (price != null) {
            amount = Integer.parseInt(price);
        }

        totalAmount = ticket*amount;
        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("<h1> You have successfully booked your ticket</h1> " +
                "<h2>The amount you should pay </h2>"+totalAmount);


    }
}
