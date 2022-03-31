package MyServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import Controller.ProductController;
import Model.ProductClass;

/**
 * Servlet implementation class MyGetServlet
 */
public class MyGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyGetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter();
//		response.setContentType("text/html");
//		PrintWriter out=response.getWriter();
//       String productId=request.getParameter("productid");
//     // out.print("<h1>"+productId+"</h1>");
//          if(productId.equals("100")) {
//	response.sendRedirect("productReceivepage.jsp");
//}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Id=request.getParameter("productid");
		int id=Integer.parseInt(Id);
		String name=request.getParameter("productname");
		String color=request.getParameter("productcolor");
		String Price=request.getParameter("productprice");
		Float price=Float.parseFloat(Price);
		ProductClass product=new ProductClass(id,name,color,price);
		System.out.println(product);
		
//		request.setAttribute("PROD", product);
//		request.getRequestDispatcher("ObjectDisplay.jsp").forward(request, response);
		ProductController productcontroller=new ProductController();
		try {
			productcontroller.save();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
