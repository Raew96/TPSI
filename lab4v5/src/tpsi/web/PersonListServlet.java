package tpsi.web;

import example.Person;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PersonListServlet", urlPatterns = {"/personList"})
public class PersonListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


            List<Person> dni = new ArrayList<>();
            dni.add(new Person("Rafal", "Biarda", "email"));
            dni.add(new Person("Rafal2", "Biarda2", "email2"));
            dni.add(new Person("Rafal3", "Biarda3", "email3"));
            dni.add(new Person("Rafal4", "Biarda4", "email4"));
            dni.add(new Person("Rafal5", "Biarda5", "email5"));
        request.setAttribute("lista", dni );
        request.getRequestDispatcher("PersonList.jsp").forward(request, response);
        }
}
