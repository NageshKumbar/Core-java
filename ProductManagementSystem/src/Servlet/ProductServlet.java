package Servlet;

import dto.UserDetailsDto;
import service.ProductService;
import service.ProductServiceImplementation;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(urlPatterns = "/submit", loadOnStartup = 1)
public class ProductServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");

        String type=req.getParameter("type");

        int Iprices=0;
        String Iprice=req.getParameter("Iprice");
        if(Iprice!=null&& !Iprice.isEmpty()){
            Iprices= Integer.parseInt(Iprice);
        }
        else {
            System.err.println("Invalid price");
        }

        int Sprices=0;
        String Sprice=req.getParameter("Sprice");
        if(Sprice!=null&& !Sprice.isEmpty()){
            Sprices= Integer.parseInt(Sprice);
        }
        else {
            System.err.println("Invalid price");
        }

        double mrps=0;
        String mrp=req.getParameter("mrp");
        if(mrp!=null&& !mrp.isEmpty()){
            mrps= Double.parseDouble(mrp);
        }
        else {
            System.err.println("Invalid mrp");
        }

        String description=req.getParameter("description");

        String brand=req.getParameter("brand");

        int quantities=0;
        String quantity=req.getParameter("quantity");
        if(quantity!=null&& !quantity.isEmpty()){
            quantities= Integer.parseInt(quantity);
        }
        else {
            System.err.println("Invalid quantity");
        }

        String colour=req.getParameter("colour");

        double weights=0;
        String weight=req.getParameter("weight");
        if(weight!=null&& !weight.isEmpty()){
            weights= Double.parseDouble(weight);
        }
        else {
            System.err.println("Invalid weight");
        }


        String mfd=req.getParameter("mfd");

        String Warranty=req.getParameter("Warranty");

        boolean checks=false;
        String check=req.getParameter("check");
        if(check!=null&& !check.isEmpty()){
            checks= Boolean.parseBoolean(check);
        }
        else {
            System.err.println("Invalid input");
        }
        UserDetailsDto userDetailsDto=new UserDetailsDto();
        userDetailsDto.setBrand(brand);
        userDetailsDto.setCheck(checks);
        userDetailsDto.setColour(colour);
        userDetailsDto.setDescription(description);
        userDetailsDto.setMfd(mfd);
        userDetailsDto.setIprice(Iprices);
        userDetailsDto.setMrp(mrps);
        userDetailsDto.setName(name);
        userDetailsDto.setType(type);
        userDetailsDto.setQuantity(quantities);
        userDetailsDto.setSprice(Sprices);
        userDetailsDto.setWarranty(Warranty);
        userDetailsDto.setWeight(weights);
        ProductService productService=new ProductServiceImplementation();
        boolean save=productService.save(userDetailsDto);
        RequestDispatcher requestDispatcher;
        if(save){
            requestDispatcher= req.getRequestDispatcher("ProductSuccess.jsp");
            req.setAttribute("message","successfully saved");
            req.setAttribute("dto",userDetailsDto);
            requestDispatcher.forward(req,resp);
            System.out.println(userDetailsDto);
        }
        else {
            req.setAttribute("message","failed");
        }


    }
}
