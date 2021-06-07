package ru.mail.vladislav150199.my.classes.controler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BootstrapServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/pages/bootstrap-example.jsp").forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("firstName");
        String surname = req.getParameter("surname");
        System.out.println("Name:" + name);
        System.out.println("Surname: " + surname);
        UserDTO userDTO = new UserDTO(name,surname);
        resp.sendRedirect("/login");

    }
}
