import java.sql.*;

public class test {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=JDBCDemo254; encrypt=false";
            Connection con  = DriverManager.getConnection(url, "sa", "12345");
            if (con != null){
                String catalog = con.getCatalog();
                System.out.println("catalog: "+catalog);
            }else {
                System.out.println(" ket noi loi");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
