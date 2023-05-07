/*
steps to connect java application with database
* import package
* load and register driver class
*create or establish connection
* prepare statement
* execute query
* process result
* close
* */
//this is the first step
import java.sql.*;


public class JDBC_Connectivity {
    public static void main(String[] args)  {
        try{
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String uname = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,uname,pass);
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("SELECT * FROM users");
            String foundType = "";
            if(res.next()){
                foundType = res.getString("name");
            }
            System.out.println(foundType);
            st.close();
            conn.close();
//            System.out.println("Connected");

        }
        catch (Exception e){
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
    }
}
