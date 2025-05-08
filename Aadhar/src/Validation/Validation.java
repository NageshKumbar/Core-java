package Validation;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submit", loadOnStartup = 1)
public class Validation extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String num = servletRequest.getParameter("aadhar");



        servletResponse.setContentType("text");
        PrintWriter writer = servletResponse.getWriter();
        if (num.length() == 12) {
            writer.println("Your Aadhar number "+num+" is valid");
        }
        else {
            writer.println("Your Aadhar number "+num+" is not valid");
        }
    }
}
