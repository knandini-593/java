import java.sql.*;
import java.util.Scanner;
public class JDBC 
{
public static void main(String[] args) 
{
    Scanner get = new Scanner(System.in);
    String url = "jdbc:mysql://127.0.0.1:3306/Food";
    String username = "root";
    String password = "root"; 
    String query = "update snacks set cost=? where s_no=?";
    try(
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement ps = con.prepareStatement(query);
    )
    {   System.out.print("Enter your new cost:");
    int cost=get.nextInt();
    System.out.print("Enter your no:");
    int s_no=get.nextInt();
        ps.setInt(1,cost);
        ps.setInt(2,s_no);
        ps.executeUpdate();
        con.close();    
    } catch (Exception e) 
    {
    System.out.println(e.getMessage());
    }
}
}