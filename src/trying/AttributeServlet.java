/*
 * package trying; import javax.servlet.ServletException; import
 * javax.servlet.http.HttpServlet; import javax.servlet.http.HttpSession; import
 * javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * // import the java packages importjava.io.PrintWriter; import
 * java.io.IOException; import java.io.PrintWriter; import
 * java.util.Enumeration;
 * 
 * public class AttributeServlet extends HttpServlet { protected void doGet
 * (HttpServletRequest request, HttpServletResponse response) throws
 * ServletException, IOException { HttpSession session = request.getSession();
 * 
 * String name = request.getParameter("name"); String value =
 * request.getParameter("attrib_value"); String remove =
 * request.getParameter("remove");
 * 
 * if(remove != null && remove.equals("on")) { session.removeAttribute(name); }
 * else { if(name!=null && name.length() > 0 && (value != null) &&
 * value.length() > 0) { session.setAttribute(name, value); } }
 * 
 * response.setContentType("text/html"); PrintWriter out = response.getWriter();
 * 
 * out.println("<html>");
 * out.println("<meta http-equiv=\"Pragma\" content=\"no-cache\">");
 * out.println("<head><title>Session Attributes</title></head>");
 * out.println("<body>"); out.println("<h1>Session Attributes</h1>");
 * out.println("Enter name and value of an attribute"); String url =
 * response.encodeURL("/session/attributes"); out.println("<form action=\"" +
 * url + "\" method=\"GET\">"); out.println("Name: ");
 * out.println("<input type=\"text\" SIZE=\"10\" name=\"attrib_name\">");
 * out.println("Value: ");
 * out.println("<input type=\"text\" SIZE=\"10\" name=\"attrib_value\">");
 * 
 * out.println("<br><input type=\"checkbox\" name=\"attrib_remove\">Remove");
 * out.println("<br><input type=\"submit\" name = \"update\" value=\"Update\">"
 * ); out.println("</form>"); out.println("<hr>");
 * out.println("Attributes in this session:"); //Print all session attributes
 * Enumeration e = session.getAttributeNames(); while(e.hasMoreElements()) {
 * String att_name = (String) e.nextElement(); String att_value = (String)
 * session.getAttribute(att_name); out.println("<br><b>Name:</b>");
 * out.println(att_name); out.println("<br><b>Value:</b>");
 * out.println(att_value); } out.println("</body></html>"); out.close();
 * 
 * }
 * 
 * }
 */