package data;

import java.sql.PreparedStatement;
//Import do ArrayList
import java.util.ArrayList;

//Import do Package Model
import model.PessoaModel;

public class PessoaData extends Conexao implements CRUD {

    public PessoaData() throws Exception {
        super();
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean atualizar(Object obj) throws Exception {
        String sql="update tbstatus set Endereço=?, Nome=?, Email=?, Senha=?, Telefone=?, where Id=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        PessoaModel st = new PessoaModel();
        if(obj instanceof PessoaModel)
            st = (PessoaModel) obj;
        ps.setString(1, st.getEndereço());
        ps.setString(2, st.getNome());
        ps.setString(3, st.getEmail());
        ps.setString(4, st.getSenha());
        ps.setString(5, st.getTelefone());
        ps.setInt(6, st.getId());
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
    public boolean incluir(Object obj) throws Exception {
        String sql = "insert into tbstatus (Endereço, Nome, Email, Senha, Telefone, Id) values (?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        PessoaModel st = new PessoaModel();
        if(obj instanceof PessoaModel)
            st = (PessoaModel) obj;
        ps.setString(1, st.getEndereço());
        ps.setString(2, st.getNome());
        ps.setString(3, st.getEmail());
        ps.setString(4, st.getSenha());
        ps.setString(5, st.getTelefone());
        ps.setInt(6, st.getId());
        if(ps.executeUpdate()>0) return true;
        else return false;
    }

    @Override
    public ArrayList<Object> pesquisar(String pesquisa) throws Exception {
        ArrayList<Object> dados = new ArrayList<>();
        return dados;
    }

    @Override
    public PessoaModel pesquisar(int id) throws Exception {
        // TODO Auto-generated method stub
        PessoaModel obj = new PessoaModel(id, null, null, null, null, null);
        return obj;
    }

}
