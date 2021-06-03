package in.poorni.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.poorni.Model.RegisterModel;
import in.poorni.services.RegisterService;

/**
 * Servlet implementation class RegisterSevlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	try {
			PrintWriter out=response.getWriter();

			String name=request.getParameter("username");

			String password=request.getParameter("password");

			String email=request.getParameter("email");
			String mobileNo=request.getParameter("mobileno");
			String age=request.getParameter("age");
			String adhaarNo=request.getParameter("adhaarNo");
			String address=request.getParameter("address");
			String pincode=request.getParameter("pincode");

			RegisterModel register=new RegisterModel(name,password,email,mobileNo,age,adhaarNo,address,pincode);


			if(RegisterService.isValidUserDetails(name, password, email, age, mobileNo, adhaarNo, pincode)&&RegisterService.register2(register)) {
				String message="Successfully registered";
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("Register.jsp?errorMessage="+message);
				requestDispatcher.forward(request,response);

}
			else {
			out.println("Invalid");
}
		} catch (IOException | ServletException e) {

			e.printStackTrace();
		}



}
} 
