import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        GerenciaTarefa gerenciador = new GerenciaTarefa();
        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao Gerenciador de Tarefas!\n\n");
        
        do{
        System.out.println("1. Criar tarefa.\n");
        System.out.println("2. Listar tarefas.\n");
        System.out.println("3. Editar tarefa.\n");
        System.out.println("4. Remover tarefa.\n");
        System.out.println("5. Sair do programa.\n");
        opcao = sc.nextInt();
        
        switch(opcao){

            case 1:
                gerenciador.criaTarefa();
                break;
            case 2:
                gerenciador.listaTarefas();
                break;
        }
        }while(opcao!=5);
        sc.close();
    }
}
