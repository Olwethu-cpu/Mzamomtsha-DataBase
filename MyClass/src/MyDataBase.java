import java.sql.*;

public class MyDataBase{
	
 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
 static final String DB_URL = "jdbc:mysql:C:\\Users\\Olwethu Branden\\Documents\\JAVA\\Java_Activities";
 static final String USER = "root";
 static final String PASS = "Branden16odz";
	
  public static void main(String args) throws ClassNotFoundException {
	 Connection conn = null;
	   Statement stmt = null;
	   try{
	      Class.forName("com.mysql.jdbc.Driver");	
	      System.out.println("Connecting to a selected database...");
	      conn = DriverManager.getConnection("jdbc:mysql:C:\\Users\\Olwethu Branden\\Documents\\JAVA\\Java_Activities","root","Branden16odz");
	      System.out.println("Connected database successfully...");
	      System.out.println("Inserting records into the table...");
	      stmt = conn.createStatement();
	      String sql = "INSERT INTO learners" + "VALUES ('Ryo','Manby','20May2010','Female',5,'Jack','Manby',' 0898765453','Mandalay','1')";
          stmt.executeUpdate(sql);
          System.out.println("Inserted records into the table...");
	   }catch(SQLException se){
		      se.printStackTrace();
	   }
	}
}