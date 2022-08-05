package com.org.tav.day6;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//public class connection {

//public static void main(String[] args) {
//// TODO Auto-generated method stub
//    Connection c = null;
//    Statement stmt = null;
//    try {
//            Class.forName("org.postgresql.Driver");
//
//            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/handso","postgres", "047200");
//            System.out.println("Opened database successfully");
//
//            stmt = c.createStatement();
//            String sql = "";
//            stmt.executeUpdate(sql);
//            stmt.close();
//            c.close();
//        } 
//        catch ( Exception e ) {
//            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
//            System.exit(0);
//        }
//        System.out.println("Table created successfully");
//
//    }

	
	// Global connection Class
	public class connection {
	    static Connection con; // Global Connection Object
	    public static Connection getConnection()
	    {
	        try {
	            
	            
	            String mysqlJDBCDriver
	                = "com.mysql.cj.jdbc.Driver"; //jdbc driver
	            String url
	                = "jdbc:mysql://localhost:3306/handson"; //mysql url
	            String user = "postgres";        //mysql username
	            String pass = "47200";  //mysql passcode
	             Class.forName(mysqlJDBCDriver);
	            con = DriverManager.getConnection(url, user,
	                                              pass);
	        }
	        catch (Exception e) {
	            System.out.println("Connection Failed!");
	        }
	 
	        return con;
	    }
	}

//}








