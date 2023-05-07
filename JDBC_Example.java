import java.sql.*;
public class JDBC_Example {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String uname = "root";
            String pass = "";
            Connection conn = DriverManager.getConnection(url,uname,pass);
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("SELECT * FROM users");
            while (res.next()){
                System.out.println(res.getString("name")+" "+res.getString("address"));
            }
            st.close();
            conn.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
