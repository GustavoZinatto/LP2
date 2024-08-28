package view;

import data.StatusData;
import model.StatusModel;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //Declaração dos Atributos
        StatusModel obj = new StatusModel();
        
        int opcao = 0;

        //Declaração do Scanner
        Scanner entrada = new Scanner(System.in);
        
        //Menu
        do {
            try {
                StatusData DAO = new StatusData(); //DAO - Data Acess Object

                System.out.println("---MENU---");
                System.out.println("Escolha uma opção: ");
                System.out.println("1 - Novo Status" + 
                "\n2 - Pesquisar Status" +
                "\n3 - Excluir Status" + 
                "\n4 - Editar Status" + 
                "\n ------SAIR------");
                opcao = entrada.nextInt();

                switch (opcao) {
                    case 1:
                    System.out.println("Digite a descrição: ");
                    obj.setDescricao(entrada.nextLine());
                    if (DAO.incluir(obj)) System.out.println("Salvo");
                    else System.out.println("Erro ao salvar.");
                    break;
                
                    default:
                    System.out.println("Opção Inválida!");
                    break;
                }

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while(opcao != 5);

        entrada.close();
    }
}
