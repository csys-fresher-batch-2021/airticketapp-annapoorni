package in.poorni.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.poorni.model.User;
import in.poorni.services.UserService;
/**
 * Servlet implementation class AddUserServlet
 */
@WebServlet("/AddUserServlet")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String username = request.getParameter("username");
			int age = Integer.parseInt(request.getParameter("age"));
			Long phoneNumber = Long.parseLong(request.getParameter("phoneNumber"));
			String password = request.getParameter("password");
			String email = request.getParameter("email");
			String gender = request.getParameter("gender");
			String address = request.getParameter("address");
			User user = new User(username,age,phoneNumber,email,password,gender,address);
			UserService userService = new UserService();
			userService.addUser(user);
			response.sendRedirect("Login.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("Register.jsp?errorMessage=" + e.getMessage());
		}
	}
}
