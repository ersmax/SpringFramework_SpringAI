package Section5_JDBBC.L128_CRUDoperations;

// 1. Import package: JDBC-related classes
import javax.xml.transform.Result;
import java.sql.*;

public class DemoJDBC {
    public static void main() {
        // Database connection parameters
        String url = "jdbc:postgre:://localhost:5432/demo";
        String user = "postgres";
        String pwd = "password";
        String sql = "SELECT * FROM public.student ORDER BY sid ASC";

        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // 2 & 3 load and register the JDBC driver
            Class.forName("org.postgresql.Driver");
            System.out.println("PostgreSQL driver loaded successfully");

            // 4. Create connection object from your Java app to DB
            conn = DriverManager.getConnection(url, user, pwd);
            System.out.println("Connection established");

            // 5. Create a statement object for SQL execution
            statement = conn.createStatement();
            System.out.println("SQL statement created");

            // 6. Execute statement query: fetch data
            resultSet = statement.executeQuery(sql);
            System.out.println("Query executed.");

            // 6.b Process the result
            String student;
            System.out.println("SID\tName\tMarks");
            System.out.println("---\t----\t-----");
            while(resultSet.next()) {
                int sid = 0;
                sid = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int marks = resultSet.getInt("marks");
                System.out.println(sid + "\t" + name + "\t" + marks);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            throw new RuntimeException("Error in the query: " + e.getMessage());
        } finally {
            // 7. Close the resources and connection
            try {
                if (resultSet != null)  resultSet.close();
                if (statement != null)  statement.close();
                if (conn != null & !conn.isClosed())    conn.close();
                System.out.println("Connection and resources closed");

            } catch (SQLException e) {
                throw new RuntimeException("Error in closing resources: " + e.getMessage());
            }

        }
    }
}
