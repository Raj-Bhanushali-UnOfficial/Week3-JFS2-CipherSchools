import java.sql.*;
public class Sql{
public static void main(String[] args) throws Exception{
String connectionURL = "jdbc::mysql://localhost:3306/mart";
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection(connectionURL);
System.out.println("connected");
conn.close();
