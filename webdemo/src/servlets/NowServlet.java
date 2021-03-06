package servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @WebServlet("/now")
public class NowServlet extends HttpServlet {
    String message;
	public void init(ServletConfig config) {
		message = config.getInitParameter("message");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Date now = new Date();
		response.getWriter().printf("<h1>%s</h1><h2>%s</h2>",now.toString(), this.message);
	}
}
