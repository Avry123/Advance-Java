package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class divideException1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"divideException2.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            width: 100vw;\n");
      out.write("            height: 100vh;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        div {\n");
      out.write("            width: 50%;\n");
      out.write("            height: 50%;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        form {\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100%;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            \n");
      out.write("            background: whitesmoke;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        .label_1, .label_2 {\n");
      out.write("           width: 50%;\n");
      out.write("           height: 25%;\n");
      out.write("           display: flex;\n");
      out.write("           flex-direction: column;\n");
      out.write("           justify-content: center;\n");
      out.write("           align-items: center;\n");
      out.write("           background: red;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .submit {\n");
      out.write("            border:0px;\n");
      out.write("            background: black;\n");
      out.write("            font-size: 1.2em;\n");
      out.write("            font-weight: bold;\n");
      out.write("            margin-top: 1em;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        input[type=\"text\"] {\n");
      out.write("            border:0px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("     </style>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <form action=\"divideAnswer.jsp\">\n");
      out.write("                <div class=\"label_1\">\n");
      out.write("                    <label>No: 1</label>\n");
      out.write("                    <input type=\"text\" name=\"no1\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"label_2\">\n");
      out.write("                    <label>No: 2</label>\n");
      out.write("                    <input type=\"text\" name=\"no2\" />\n");
      out.write("                </div>\n");
      out.write("                <button class=\"submit\">Submit</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
