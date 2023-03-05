package management;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;

public class student 
{
	public static void main(String[] args)
	{
		  final String username="root";
	    final String password="@Santhiya98";
	 final String dataConn ="jdbc:mysql://localhost:3306/chennai";
	 login.login();
	 deposit.cashDeposit();
	 firststep.checkstudentfeeBalance();}
	 public static void student(int choice) 
		{
			Scanner sc = new Scanner(System.in);
		switch (choice) 
		{										
		case 1: 
		{
			System.out.println("         view balance\n");
			System.out.println("Santhiya K		JAVA		20301		5000		15000	");
			System.out.println("Devi K		JAVA & PHP		20302		10000		10000");
			System.out.println("Vishnu C		PYTHON		20303		5000		10000");
			System.out.println("Priya S		C#		20304		5000		10000	");
			System.out.println("Sandhya K		PHP & C++		20305		5000		15000	");
			break;
		}
case 2:
{
	Scanner ks = new Scanner(System.in);
	System.out.println("Payment");
	System.out.println("Are you sure to pay using cash? \n Type y for yes or n for no)");
	String cash;
	cash = ks.next();
	int amount;
	if (cash.equalsIgnoreCase("y")) 
	{								
		System.out.println("Enter amount");
		amount = ks.nextInt();
		System.out.println("Payment successful by " + amount);
	} else 
	{															
		System.out.println("payment not processed");
	}
}
	break;
}
		
	}
}




	
