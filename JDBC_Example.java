import java.sql.*;
public class JDBC_Example {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String uname = "root";
            String pass = "";
            Connection conn = DriverManager.getConnection(url,uname,pass);

//            to insert single value
           /* Statement st = conn.createStatement();
//            ResultSet res = st.executeQuery("SELECT * FROM users");
         *//*   while (res.next()){
                System.out.println(res.getString("name")+" "+res.getString("address"));
            }*//*

//            to insert value
            int count = st.executeUpdate("INSERT INTO users VALUES(4,'Hugh JackMan','California')");
*/


//            to insert multiple value
            String query = "INSERT INTO users VALUES(?,?,?)";

            PreparedStatement st = conn.prepareStatement(query);
            st.setInt(1,11);
            st.setString(2,"Jeff Bezzos");
            st.setString(3,"New york");
            int count = st.executeUpdate();
            System.out.println(count + " row/s affected");

            st.close();
            conn.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
