package tpsi.web;

import example.Student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ServletIndex", urlPatterns = {"/index"})
public class ServletIndex extends HttpServlet {

    static public int counter = 0;
    ArrayList<Student> l = new ArrayList<Student>();
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            HttpSession session = request.getSession();
            counter++;
            session.setAttribute("counter", counter);
            session.setAttribute("l", l);

            request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            HttpSession session = request.getSession();
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String emailAddress = request.getParameter("emailAddress");
            String groupId = request.getParameter("groupId");

            ArrayList<Student> elo = (ArrayList<Student>)session.getAttribute("l");
            elo.add(new Student(firstName, lastName, emailAddress, groupId));
            session.setAttribute("l", elo);

            request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}