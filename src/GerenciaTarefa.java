import java.util.Scanner;
import java.util.ArrayList;

public class GerenciaTarefa {
    Scanner sc = new Scanner(System.in);
    ArrayList<Tarefa> tarefas = new ArrayList<>();
    int idAux;
    String tituloAux;
    String descricaoAux;

    //Método para criar tarefa
    public void criaTarefas(){
        System.out.println("Criando tarefa.\nInsira os dados:");
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
            percorreLista();
            System.out.println("Escolha uma tarefa para ver os detalhes ou digite 0 para voltar ao menu.");
            int op = sc.nextInt();
            if (op == 0){

            }else if (op < 0){ 
                System.out.println("Número negativo - inválido!\n");
                listaTarefas();
            }else{
                op-=1;
                System.out.println("");
                exibeTarefas(op);
            }
        }
        sc.nextLine();
    }

    //Método para exibir informações detalhadas de uma tarefa
    public void exibeTarefas(int op){

        System.out.println("Id: " + tarefas.get(op).getId());
        System.out.println("Titulo: " + tarefas.get(op).getTitulo());
        System.out.println("Descrição: " + tarefas.get(op).getDescricao());
        System.out.println("Data de Criação: " + tarefas.get(op).getDataFormatada());
        System.out.println("Concluída: " + tarefas.get(op).isConcluida());
        sc.nextLine();
    }

    //Método para editar tarefas
    public void editaTarefas(){
        System.out.println("\nQual tarefa deseja editar?");
        percorreLista();
        int op = sc.nextInt()-1;
        System.out.println("\nEditando tarefa!");
        exibeTarefas(op);
        System.out.println("\nInsira os dados: ");
        System.out.print("Id: ");
        tarefas.get(op).setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Titulo: ");
        tarefas.get(op).setTitulo(sc.nextLine());
        System.out.print("Descrição: ");
        tarefas.get(op).setDescricao(sc.nextLine());
        System.out.println("Tarefa editada com sucesso!\n");
    }

    //Método para remover tarefas
    public void removeTarefas(){
        System.out.println("Qual tarefa deseja remover?");
        percorreLista();
        System.out.println("Para voltar, digite 0.");
        int op = sc.nextInt();
        if (op==0){

        }else if(op<0){
            System.out.println("Número negativo - inválido!\n");
        }else{
            op-=1;
            tarefas.remove(op);
        }
        
    }

    //Método auxiliar que contém apenas o loop para listar as tarefas (usado sempre que é listado as tarefas)
    public void percorreLista(){
            for (int i = 0; i < tarefas.size(); i++){
                System.out.println(i+1 + ". " + tarefas.get(i).getTitulo());
            }
    }
}
