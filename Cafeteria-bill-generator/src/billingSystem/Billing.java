package billingSystem;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submit-bill", loadOnStartup = 1)
public class Billing extends GenericServlet {
    int quantity=0;
    int price=0;
    int Total=0;
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String customerName = servletRequest.getParameter("customerName");
        String itemName = servletRequest.getParameter("itemName");
        String qua = servletRequest.getParameter("quantity");
        String pri = servletRequest.getParameter("price");

        if (qua!=null) {
            quantity = Integer.parseInt(qua);
        }
        if (pri!=null) {
            price = Integer.parseInt(pri);
        }
        Total = quantity*price;

        PrintWriter writer = servletResponse.getWriter();

        writer.println("<html>");
        writer.println("<head><title>Cafeteria Bill</title></head>");
        writer.println("<body style='font-family: Arial, sans-serif;'>");

        writer.println("<h2 style='text-align:center;'>Cafeteria Billing Receipt</h2>");
        writer.println("<hr>");
        writer.println("<p><strong>Customer Name:</strong>"+ customerName +"</p>");
        writer.println("<p><strong>Food Item:</strong>"+ itemName +"</p>");
        writer.println("<p><strong>Quantity:</strong>"+ quantity +"</p>");
        writer.println("<p><strong>Price per Item:</strong>"+ price +"</p>");
        writer.println("<p><strong>Total:</strong>"+ Total +"</p>");
        writer.println("<hr>");
        writer.println("<p style='text-align:center;'>Thank you for visiting our Cafeteria!</p>");

        writer.println("</body>");
        writer.println("</html>");

    }
}
