/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Neel Chalke
 */
public class login extends HttpServlet {

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
        String username = request.getParameter("email");
        String password = request.getParameter("password");
        String name = "";
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Class.forName("com.mysql.jdbc.Driver");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet login</title>");            
            out.println("</head>");
            out.println("<body style='width: 100vw; height: 100vh; display: flex; justify-content: center; align-items: center;'>");
            try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "");
            String sql = "SELECT * FROM person WHERE email='" + username + "' and password= '" + password + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                  name = rs.getString("username");
            }
            if (name != "") {
                     response.sendRedirect("indexPage.html");
                  } else {
                    out.println("<div style='background: whitesmoke; border-radius: 10px; text-align: center; width: 30vw; height: 50vh; dislay: flex; justify-content: center; align-items: center;'>"
                            + "<h3>There was a error in your login,Please login properly</h3>"
                            + "<h3><a href='login.html' style='text-decoration: none;'>Login Here</a></h3>"
                            + "<h3>If you have not registered yet click here</h3>" 
                            + "<h3><a href='RegistrationPage.html' style='text-decoration: none;'>Register Here</a></h3>"
                            + "</div>");
                  }
             } catch (Exception e) {
            response.getWriter().print(e);
            }
            out.println("</body>");
            out.println("</html>");
        } catch (ClassNotFoundException ex) {
            
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
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
