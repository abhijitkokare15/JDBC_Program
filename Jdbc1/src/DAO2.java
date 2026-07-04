import java.sql.*;

public class DAO2 {

    public static void main(String[] args) throws Exception {

        StudentDB dao = new  StudentDB();

        Student s1 = dao.getStudent(78562);

        System.out.println(s1);

        // Student s2 = new Student();
        //  s2.id=561;
        //  s2.name="Sumit";
        //  dao.addStudent(s2.id,s2.name);

         Student s3 = dao.getStudent(561);
          System.out.println(s3);
    }
}

class StudentDB {

     Connection con;

     void connect() throws Exception
     {
         String uri = "jdbc:mysql://localhost:3306/studentdb";
        String uname = "root";
        String pass = "";
        Class.forName("com.mysql.cj.jdbc.Driver");

         con = DriverManager.getConnection(uri, uname, pass);
     }
    public Student getStudent(int id) throws Exception {
           connect();

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


         void addStudent(int id,String name) throws Exception
         {
            connect();
                String q = "insert into student values(?,?)";
            PreparedStatement  ps = con.prepareStatement(q);
            ps.setInt(1,id);
            ps.setString(2,name);

            int n = ps.executeUpdate();
                   ps.close();
                   con.close();
            if(n!=0)
            {
                System.out.println("Added successfully");
            }
            else
            {
                System.out.println("Not Added");
            }
                  



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