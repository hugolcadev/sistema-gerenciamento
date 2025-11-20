import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        GerenciaTarefa gerenciador = new GerenciaTarefa();
        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao Gerenciador de Tarefas!");
        
        do{
        System.out.println("1. Criar tarefa.");
        System.out.println("2. Listar tarefas.");
        System.out.println("3. Editar tarefa.");
        System.out.println("4. Remover tarefa.");
        System.out.println("5. Marcar tarefa como concluída.");
        System.out.println("6. Sair do programa.");
        opcao = sc.nextInt();
        
        switch(opcao){

            case 1:
                System.out.println("");
                gerenciador.criaTarefas();
                break;
            case 2:
                System.out.println("");
                gerenciador.listaTarefas();
                break;
            case 3:
                gerenciador.editaTarefas();
                break;
            case 4:
                gerenciador.removeTarefas();
                break;
            case 5:
                gerenciador.concluiTarefa();
                break;
        }
        }while(opcao!=6);
        sc.close();
    }
}
