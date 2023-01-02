package program1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Firstservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String n=request.getParameter("name");
		String p=request.getParameter("pass");
		if(n.equals("Bhadresh") && p.equals("bhadresh"))
		{
			response.sendRedirect("success.jsp");
		}
		else
		{
			response.sendRedirect("fail.jsp");
		}
		
	}

}
