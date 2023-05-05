package com.company;

import java.sql.*;

class Pqr{
    //static block are those blocks which gets executed when the class is loaded

    static {
        System.out.println("In static");
    }
    //instance block
    {
        System.out.println("In instance");
    }

}
public class ForName {
    public static void main(String[] args) throws Exception,SQLException{
//        Class.forName("Pqr");
        String servername = "jdbc:mysql://localhost:3306/student";
        String username = "root";
        String password = "";
        String query = "select st_name from personal where st_id=1";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(servername,username,password);
        Statement st = con.createStatement();

        //here executeQuery will return the result in table format so, it is stored in ResultSet to fetch the value

        ResultSet r=st.executeQuery(query);

        r.next();
        String name = r.getString("st_name");
        System.out.println(name);



    }
}
