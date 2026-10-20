package lista3Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        ValidarSenha validador = new ValidarSenha();

        boolean senhaValida = false;

        while(!senhaValida){
            String senha = scanner.next();

            try{
                validador.verificarMaiusculas(senha);

                System.out.println("Senha válida");
                senhaValida = true;
            }

            catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
