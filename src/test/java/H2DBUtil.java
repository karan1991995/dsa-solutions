import java.sql.*;

public class H2DBUtil {
    public static void selectH2DB() throws ClassNotFoundException, SQLException {
        String databasenamewithpath = System.getProperty("user.dir") + "/myTestDatabase";
        String actualname = databasenamewithpath.replace("\\", "/");
        String insertsql = "INSERT INTO cars VALUES (8, 'Suresh', 36); ";
        Class.forName("org.h2.Driver");
        System.out.println("jdbc:h2:file:" + actualname);
        Connection conn = DriverManager.getConnection("jdbc:h2:file:" + actualname, "", "");
        Statement statement = conn.createStatement();
        statement.executeUpdate(insertsql);
        ResultSet rs = statement.executeQuery("select * from CARS;");

        while (rs.next()) {
            //Display values
            System.out.print("ID: " + rs.getInt("ID") + "\n");
            System.out.print("Age: " + rs.getString("NAME") + "\n");
            System.out.print("First: " + rs.getInt("PRICE") + "\n");
        }
        conn.close();
    }


    public static void main(String str[]) throws Exception {
        selectH2DB();
    }

}
