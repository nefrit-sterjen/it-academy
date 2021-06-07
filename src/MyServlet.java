import ru.mail.vladislav150199.my.classes.controler.DAO;

import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "MyServlet")
public class MyServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setAttribute("posts", DAO.getPosts());
        request.getRequestDispatcher("WEB-INF/pages/posts.jsp").forward(request, response);
    }
}
