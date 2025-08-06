import java.sql.*;

public class DataInsert {public static void main(String[] args)throws ClassNotFoundException
{
    String url ="jdbc:mysql://localhost:3306/students";
    String username = "root";
    String password = "password";
    String query = "INSERT INTO employees (id, name, job_title, salary) VALUES (4, 'Dhruv', 'Dotnet developer', 40000.0)";
    try {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Drivers loaded successfully");
    }catch(ClassNotFoundException e) {
        System.out.println(e.getMessage());
    }

    try{
        Connection conn = DriverManager.getConnection(url, username, password);
        System.out.println("Connection established successfully");
        Statement stmt = conn.createStatement();

        int RowsAffected = stmt.executeUpdate(query);

        if(RowsAffected >=1){
            System.out.println("Insert Successful." + RowsAffected + " row(s) affected");
        }

        stmt.close();
        conn.close();
        System.out.println();
        System.out.println("Connection closed successfully");
    }catch(SQLException e){
        System.out.println(e.getMessage());
    }


}
}
