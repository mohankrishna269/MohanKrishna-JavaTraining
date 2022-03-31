package ProductProjUpdationView;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import ProductProjUpdationController.JdbcConnectionClass;
import ProductProjUpdationController.ProductController;
import ProductProjUpdationModel.ProductClass;
import ProductProjUpdationView.JdbcDriverClass;
@Component
public class JdbcDriverClass {

	
		// TODO Auto-generated method stub
	    char ch;
		ProductController productController=null;
		Scanner scanner=new Scanner(System.in);
		public void demo() {
			System.out.println("Method Created");
		}
	public JdbcDriverClass() {
		productController=new ProductController();
		
		
	}
		public void display() throws ClassNotFoundException, SQLException {
			do {
			System.out.println("Enter Your Choice");
			System.out.println("1.FindAllProducts");
			System.out.println("2.Add Product");
			System.out.println("3.Modify Project");
			System.out.println("4.Exit");
			
			int choice=scanner.nextInt();
			
			
			switch(choice)
			{
			case 1:
				List<ProductClass> productList=productController.findallProducts();
				 for(ProductClass p: productList)
					 System.out.println(p);
				break;
			case 2:
				productController.save();
				break;
			case 3:
				productController.update();
				break;
//			case 4:
//				break Lable;
			
			default:
				System.out.println("Enter Valid Input");
			}
			System.out.println("\nEnter Y to get Another choice:");
			ch=scanner.next().charAt(0);
			
			}while(ch=='y'||ch=='Y');
			
		}
}

//		public static void main(String[] args) throws ClassNotFoundException, SQLException {
//			// TODO Auto-generated method stub
//			Connection c=JdbcConnectionClass.getConnection();
//			JdbcDriverClass view=new JdbcDriverClass();
//			view.display();
//			
//
//		}


	


