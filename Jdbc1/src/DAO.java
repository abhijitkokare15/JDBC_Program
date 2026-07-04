import java.sql.*;

public class DAO {

    public static void main(String[] args) throws Exception {

        GetStudent dao = new  GetStudent();

        Student s1 = dao.getStudent(78562);

        System.out.println(s1);
    }
}

class GetStudent {

    public Student getStudent(int id) throws Exception {

        String uri = "jdbc:mysql://localhost:3306/studentdb";
        String uname = "root";
        String pass = "";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(uri, uname, pass);

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery( "SELECT * FROM student WHERE id=" + id);

        Student s1 = new Student();

        if (rs.next()) {
            s1.id = rs.getInt(1);
            s1.name = rs.getString(2);
             return s1;
        }

        rs.close();
        st.close();
        con.close();
           return null;
       
    }
}

class Student {

    int id;
    String name;

    @Override
    public String toString() {
        return "{ id: " + id + ", Name: " + name + " }";
    }
}