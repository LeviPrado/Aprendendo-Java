package Lista4Exercicio2;

import java.util.Objects;

public class Funcionario {
    private String nome;

    public Funcionario(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null || getClass() != o.getClass()){
            return false;
        }
        Funcionario que = (Funcionario) o;
        return Objects.equals(nome, que.nome);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome);
    }
}
