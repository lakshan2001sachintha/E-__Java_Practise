import java.sql.*;
public class JDBC_DELETE{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "lakshan";
        String query = "delete from users where age < 25";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);

            connection.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
