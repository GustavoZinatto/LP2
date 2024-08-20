package data; //Dentro do Pacote data

//Importar o Model StatusModel
import model.StatusModel;
//Importar o ArrayList
import java.util.ArrayList;

//Create Realese Update Delete
public interface CRUD { //Interface que dita as regras para o StatusData
    public boolean incluir(StatusModel obj) throws Exception;
    public boolean excluir(int id) throws Exception;
    public boolean atualizar(StatusModel obj) throws Exception;
    public ArrayList<StatusModel> pesquisar (String pesquisa) throws Exception;
    public StatusModel pesquisar(int id) throws Exception;

}
