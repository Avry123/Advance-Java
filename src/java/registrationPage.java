import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class registrationPage extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet registrationPage</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String email = request.getParameter("email");
    String phone = request.getParameter("phone");
    String gender = request.getParameter("gender");
    String message = request.getParameter("message");
    String remember = request.getParameter("remember");
    String option = request.getParameter("option");

    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "");
        Statement stmt = conn.createStatement();
        String sql = "INSERT INTO players VALUES ('" + username + "', '" + password + "')";
        stmt.executeUpdate(sql);
        out.println("<h1>Data Inserted</h1>");
    } catch (SQLException e) {
        e.printStackTrace();
    }
}


    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
