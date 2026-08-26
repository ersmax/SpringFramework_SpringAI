package Section5_JDBBC.L127_ExecuteSQLqueries;

// 1. Import package: JDBC-related classes
import java.sql.*;

public class DemoJDBC {
    public static void main() {
        /**
         Database connection parameters
         Databases rely on a network connection and needs an IP address and port number
         Java will connect with jdbc. jdbc will connect with the DBMS.
         Then you mention DB name. However, demo is available on the network.
         So you have to mention the IP server address and the server port number
         Connection URL Format: jdbc:postgresql://hostname:port/database_name
         hostname: server address (localhost for local machine)
         port: PostgreSQL port (default: 5432)
         database_name: name of your database
         */
        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String pwd = "password";
        String sql = "SELECT name FROM public.student ORDER BY sid ASC";
        String sql2 = "SELECT * FROM public.student ORDER BY sid ASC";

        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // 2 & 3. Load and register the JDBC driver
            Class.forName("org.postgresql.Driver");
            System.out.println("PostgreSQL Driver loaded successfully");

            // 4. Create connection object from your app to DB.
            // Since Connection is an interface, we cannot create an instance with new Connection().
            // We use DriverManager utility class method to return a Connection object.
            con = DriverManager.getConnection(url, user, pwd);
            System.out.println("Connection established");

            // 5. create a statement object for SQL execution
            // Since Statement is an interface, we use the Connection object method to create a Statement
            statement = con.createStatement();

            // 6.a) execute statement query
            resultSet = statement.executeQuery(sql);  // fetch data

            // 6.b) process the result
            // In this case, processing with next() returns true or false
            // depending on whether you got valid data in the new current row or not.
            // Whereas if you use getString, you would get the string data with the
            // particular column label passed as parameter in the current row.
            // Since the first row is just before the first one, we must use first .next()
            String studentName;
            while (resultSet.next()) {
                studentName = resultSet.getString("name");
                System.out.println(studentName);
            }

            resultSet = statement.executeQuery(sql2);
            System.out.println("SID\tName\tMarks");
            System.out.println("---\t----\t-----");
            while (resultSet.next()) {
                int sid = resultSet.getInt("sid");
                String name = resultSet.getString(2);
                int marks = resultSet.getInt("marks");
                System.out.println(sid + "\t" + name + "\t" + marks);
            }


        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            throw new RuntimeException("Error with the Connection and SQL execution: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Some error: " + e.getMessage());
        }
        finally {
            // 7. Close the resources and connection in reverse order
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (con != null && !con.isClosed()) con.close();
                System.out.println("Connection and resources closed");

            } catch (SQLException e) {
                throw new RuntimeException("Error closing resources: " + e.getMessage());
            }
        }
    }
}
