package Section5_JDBBC.L130_PreparedStatement;

// 1. Import package: JDBC-related classes
import java.sql.*;

public class PreparedStatementCRUD {
    // Database connection parameters
    private static final String URL = "jdbc:postgresql://localhost:5432/demo";
    private static final String USER = "postgres";
    private static final String PWD = "password";

    // CREATE
    public static void insertStudentSafe(int sid, String name, int marks) {
        String sql = "INSERT INTO public.student VALUES (?, ?, ?)";
        try {
            // 4. Create your Connection object from your Java app to DBMS
            Connection conn = DriverManager.getConnection(URL, USER, PWD);
            System.out.println("Connection established. Initiate CREATE...");

            // 5. Create statement SQL object for query execution
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
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
        try {
            // 4. Create your Connection object from your Java app to DBMS
            Connection con = DriverManager.getConnection(URL, USER, PWD);
            System.out.println("Connection established. Initiate READ...");

            // 5. Create statement SQL object for query execution
            PreparedStatement preparedStatement = con.prepareStatement(sql);
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
        try {
            // 4. Create Connection object from Java API to DBMS
            Connection con = DriverManager.getConnection(URL, USER, PWD);
            System.out.println("Connection established. Initiate READ...");

            // 5. Create statement SQL object for query execution
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            System.out.println("SQL prepared statement created");

            // 6. Execute query: fetch all data
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int marks = resultSet.getInt(3);
            }

        } catch (SQLException e) {
            System.out.println("Select error: " + e.getMessage());
        }

    }

    // READ all students
    public static void getStudents(ResultSet resultSet) throws SQLException {
        String student;
        System.out.println("SID\tName\tMarks");
        System.out.println("---\t----\t-----");
        while(resultSet.next()) {
            int sid = resultSet.getInt("sid");
            String name = resultSet.getString("name");
            int marks = resultSet.getInt("marks");
            System.out.println(sid + "\t" + name + "\t" + marks);
        }
    }
    public static void main() {
        // Database connection parameters


        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // 2 & 3 load and register the JDBC driver
            Class.forName("org.postgresql.Driver");
            System.out.println("PostgreSQL driver loaded successfully");

            // 4. Create connection object from your Java app to DB
            conn = DriverManager.getConnection(URL, USER, PWD);
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
            getStudents(resultSet);

            /** CREATE query */
            // 6. Execute statement query: insert data
            String insertSql = "INSERT INTO public.student VALUES (10, 'Johan', 10)";
            // true if the first result is a ResultSet object (a result of Retrieve query);
            // false if it is an update count or there are no results
//            boolean status = statement.execute(insertSql);
//            System.out.println("Execute status: " + status); // false for INSERT/UPDATE/DELETE
            // or we can use executeUpdate(insertSql), which returns either
            // (1) the row count for SQL Data Manipulation Language (DML) statements or
            // (2) 0 for SQL statements that return nothing
            int rowsAffected = statement.executeUpdate(insertSql);
            System.out.println("Rows affected by insert: " + rowsAffected);
            System.out.println("Record inserted successfully");
            // 6b. Process result
            resultSet = statement.executeQuery(retrieveSql);    // return data
            getStudents(resultSet);

            /** CREATE with PreparedStatatement query */
            // Statement query parameters
            int sid = 101;
            String name = "Jonnino";
            int marks = 98;

            insertStudentSafe(sid, name, marks);

            // 6b. Process result
            resultSet = statement.executeQuery(retrieveSql);    // return data
            getStudents(resultSet);


            /** DELETE query */
            // 6. Execute statement query: delete data
            String deleteSql = "DELETE FROM public.student WHERE sid = 101";
//            statement.execute(deleteSql);
            int rowsDeleted = statement.executeUpdate(deleteSql);
            System.out.println("Rows deleted: " + rowsDeleted);
            // 6b. Process result
            resultSet = statement.executeQuery(retrieveSql);    // return data
            getStudents(resultSet);


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
