package exercicio5;

import java.util.Scanner;

public class TestaCirculo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Circulo[] vetor1 = new Circulo[3];
        for(int i = 0; i < 3; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int raio = scanner.nextInt();
            vetor1[i] = new Circulo(x, y, raio);
        }
        Circulo[] vetor2 = vetor1;

        Circulo[] vetor3 = new Circulo[3];

        for(int i = 0; i < 3; i++){
            vetor3[i] = new Circulo(vetor1[i].getX(), vetor1[i].getY(), vetor1[i].getRaio());
        }

        for(int i = 0; i < 3; i++){
            int novoRaio = scanner.nextInt();
            vetor1[i].setRaio(novoRaio);
        }

        System.out.println("vetor1:");
        for(int i = 0; i < 3; i++){
            System.out.println(vetor1[i].toString());
        }

        System.out.println("vetor2:");
        for(int i = 0; i < 3; i++){
            System.out.println(vetor2[i].toString());
        }

        System.out.println("vetor3:");
        for(int i = 0; i < 3; i++){
            System.out.println(vetor3[i].toString());
        }
    }
}
