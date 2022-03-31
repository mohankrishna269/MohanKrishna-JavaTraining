package MyServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyJspServlet
 */
public class MyJspServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String productId=request.getParameter("productid");
		if(productId.equals("P001")) {
			response.sendRedirect("productReceivepage.jsp");
		}
//		String productName=request.getParameter("productname");
//		if(productName.equals("Redmi")) {
//			response.sendRedirect("ProductReceiveName.jsp");
//	}
//		String productColor=request.getParameter("productcolor");
//		if(productColor.equals("Blue")) {
//			response.sendRedirect("productReceivepage.jsp");
//		}
//		else{
//			response.sendRedirect("ProductReceiveName.jsp");
//		}
		
	}

}
