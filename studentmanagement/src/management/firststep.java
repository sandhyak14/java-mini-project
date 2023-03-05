package management;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class firststep
{
	Connection con = null;
	  Statement statement;
	  ResultSet resultSet;
	  ResultSet resultSet1;
	  String mysql = "jdbc:mysql://localhost:3306/chennai?autoReconnect=true&useSSL=false";
	  String User = "root";
	  String Pass = "@Santhiya98";
	  
	  public static void checkstudentfeeBalance() {
	  Scanner input=new Scanner(System.in);
	  System.out.println("\u001B[33m \t\t_____VIEW BALANCE_____");
	  System.out.println("\u001B[36mEnter your id to view your fees balance:\u001B[37m \n");
	  int id=input.nextInt();
	  firststep firststep = new firststep();
	  
	  firststep.Checkbalance(id);
	  }
	   public void Checkbalance(int id) {
	     
	    try {
	      int balance = 0;
	      con = DriverManager.getConnection(mysql, User, Pass);
	      statement = con.createStatement();
	      resultSet1 = statement.executeQuery("Select * from student where tuition_fees= " + id);
	      
	      while (resultSet1.next()) {
	        balance = +resultSet1.getInt(5);
	        String name=resultSet1.getString(4);
	        name=name.toUpperCase();
	        System.out.println(name+" Your Balance is "+balance);
	      }
	    }
	    catch(Exception e) {
	      System.out.println(e);
	    }
	  }
}