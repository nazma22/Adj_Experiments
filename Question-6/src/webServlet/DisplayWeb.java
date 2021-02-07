package webServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayWeb
 */
@WebServlet("/DisplayWeb")
public class DisplayWeb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayWeb() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String site = request.getParameter("website");
		
		if(site.equals("google")) {
			response.sendRedirect("http://www.google.com");
		}
		else if(site.equals("whatsapp")) {
			response.sendRedirect("http://www.whatsapp.com");
		}
		else if(site.equals("facebook")) {
			response.sendRedirect("http://www.facebook.com");
		}
		else if(site.equals("instagram")) {
			response.sendRedirect("http://www.instagram.com");
		}
		else if(site.equals("twitter")) {
			response.sendRedirect("http://www.twitter.com");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
