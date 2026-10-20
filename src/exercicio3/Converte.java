package exercicio3;

import java.util.Scanner;
import java.util.Locale;

public class Converte {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double entradaCeusius = scanner.nextDouble();

        Temperatura t = new Temperatura(entradaCeusius);

        t.converteFahrenheit();
        System.out.println("temperatura: " + t.toString() + " graus fahrenheit");

        t.converteCeusius();
        System.out.println("temperatura: " + t.toString() + " graus ceusius");
    }
}
