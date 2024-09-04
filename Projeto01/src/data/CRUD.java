package data; //Dentro do Pacote data

import model.PessoaModel;
//Importar o Model StatusModel
import model.StatusModel;
//Importar o ArrayList
import java.util.ArrayList;

//Create Realese Update Delete
public interface CRUD { //Interface que dita as regras para o StatusData
    public boolean incluir(Object obj) throws Exception;
    public boolean excluir(int id) throws Exception;
    public boolean atualizar(Object obj) throws Exception;
    public ArrayList<Object> pesquisar (String pesquisa) throws Exception;
    public Object pesquisar(int id) throws Exception;

}


