import java.util.Scanner;
import java.util.ArrayList;

public class GerenciaTarefa {
    Scanner sc = new Scanner(System.in);
    ArrayList<Tarefa> tarefas = new ArrayList<>();
    int idAux;
    String tituloAux;
    String descricaoAux;


    public void CriaTarefa(){
        System.out.println("Id: ");
        idAux = sc.nextInt();
        System.out.println("Titulo: ");
        tituloAux = sc.nextLine();
        System.out.println("Descrição: ");
        descricaoAux = sc.nextLine();
        
        tarefas.add(new Tarefa(idAux, tituloAux, descricaoAux));
    }
}
