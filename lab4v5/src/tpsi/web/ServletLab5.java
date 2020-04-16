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

@WebServlet(name = "ServletLab5", urlPatterns = {"/lab5"})
public class ServletLab5 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int counter=1;
        HttpSession session = request.getSession();
        if(session.getAttribute("counter") == null)
        {
            ArrayList<Student> l = new ArrayList<Student>();
            session.setAttribute("counter", counter);
            session.setAttribute("l", l);
        }
        else
        {
            counter = (int) session.getAttribute("counter");
            counter++;
            session.setAttribute("counter", counter);
        }
        request.getRequestDispatcher("lab5.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int counter=1;
        HttpSession session = request.getSession();
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String emailAddress = request.getParameter("emailAddress");
        String groupId = request.getParameter("groupId");

        if(session.getAttribute("counter") == null)
        {
            ArrayList<Student> l = new ArrayList<Student>();
            session.setAttribute("counter", counter);
            session.setAttribute("l", l);
        }
        else
        {
            counter = (int) session.getAttribute("counter");
            counter++;
            session.setAttribute("counter", counter);
            ArrayList<Student> elo = (ArrayList<Student>)session.getAttribute("l");
            elo.add(new Student(firstName, lastName, emailAddress, groupId));
            session.setAttribute("l", elo);
        }
        request.getRequestDispatcher("lab5.jsp").forward(request, response);
    }
}
