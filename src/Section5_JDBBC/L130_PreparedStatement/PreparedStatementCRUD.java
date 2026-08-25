package Section5_JDBBC.L130_PreparedStatement;

// 1. Import package: JDBC-related classes
import java.sql.*;


/**
 * This class implements the CRUD operations.
 * Both Statement and PreparedStatement implement AutoCloseable,
 * same as Connection and ResultSet.
 * So we list whichever resources the method uses in the try(...) parentheses
 * and Java closes them automatically, in reverse order, even on exception.
 * This is called try-with-resources
 */
public class PreparedStatementCRUD {
    // Database connection parameters
    private static final String URL = "jdbc:postgresql://localhost:5432/demo";
    private static final String USER = "postgres";
    private static final String PWD = "password";

    // CREATE
    public static void insertStudentSafe(int sid, String name, int marks) {
        String sql = "INSERT INTO public.student VALUES (?, ?, ?)";
        try (
            // 4. Create your Connection object from your Java app to DBMS
            Connection conn = DriverManager.getConnection(URL, USER, PWD);
            // 5. Create statement SQL object for query execution
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            )
        {
            System.out.println("Connection established. Initiate CREATE...");
            System.out.println("SQL prepared statement created");


            // 6. Execute query: create data
            preparedStatement.setInt(1, sid);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, marks);
            int rows = preparedStatement.executeUpdate();
            System.out.println("Inserted " + rows + " records");

        } catch (SQLException e) {
            System.out.println("Insert error: " + e.getMessage());
        }
    }

    // READ single stud
    public static void getStudent(int sid) {
        String sql = "SELECT * FROM public.student WHERE sid = ?";
        try (
            // 4. Create your Connection object from your Java app to DBMS
            Connection con = DriverManager.getConnection(URL, USER, PWD);
            // 5. Create statement SQL object for query execution
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            )

        {
            System.out.println("Connection established. Initiate READ...");
            System.out.println("SQL prepared statement created");

            // 6. Execute query: fetch data
            preparedStatement.setInt(1, sid);
            ResultSet resultSet = preparedStatement.executeQuery();

            // 6b. Process the result
            if (resultSet.next()) {
                int id = resultSet.getInt("sid");
                String name = resultSet.getString("name");
                int marks = resultSet.getInt("marks");
                System.out.println(id + "\t" + name + "\t" + marks);
            } else {
                System.out.println("Student not found");
            }

        } catch (SQLException e) {
            System.out.println("Select error: " + e.getMessage());
        }
    }

    // READ all students
    public static void getStudents() {
        String sql = "SELECT * FROM public.student ORDER BY sid ASC";
        Connection con = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try  {
            // 4. Create Connection object from Java API to DBMS
            con = DriverManager.getConnection(URL, USER, PWD);
            // 5. Create statement SQL object for query execution
            preparedStatement = con.prepareStatement(sql);

            System.out.println("Connection established. Initiate READ...");
            System.out.println("SQL prepared statement created");

            // 6. Execute query: fetch all data
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int marks = resultSet.getInt(3);
                System.out.println(id + "\t" + name + "\t" + marks);
            }
        } catch (SQLException e) {
            System.out.println("Select error: " + e.getMessage());
        } finally {
            try {
                if (resultSet != null)  resultSet.close();
                if (preparedStatement != null)  preparedStatement.close();
                if (con != null && !con.isClosed()) con.close();
                System.out.println("Connection and resources closed");
            } catch (SQLException e) {
                System.out.println("Error in closing resources: " + e.getMessage());
            }
        }
    }

    // UPDATE

    /**
     * NOTE: kept in classic try/catch/finally style intentionally,
     * to contrast with the try-with-resources methods above.
     */
    public static void updateStudent(int sid, String newName, int newMarks) {
        String sql = "UPDATE public.student SET name = ?, marks = ? WHERE sid = ?";
        try (
            // 4. Create Connection obj from Java API to DBMS
            Connection conn = DriverManager.getConnection(URL, USER, PWD);
            // 5. Create statement SQL object for query execution
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            )
        {
            System.out.println("Connection established. Initiate UPDATE...");
            System.out.println("SQL prepared statement created");

            // 6. Execute query: update fields
            preparedStatement.setString(1, newName);
            preparedStatement.setInt(2, newMarks);
            preparedStatement.setInt(3, sid);
            int rows = preparedStatement.executeUpdate();
            System.out.println("Update " + rows + " record(s)");

        } catch (SQLException e) {
            System.out.println("Update err: " + e.getMessage());
        }
    }

    // DELETE
    public static void deleteStudent(int sid) {
        String sql = "DELETE FROM public.student WHERE sid = ?";
        try (
            // 4. Create Connection object to connect Java API to DBMS
            Connection conn = DriverManager.getConnection(URL, USER, PWD);
            // 5. Create statement SQL object to execute query
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            )
        {
            System.out.println("Connection established. Initiate DELETE...");
            System.out.println("SQL prepared statement created");

            // 6. Execute query statement sql: update fields
            preparedStatement.setInt(1, sid);
            int rows = preparedStatement.executeUpdate();
            System.out.println("Deleted " + rows + " record(s)");
        } catch (SQLException e) {
            System.out.println("Delete error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        try {
            // 2 & 3 load and register the JDBC driver
            Class.forName("org.postgresql.Driver");
            System.out.println("PostgreSQL driver loaded successfully");
        } catch (ClassNotFoundException e) {
            System.out.println("Connection not opened " + e.getMessage());
        }

        // RETRIEVE query
        getStudents();

        // CREATE with Statement query parameters below
        int sid = 101;
        String name = "Jonnino";
        int marks = 98;
        insertStudentSafe(sid, name, marks);
        getStudents();

        // UPDATE
        String newName = "John Wayne";
        int newMarks = 100;
        updateStudent(sid, newName, newMarks);
        getStudents();

        // DELETE
        deleteStudent(sid);
        getStudents();
    }
}
