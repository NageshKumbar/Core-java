package com.xworkz.internal;

import javax.jws.WebService;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

//send is an alias name or the reference name given to the instance created of this class
@WebServlet(urlPatterns = "/send", loadOnStartup = 1)
public class Example extends GenericServlet {

    public Example() {
        System.out.println("Example created in Tomcat...");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service overloaded in Example");
    }
}
