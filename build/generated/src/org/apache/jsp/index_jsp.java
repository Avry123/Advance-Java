package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			null, true, 8192, true);
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
      out.write("            flex-direction: column;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        .form {\n");
      out.write("           width: 50%;\n");
      out.write("           height: 50%;\n");
      out.write("           display: flex;\n");
      out.write("           justify-content: center;\n");
      out.write("           gap: 1em;\n");
      out.write("           align-items: center;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        form {\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100%;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            gap: 1em;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        .center {\n");
      out.write("            width: 30%;\n");
      out.write("            /*background: red;*/\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            text-align: center;\n");
      out.write("            gap: 1em;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .inputField {\n");
      out.write("            width: 6.5em;\n");
      out.write("          \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <div class='form'>\n");
      out.write("            <form action=\"operation.jsp\" method='post'>\n");
      out.write("                <div class=\"center\">\n");
      out.write("                    <label for=\"principal\">Principal</label>\n");
      out.write("                    <input class=\"inputField\" type=\"text\" name=\"principal\" id=\"principal\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"center\">\n");
      out.write("                    <label for=\"rate\">Rate</label>\n");
      out.write("                    <input class=\"inputField\" type=\"rate\" name=\"rate\" id=\"rate\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"center\">\n");
      out.write("                    <label for=\"time\">Years</label>\n");
      out.write("                    <input class=\"inputField\" type=\"text\" name=\"time\" id=\"time\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"center\">\n");
      out.write("                    <label for=\"no\">No of Times</label>\n");
      out.write("                    <input class=\"inputField\" type=\"text\" name=\"no\" id=\"no\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"center\">\n");
      out.write("                    <label for=\"operation\">Operation</label>\n");
      out.write("                    <select  name=\"operation\" id=\"operation\">\n");
      out.write("                        <option value=\"si\">Simple Interest</option>\n");
      out.write("                        <option value=\"ci\">Compound Interest</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <button type=\"submit\">Submit</button>\n");
      out.write("                <button type=\"reset\">Reset</button>\n");
      out.write("            </form> \n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
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
