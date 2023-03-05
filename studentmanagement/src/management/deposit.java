package management;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class deposit {

  Connection con = null;
  Statement statement;
  ResultSet resultSet;
  ResultSet resultSet1;
  String mysql = "jdbc:mysql://localhost:3306/chennai";
  String User = "root";
  String Pass = "@Santhiya98";
  
  public static void cashDeposit() {
  Scanner input=new Scanner(System.in);
  System.out.println("Input ID");
  int id=input.nextInt();
  deposit jc = new deposit();
  
  System.out.println("Amount");
  int deposit=input.nextInt();
  
  jc.updateConnection(id,deposit);
  
  }

  public void updateConnection(int id, int deposit) {
    try {

      int balance = 0;
      con = DriverManager.getConnection(mysql, User, Pass);
      statement = con.createStatement();
      resultSet1 = statement.executeQuery("Select * from student where std_id= " + id);
      while (resultSet1.next()) {
        balance = +resultSet1.getInt(5);
      }
      statement.executeUpdate(
          "UPDATE details SET balance = '" + balance + "' WHERE account_no = '" + id + "'");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
  

}
