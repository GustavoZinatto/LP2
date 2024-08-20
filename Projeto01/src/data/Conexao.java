package data;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private Connection conexao;

    public Connection getConexao() {
        return conexao;
    }

    public Conexao() throws Exception { //Estabelece conexão com o BD e implementa o CRUD
        String url="jdbc:sqlserver://LAB02-MAQ21:1433;databaseName=bdJava;trustServerCertificate=true;encript=false";
        String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String usuario="aluno";
        String senha="dba";

        Class.forName(driver);
        conexao = DriverManager.getConnection(url, usuario, senha);
    }
}
