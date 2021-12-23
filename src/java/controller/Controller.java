/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Student;
import model.StudentDAO;
import java.util.List;

/**
 *
 * @author Brian
 */
public class Controller extends HttpServlet {

    StudentDAO dao = new StudentDAO();
    Student s = new Student();
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controller</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controller at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    //Code en bas
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        switch(action) {
            case "Display":
                    List<Student>students = dao.display();
                    request.setAttribute("students",students);
                    request.getRequestDispatcher("index.jsp").forward(request,response);
                    break;
            case "New":  
                    request.getRequestDispatcher("add.jsp").forward(request,response);
                    break;
                    
            case "Save":  
                    String id = request.getParameter("txtid");
                    String firstname = request.getParameter("txtfirstname");
                    String lastname = request.getParameter("txtlastname");
                    String gender = request.getParameter("txtgender");
                    s.setId(Integer.parseInt(id));
                    s.setFirstName(firstname);
                    s.setLastName(lastname);
                    s.setGender(gender);
                    dao.add(s);
                    request.getRequestDispatcher("Controller?action=Display").forward(request,response);
                    break;
            case "Edit":
                    String ide = request.getParameter("id");
                    Student st = dao.displayId(ide);
                    request.setAttribute("student", st);
                    request.getRequestDispatcher("edit.jsp").forward(request,response);
                    break;
            case "Update":
                    String id1 = request.getParameter("txtid");
                    String firstname1 = request.getParameter("txtfirstname");
                    String lastname1 = request.getParameter("txtlastname");
                    String gender1 = request.getParameter("txtgender");
                     s.setId(Integer.parseInt(id1));
                    s.setFirstName(firstname1);
                    s.setLastName(lastname1);
                    s.setGender(gender1);
                    dao.update(s);
                   
                    request.getRequestDispatcher("Controller?action=Display").forward(request,response);
                    break; 
            case "Delete":
                    String id2 = request.getParameter("id");
                    dao.delete(id2);
                    request.getRequestDispatcher("Controller?action=Display").forward(request,response);
                    break;           
        
            default:
                    throw new AssertionError();
                                     
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
