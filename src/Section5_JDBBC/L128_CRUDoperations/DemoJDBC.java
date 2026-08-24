package Section5_JDBBC.L128_CRUDoperations;

// 1. Import package: JDBC-related classes
import java.sql.*;

public class DemoJDBC {
    public static void showStudent(ResultSet resultSet) throws SQLException {
        String student;
        System.out.println("SID\tName\tMarks");
        System.out.println("---\t----\t-----");
        while(resultSet.next()) {
            int sid = 0;
            sid = resultSet.getInt("sid");
            String name = resultSet.getString("name");
            int marks = resultSet.getInt("marks");
            System.out.println(sid + "\t" + name + "\t" + marks);
        }
    }
    public static void main() {
        // Database connection parameters
        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String pwd = "password";

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

            /** RETRIEVE query  */
            // 6. Execute statement query: retrieve data
            String retrieveSql = "SELECT * FROM public.student ORDER BY sid ASC";
            resultSet = statement.executeQuery(retrieveSql);    // return data
            System.out.println("Query executed.");

            // 6.b Process the result
            showStudent(resultSet);

            /** CREATE query */
            // 6. Execute statement query: create data
            String insertSql = "INSERT INTO public.student VALUES (10, 'Alexei', 67)";
            // true if the first result is a ResultSet object (a result of Retrieve query);
            // false if it is an update count or there are no results
            statement.execute(insertSql);
            // 6b. Process result
            resultSet = statement.executeQuery(retrieveSql);    // return data
            showStudent(resultSet);

            /** UPDATE query */
            String updateSql = "UPDATE public.student SET name='The Loser' WHERE sid=10";
            statement.execute(updateSql);
            // 6b. Process result
            resultSet = statement.executeQuery(retrieveSql);    // return data
            showStudent(resultSet);

            /** DELETE query */
            String deleteSql = "DELETE FROM public.student WHERE sid = 10";
            statement.execute(deleteSql);
            // 6b. Process result
            resultSet = statement.executeQuery(retrieveSql);    // return data
            showStudent(resultSet);



        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            throw new RuntimeException("Error in the query: " + e.getMessage());
        } finally {
            // 7. Close the resources and connection
            try {
                if (resultSet != null)  resultSet.close();
                if (statement != null)  statement.close();
                if (conn != null && !conn.isClosed())    conn.close();
                System.out.println("Connection and resources closed");

            } catch (SQLException e) {
                throw new RuntimeException("Error in closing resources: " + e.getMessage());
            }

        }
    }
}
