package data;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private Connection conexao;

    public Connection getConexao() {
        return conexao;
    }

    public Conexao() throws Exception { //Estabelece conexão com o BD e implementa o CRUD
        // String url="jdbc:sqlserver://lab0411\\SQLEXPRESS:1433;databaseName=bdJava;trustServerCertificate=true;encript=false";
        String url="jdbc:mysql://localhost:3306/bdJava?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String driver="com.mysql.cj.jdbc.Driver";
        String usuario="root";
        String senha="%Fatecrp!";

        Class.forName(driver);
        conexao = DriverManager.getConnection(url, usuario, senha);
    }
}
