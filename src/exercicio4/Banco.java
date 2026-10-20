package exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int n1 = scanner.nextInt();
        int s1 = scanner.nextInt();
        String nome1 = scanner.next();
        double saldo1 = scanner.nextDouble();
        Conta conta1 = new Conta(n1, nome1, saldo1, s1);
        
        int n2 = scanner.nextInt();
        int s2 = scanner.nextInt();
        String nome2 = scanner.next();
        double saldo2 = scanner.nextDouble();
        Conta conta2 = new Conta(n2, nome2, saldo2, s2);
        
        while(true){
            int opcao = scanner.nextInt();
            
            if(opcao == 5){
                break;
            } else if (opcao == 1) {
                int senha = scanner.nextInt();
                double saldo = conta1.getSaldo(senha);
                if(saldo != -1.0){
                    System.out.printf("%.2f%n", saldo);
                } else{
                    System.out.println("senha incorreta");
                }
            } else if (opcao == 2) {
                double valor = scanner.nextDouble();
                int senha = scanner.nextInt();
                if (conta1.sacar(valor, senha)) {
                    System.out.println("saque realizado");
                } else {
                    System.out.println("saque não realizado");
                }
            } else if (opcao == 3) {
                double valor = scanner.nextDouble();
                int senha = scanner.nextInt();
                if (conta1.depositar(valor, senha)) {
                    System.out.println("depósito realizado");
                } else {
                    System.out.println("depósito não realizado");
                }
            } else if (opcao == 4) {
                String nomeDestino = scanner.next();

                if (nomeDestino.equals(conta2.getNomeCliente())) {
                    double valor = scanner.nextDouble();
                    int senha = scanner.nextInt();
                    if (conta1.transferir(valor, senha, conta2)) {
                        System.out.println("transferência realizada");
                    } else {
                        System.out.println("transferência não realizada");
                    }
                } else {
                    System.out.println("nenhum usuário encontrado");
                }
            }
        }
    }
}
