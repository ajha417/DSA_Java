import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc_DAO_Demo {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Studentss s1 = dao.getStudent(11);
        System.out.println(s1.sname);
    }
}

class StudentDAO{
    public Studentss getStudent(int rollno){
        try {
            String query = "SELECT name FROM users WHERE id="+rollno;
            Studentss s = new Studentss();
            s.rollno = rollno;
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
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
        return null;
    }
}
class Studentss{
    int rollno;
    String sname;
}
