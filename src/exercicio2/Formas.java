package exercicio2;

import java.util.Scanner;

public class Formas {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo();

        int c1 = scanner.nextInt();
        int l1 = scanner.nextInt();
        r1.setComprimento(c1);
        r1.setLargura(l1);

        int c2 = scanner.nextInt();
        int l2 = scanner.nextInt();
        r2.setComprimento(c2);
        r2.setLargura(l2);

        System.out.println(r1.getComprimento() + " " + r1.getLargura() + " " + r1.calcularPerimetro() + " " + r1.calcularArea());
        System.out.println(r2.getComprimento() + " " + r2.getLargura() + " " + r2.calcularPerimetro() + " " + r2.calcularArea());
    }
}
