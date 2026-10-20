package Lista4Exercicio2;

import java.util.Objects;

public class Engenheiro {
    private String nome;

    public Engenheiro(String nome){
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
        Engenheiro que = (Engenheiro) o;
        return Objects.equals(nome, que.nome);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome);
    }
}
