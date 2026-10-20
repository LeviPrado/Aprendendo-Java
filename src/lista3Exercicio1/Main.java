package lista3Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(){
        Scanner entrada = new Scanner(System.in);

        try{
            String nome = entrada.nextLine();
            int producao = entrada.nextInt();
            int horas = entrada.nextInt();

            Funcionario funcionario = new Funcionario(nome, producao, horas);
            int produtividade = funcionario.calcularProdutividade();

            System.out.printf("Produtividade: %d peças por hora%n", produtividade);
        }

        catch (ArithmeticException e){
            System.out.println("Erro: horas trabalhadas não podem ser zero.");
        }

        catch(Exception e){
            System.out.println("Erro inesperado");
        }
    }
}
