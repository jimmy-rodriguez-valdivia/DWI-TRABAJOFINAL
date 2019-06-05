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
      out.write("        <title>WEB TRANSITO/URBANO AREQUIPA</title> \n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\"> \n");
      out.write("\n");
      out.write("        <link href=\"estilo.css\" rel=\"stylesheet\"\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <header id=\"main-header\">\n");
      out.write("                    <td><i id=\"icon\" class=\"fa fa-users\" style=\"text-shadow: 0px 0px rgb(179,179,179), 1px 1px rgb(181,181,181), 2px 2px rgb(183,183,183), 3px 3px rgb(185,185,185), 4px 4px rgb(187,187,187), 5px 5px rgb(189,189,189), 6px 6px rgb(192,192,192), 7px 7px rgb(194,194,194), 8px 8px rgb(196,196,196), 9px 9px rgb(198,198,198), 10px 10px rgb(200,200,200), 11px 11px rgb(203,203,203), 12px 12px rgb(205,205,205), 13px 13px rgb(207,207,207), 14px 14px rgb(209,209,209), 15px 15px rgb(211,211,211), 16px 16px rgb(213,213,213), 17px 17px rgb(216,216,216), 18px 18px rgb(218,218,218), 19px 19px rgb(220,220,220), 20px 20px rgb(222,222,222), 21px 21px rgb(224,224,224), 22px 22px rgb(227,227,227), 23px 23px rgb(229,229,229), 24px 24px rgb(231,231,231), 25px 25px rgb(233,233,233), 26px 26px rgb(235,235,235), 27px 27px rgb(238,238,238), 28px 28px rgb(240,240,240), 29px 29px rgb(242,242,242), 30px 30px rgb(244,244,244), 31px 31px rgb(246,246,246), 32px 32px rgb(248,248,248), 33px 33px rgb(251,251,251), 34px 34px rgb(253,253,253); font-size: 80px; color: rgb(66, 255, 230); height: 150px; width: 150px; line-height: 150px; border-radius: ; text-align: center; background-color: rgb(255, 255, 255);\"></i>  </td>\n");
      out.write("                    <form method=\"POST\" action=\"\">\n");
      out.write("                        <td><input type=\"submit\" value=\"Consulta Multas\"></td>\n");
      out.write("                        <td><input type=\"submit\" value=\"Ingresar\">\n");
      out.write("                            <input type=\"text\" size=\"15\" maxlength=\"30\" placeholder=\"Usuario\">\n");
      out.write("                            <input type=\"password\" size=\"15\" maxlength=\"30\" placeholder=\"Constraseña\"></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </form>\n");
      out.write("                    <td align=\"rigth\">\n");
      out.write("                        <nav>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a id=\"primero\" href=\"#\">Inicio</a></li>\n");
      out.write("                                <li><a href=\"#\">Acerca de</a></li>\n");
      out.write("                                <li><a href=\"#\">Contacto</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\n");
      out.write("                    </td>\n");
      out.write("                </header>  \n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
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
