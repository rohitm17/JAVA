import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
  
class SecondPS{  
public static void main(String args[]){  
try{ Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","student","student");
PreparedStatement pr=con.prepareStatement("insert into employees values (?,?,?,?,?,?)");
pr.setInt(1, 13);
pr.setString(2, "prajapati");
pr.setString(3, "Bhaskar");
pr.setString(4, "bhaskar.parajapati35@gmail.com");
pr.setString(5, "HR");
pr.setInt(6, 150000);
int i=pr.executeUpdate();
System.out.println(i+" record inserted");
con.close();
}
catch(Exception e)
{ System.out.println(e);}  
}  
}
