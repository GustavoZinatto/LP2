package data;

import java.sql.PreparedStatement;
//Import do ArrayList
import java.util.ArrayList;

//Import do Package Model
import model.StatusModel;

public class StatusData extends Conexao implements CRUD {

    public StatusData() throws Exception { //(throws Exception) - Lança uma exceção em caso de erro
        super();
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean atualizar(Object obj) throws Exception {
        StatusModel st = (StatusModel) obj;
        String sql="update tbstatus set descricao=? where id=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        if(obj instanceof StatusModel) 
            ps.setString(1, st.getDescricao());
            ps.setInt(2, st.getId());
            if(ps.executeUpdate()>0) return true;
            else return false;
        }

    @Override
    public boolean excluir(int id) throws Exception {
        String sql="delete from tbstatus where id= ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, id);
        if(ps.executeUpdate()>0) return true;
        else return false;
    }

    @Override
    public boolean incluir(Object objPessoa) throws Exception {
        String sql = "insert into tbstatus (descricao) values (?)";
        StatusModel st = (StatusModel) objPessoa;
        PreparedStatement ps = getConexao().prepareStatement(sql);
        if(objPessoa instanceof StatusModel) 
            ps.setString(1, st.getDescricao());
            if(ps.executeUpdate()>0) return true;
            else return false;
    }

    @Override
    public ArrayList<Object> pesquisar(String pesquisa) throws Exception {
        ArrayList<Object> dados = new ArrayList<>();
        return dados;
    }

    @Override
    public StatusModel pesquisar(int id) throws Exception {
        // TODO Auto-generated method stub
        StatusModel obj = new StatusModel();
        return obj;
    }
    
}
