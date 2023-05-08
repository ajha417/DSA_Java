import java.sql.*;

public class Jdbc_DAO_Demo {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

//        to get the value
       /* Studentss s1 = dao.getStudent(11);
        System.out.println(s1.sname);*/

//        to add student
        Studentss s2 = new Studentss();
        s2.rollno = 12;
        s2.sname = "Hrithik";
        s2.address = "Mumbai";
        dao.connect();
        dao.addStudent(s2);
    }
}

class StudentDAO{
    Connection conn = null;
    public void connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
             conn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public Studentss getStudent(int rollno) throws SQLException {
        try {
            String query = "SELECT name FROM users WHERE id="+rollno;
            Studentss s = new Studentss();
            s.rollno = rollno;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery(query);
            res.next();
            String name = res.getString("name");
            s.sname = name;
            return s;
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        finally {
            conn.close();
        }
        return null;
    }

    public void addStudent(Studentss s){
        String query = "INSERT INTO users VALUES(?,?,?)";
        PreparedStatement pst;
        try{
            pst = conn.prepareStatement(query);
            pst.setInt(1,s.rollno);
            pst.setString(2,s.sname);
            pst.setString(3,s.address);
            pst.executeUpdate();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
class Studentss{
    int rollno;
    String sname,address;
}
