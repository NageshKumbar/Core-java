package servelet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submit", loadOnStartup = 1)
public class FeedbackForm extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws  IOException {
        System.out.println("------Running the Feedback Server------");
        String name = servletRequest.getParameter("Username");
        String email = servletRequest.getParameter("email");
        String contact = servletRequest.getParameter("contact");
        String feedback = servletRequest.getParameter("feedback");
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Contact: "+contact);
        System.out.println("Feedback: "+feedback);

        //sending back the response
        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.println(name+ " Thanks for the feedback");
    }
}
