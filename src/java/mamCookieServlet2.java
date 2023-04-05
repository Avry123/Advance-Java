/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Neel Chalke
 */
public class mamCookieServlet2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Boolean f1 = true;
            Cookie[] cookie = request.getCookies();
            String name;
            String value;
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet mamCookieServlet2</title>");            
            out.println("</head>");
            out.println("<body style='width: 100vw; height: 100vh; display: flex; flex-direction: column; gap: 1em; justify-content: center; align-items: center;'>");
            for (Cookie c: cookie) {
                name = c.getName();
                value = c.getValue();
                if (name.isEmpty()) {
                 out.println("<div style='min-width:70%; height: 10%; background: whitesmoke;'>");   
                 out.println("<h1 style='font-size: 2em; color: black;'>The login is not there, so you would have to give name first</h1>");
                 out.println("<a style='font-size: 2em; color: black;' href='/mamCookiesVersion'>Click Here to register.</a>");
                 out.println("</div>"); 
                } else {
                out.println("<div style='min-width:70%; height: 10%; background: whitesmoke; padding: 1em; border-radius: 10px;'>");
                out.println("<h1>The cookie name is " + name + " the value is " + value + "</h1>");
                out.println("</div>");
                }
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

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
        processRequest(request, response);
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
