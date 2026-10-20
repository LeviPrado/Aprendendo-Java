package Lista4Exercicio2;

public class Tarefa {
    private String descricao;
    private String dataExecucao;
    private int qtdHoras;
    private Funcionario funcionarioResponsavel;

    public Tarefa(String descricao, String dataExecucao, int qtdHoras, Funcionario funcionarioResponsavel){
        this.descricao = descricao;
        this.dataExecucao = dataExecucao;
        this.qtdHoras = qtdHoras;
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public String getDescricao(){
        return descricao;
    }

    public String getDataExecucao(){
        return dataExecucao;
    }

    public int getQtdHoras(){
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras){
        if(qtdHoras <= 0){
            throw new IllegalArgumentException("A quantidade de horas deve ser positiva");
        }
        this.qtdHoras = qtdHoras;
    }

    public Funcionario getFuncionarioResponsavel(){
        return funcionarioResponsavel;
    }
}
