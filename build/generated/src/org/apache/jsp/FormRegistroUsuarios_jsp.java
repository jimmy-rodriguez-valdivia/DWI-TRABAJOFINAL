package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class FormRegistroUsuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            /*Connection con;
            String url="jdbcmysql://localhost:pruebaug";
            String Driver="com.mysql://jdbc.Driver";
            String user="root";
            Class.forName(Driver);
            con=DriverManager.getConnection(url);*/
            
            PreparedStatement ps;
            ResultSet rs;
            //ps.prepareStatement("select * from usuario");
            //rs=ps.executeQuery();
        
      out.write("\n");
      out.write("        <p>Bienvenido a la Administración de Usuarios!!!</p>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>Id Usuario</th>\n");
      out.write("                <th>Usuario</th>\n");
      out.write("                <th>Contraseina</th>\n");
      out.write("                <th>Nombres</th>\n");
      out.write("                <th>Apellido Paterno</th>\n");
      out.write("                <th>Apellido Materno</th>\n");
      out.write("                <th>DNI</th>\n");
      out.write("                <th>Id Policia</th>\n");
      out.write("                <th>Acciones</th>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("                ");
/*
                    while(rs.next()) {
                */
      out.write("\n");
      out.write("\n");
      out.write("           ");
      out.write("    \n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
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
