package management;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class login {
	static void login() {
	Connection connection = null;
	try
	{
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/chennai?autoReconnect=true&useSSL=false","root","@Santhiya98");
	      Statement ss=(Statement) connection.createStatement();
	      Scanner sc =new Scanner(System.in);
	      System.out.println("Enter the Username");
	      String userName =sc.next();
	      System.out.println("Enter the Password");
	      String password=sc.next();
	      ResultSet rs=ss.executeQuery("select * from studentmanagementsystem where username ='"+userName+"'");
	      while(rs.next()) {
	        if(password.equals(rs.getString(6)))
	        {
	        System.out.println("stdjpsd");  
	        System.out.println("Login successful");
	        }
	        else {
	          System.out.println("\u001B[31m");
	          System.out.println("Refresh and try again");
	          System.exit(0);
	        }
	        }
	    }catch(Exception e) {
	      
	    }
	  }
	}

