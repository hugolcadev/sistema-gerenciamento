import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tarefa {
    private int id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataCriacao;
    private boolean concluida;

    public Tarefa(int id, String titulo, String descricao){
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = LocalDateTime.now();
        this.concluida = false;
    }

    public Tarefa(){

    }

    //getters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getdataCriacao() {
        return dataCriacao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }    

    //para mostrar a data formatada
    public String getDataFormatada() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return dataCriacao.format(formatter);
    }

    //marca a tarefa como concluída
    public void ConcluiTarefa(){
        this.concluida = true;
    }
}
