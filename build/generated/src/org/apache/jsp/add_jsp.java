package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Student Management System</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        <header>\n");
      out.write("            <nav class=\"navbar navbar-expand-md navbar-dark\" style=\"background-color: green\">\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"index.jsp\" class=\"navbar-brand\"> Student Management Application </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li><a href=\"index.jsp\" class=\"nav-link\">Student List</a></li>\n");
      out.write("                    <li><a href=\"add.jsp\" class=\"nav-link\">New</a></li>\n");
      out.write("                     <li><a href=\"edit.jsp\" class=\"nav-link\">Edit</a></li>\n");
      out.write("                     <li><a href=\"delete.jsp\" class=\"nav-link\">Delete</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <br>        \n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"row\">    \n");
      out.write("        <div class=\"container\">\n");
      out.write("       \n");
      out.write("            <h3 class=\"text-center\">Add Student</h3>\n");
      out.write("            <hr>\n");
      out.write("             \n");
      out.write("           \n");
      out.write("               \n");
      out.write("            <form action=\"Controller\" method=\"POST\">\n");
      out.write("            <div class=\"form-group\">      \n");
      out.write("                <label>Student ID: </label><br>\n");
      out.write("                <input class=\"form-control\" type=\"text\" name=\"txtid\"><br>\n");
      out.write("                <label>First Name: </label><br>\n");
      out.write("                <input class=\"form-control\" type=\"text\" name=\"txtfirstname\"><br>\n");
      out.write("                <label>Last Name: </label><br>\n");
      out.write("                <input class=\"form-control\" type=\"text\" name=\"txtlastname\"><br>\n");
      out.write("                <label>Gender: </label><br>\n");
      out.write("                <input class=\"form-control\" type=\"text\" name=\"txtgender\"><br><br>\n");
      out.write("                <input class=\"btn btn-primary btn-block\" type=\"submit\" name=\"action\" value=\"Save\"> \n");
      out.write("             </div>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
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
