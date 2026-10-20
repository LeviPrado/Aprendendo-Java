package Lista4Exercicio2;

import java.util.List;
import java.util.ArrayList;

public class Projeto {
    private String nome;
    private String status;
    private String dataInicio;
    private String dataFim;
    private Engenheiro engenheiroResponsavel;
    private List<Tarefa> tarefas;

    public Projeto(String nome, String status,String dataInicio, String dataFim, Engenheiro engenheiroResponsavel){
        this.nome = nome;
        this.status = status;
        this.dataInicio = dataInicio;
        this.dataFim = (dataFim != null && !dataFim.trim().isEmpty()) ? dataFim : "em aberto";
        this.engenheiroResponsavel = engenheiroResponsavel;
        this.tarefas = new ArrayList<>();
    }
}
