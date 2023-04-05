/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Neel Chalke
 */
public class Calculator extends HttpServlet {

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
            String no1 = request.getParameter("no1");
            String no2 = request.getParameter("no2");
            String operator = request.getParameter("operator");
            int no10 = Integer.parseInt(no1);
            int no20 = Integer.parseInt(no2);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Calculator</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div style='width: 100vw; height: 100vh; display: flex; justify-content: center; align-items: center;'>");
            out.println("<div style='min-width: 50vw; height:50vh; display: flex; flex-direction: column; gap: 1em; justify-content: center; align-items: center; background: lightblue; border-radius: 10px; '>");
            out.println("<h1 style='color: white; font-weight: bold; font-size: 3em;'>The Answer is</h1>");
 switch (operator) {
  case "+":
    out.println("<h1 style='color: white; font-weight: bold; font-size: 4em;'>" + (no10 + no20) + "</h1>");
    break;
  case "-":
    out.println("<h1 style='color: white; font-weight: bold; font-size: 4em;'>" + (no10 - no20) + "</h1>");
    break;
  case "*":
    out.println("<h1 style='color: white; font-weight: bold; font-size: 4em;'>" + (no10 * no20) + "</h1>");
    break;
  case "/":
    out.println("<h1 style='color: white; font-weight: bold; font-size: 4em;'>" + (no10 / no20) + "</h1>");
    break;
  case "%":
    out.println("<h1 style='color: white; font-weight: bold; font-size: 4em;'>" + (no10 % no20) + "</h1>");
    break;
  default:
    // Add code here for invalid operator
}
            out.println("<a style='color: white; font-weight: bold; font-size: 2em;' href='calculator.html'>Go Back</a>");
            out.println("</div>");
            out.println("</div>");
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
