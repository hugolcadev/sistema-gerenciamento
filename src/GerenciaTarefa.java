import java.util.Scanner;
import java.util.ArrayList;

public class GerenciaTarefa {
    Scanner sc = new Scanner(System.in);
    ArrayList<Tarefa> tarefas = new ArrayList<>();
    int idAux;
    String tituloAux;
    String descricaoAux;

    //Método para criar tarefa
    public void criaTarefa(){
        System.out.println("Criando tarefa. Insira os dados:");
        System.out.print("Id: ");
        idAux = sc.nextInt();
        sc.nextLine();
        System.out.print("Titulo: ");
        tituloAux = sc.nextLine();
        System.out.print("Descrição: ");
        descricaoAux = sc.nextLine();
        tarefas.add(new Tarefa(idAux, tituloAux, descricaoAux));
        System.out.println("Tarefa criada com sucesso!");
        sc.nextLine();
    }

    //Método para listar tarefas
    public void listaTarefas(){
        if (tarefas.size() == 0){
            System.out.println("Crie uma tarefa primeiro!");
        }else{
            System.out.println("Listando tarefas!");
            for (int i = 0; i < tarefas.size(); i++){
                System.out.println(i+1 + ". " + tarefas.get(i).getTitulo());
            }
            System.out.println("Escolha uma tarefa para ver os detalhes ou digite 0 para voltar ao menu.");
            int op = sc.nextInt();
            if (op == 0){

            }else if (op < 0){ 
                System.out.println("Número negativo - invalido!");
            }else{
                exibeTarefa(op);
            }
        }
        sc.nextLine();
    }

    //Método para exibir informações detalhadas de uma tarefa
    public void exibeTarefa(int op){
        System.out.println("Id: " + tarefas.get(op-1).getId());
        System.out.println("Titulo: " + tarefas.get(op-1).getTitulo());
        System.out.println("Descrição: " + tarefas.get(op-1).getDescricao());
        System.out.println("Data de Criação: " + tarefas.get(op-1).getDataFormatada());
        System.out.println("Concluída: " + tarefas.get(op-1).isConcluida());
        sc.nextLine();
    }
}
