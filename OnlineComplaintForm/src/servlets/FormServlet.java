package servlets;

import dto.DetailsDto;
import service.FormService;
import service.FormServiceImplementation;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submit",loadOnStartup = 1)
public class FormServlet extends HttpServlet {
    public FormServlet(){
        System.out.println("running servlet");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String contact = req.getParameter("contact");
        Long contacts=0L;
        if (contact!=null){
            contacts=Long.parseLong(contact);
        }
        System.out.println(contacts);

        String complaint = req.getParameter("complaint");
        DetailsDto detailsDto=new DetailsDto();
        detailsDto.setUsername(username);
        detailsDto.setEmail(email);
        detailsDto.setContact(contacts);
        detailsDto.setComplaint(complaint);
        FormService formService= new  FormServiceImplementation();
        boolean saved=formService.save(detailsDto);
        if (saved){
            req.setAttribute("message","successfully saved");
            req.setAttribute("dto",detailsDto);
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("success.jsp");
            requestDispatcher.forward(req,resp);
        }
        else {
            PrintWriter writer=resp.getWriter();
            writer.println("failed");
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("index.jsp");
            requestDispatcher.forward(req,resp);
        }
    }
}
