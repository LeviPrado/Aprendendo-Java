package lista3Exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String agencia = scanner.next();
        String numero = scanner.next();
        double valor = scanner.nextDouble();

        Conta conta = new Conta();
        conta.agencia = agencia;
        conta.numero = numero;

        boolean depositoSucesso = false;

        try{
            conta.depositaPersonalizado(valor);
            System.out.println("Depósito realizado com sucesso.");
            depositoSucesso = true;
        }

        catch(DepositoInvalidoException e){
            System.out.println("Erro: " + e.getMessage());
            depositoSucesso = false;
        }

        finally {
            if(depositoSucesso){
                System.out.printf("Valor %.2f depositado na conta. Novo saldo: %.2f%n", valor, conta.saldo);
            }
            else{
                System.out.printf("Valor %.2f incorreto. Saldo atual: %.2f%n", valor, conta.saldo);
            }
        }
    }
}
