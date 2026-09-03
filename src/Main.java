import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura do dicionario
        int num = scanner.nextInt();
        String[] dicionario = new String[num];

        for(int i = 0; i < num; i++){
            dicionario[i] = scanner.next();
        }

        String palavra = scanner.next();
        boolean palavraCorreta = false;

        for(int i = 0; i < num; i++){
            if(dicionario[i].equals(palavra)){
                palavraCorreta = true;
                break;
            }
        }

        if(palavraCorreta){
            System.out.println("palavra correta");
        } else {
            System.out.println("palavra incorreta");
            boolean achouSugestao = false;

            for(int i = 0; i < palavra.length() - 1; i++){
                StringBuilder sb = new StringBuilder(palavra);
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(i + 1));
                sb.setCharAt(i + 1, temp);

                String transposta = sb.toString();

                for(int j = 0; j < num; j++){
                    if(dicionario[j].equals(transposta)){
                        System.out.println(transposta + "?");
                        achouSugestao = true;
                        break;
                    }
                }
                if(achouSugestao){
                    break;
                }
            }
            if(!achouSugestao){
                System.out.println("nenhuma sugestão");
            }
        }
        scanner.close();
    }
}