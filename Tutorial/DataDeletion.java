import java.sql.*;

public class DataDeletion {
    public static void main(String[] args)throws ClassNotFoundException
    {
        String url ="jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "password";
        String query = "UPDATE employees SET name = 'Dhruv' where id = 3;";
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
            int rowsAffected = stmt.executeUpdate(query);

            if(rowsAffected >= 1){
                System.out.println("Update successfully. " + rowsAffected + " rows affected");
            }else{
                System.out.println("Update failed.");
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
