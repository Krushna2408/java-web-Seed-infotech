package pack;

//LOGIN
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class login extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myemail = req.getParameter("email");
		String mypass = req.getParameter("pass");

		PrintWriter out = resp.getWriter();

		if (myemail.equals("krushnaparadkar2003@gmail.com") && mypass.equals("krushna@09876")) {
			req.setAttribute("name", "Seed");

			HttpSession session = req.getSession();

			session.setAttribute("name", "seed");

			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, resp);

		} else {

//		  resp.setContentType("text/html");
			out.print("invalid passwords");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.include(req, resp);

		} 

	}
}