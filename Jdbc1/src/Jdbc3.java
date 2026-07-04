import java.sql.*;
import java.util.Scanner;

public class Jdbc3{

    public static void main(String[] args) throws Exception {

        String uri = "jdbc:mysql://localhost:3306/studentdb";
        String uname = "root";
        String pass = "";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(uri, uname, pass);

        String q = "INSERT INTO student VALUES (?, ?)";

        PreparedStatement pt = con.prepareStatement(q);

        Scanner sc = new Scanner(System.in);

        int n = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            pt.setInt(1, id);
            pt.setString(2, name);

            n = pt.executeUpdate();
        }

        System.out.println("Rows Inserted: " + n);

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM student");

        while (rs.next()) {
            System.out.println(rs.getInt("id") + " " + rs.getString("name"));
        }

        rs.close();
        pt.close();
        st.close();
        con.close();
        sc.close();
    }
}