package Testngdemo;

import  java.sql.Connection;		
import  java.sql.Statement;		
import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;	

public class Db {
	public static void  main(String[] args) throws  ClassNotFoundException, SQLException {													
		//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
        				
        Connection conn = DriverManager.getConnection( 
                "jdbc:mysql://localhost:3306/emptwo?user=root&password=1234");
		
		//Query to Execute		
		String query = "select * from  hellotable;";	
        
 	    //Load mysql jdbc driver		
   	    Class.forName("com.mysql.jdbc.Driver");			
   
   	
  
  		//Create Statement Object		
	   Statement stmt = conn.createStatement();					

			// Execute the SQL Query. Store results in ResultSet		
 		ResultSet rs= stmt.executeQuery(query);							
 
 		// While Loop to iterate through all data and print results		
		while (rs.next()){
	        		String myName = rs.getString(1);								        
                    String myAge = rs.getString(2);					                               
                    System. out.println(myName+"  "+myAge);		
            }		
			 // closing DB Connection		
			conn.close();			
}
}
