import java.sql.*;

public class DataRetrieved {
    public static void main(String[] args)throws ClassNotFoundException
    {
        String url ="jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "password";
        String query = "select * from employees";
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
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String job_title = rs.getString("job_title");
                double salary = rs.getDouble("salary");

                System.out.println();
                System.out.println("=====================");
                System.out.println("ID : "+id);
                System.out.println("Name : "+ name);
                System.out.println("Job Title : "+job_title);
                System.out.println("Salary : "+salary);
            }
            rs.close();
            stmt.close();
            conn.close();
            System.out.println();
            System.out.println("Connection closed successfully");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
