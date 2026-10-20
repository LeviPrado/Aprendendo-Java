package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtdEmergencia = scanner.nextInt();
        scanner.nextLine();

        Emergencia[] listaEmergencia = new Emergencia[qtdEmergencia];

        for(int i = 0; i < qtdEmergencia; i++){
            listaEmergencia[i] = new Emergencia();

            listaEmergencia[i].nomeChamador = scanner.nextLine();
            listaEmergencia[i].telefoneChamador = scanner.nextLine();
            listaEmergencia[i].localEmergencia = scanner.nextLine();
            listaEmergencia[i].dataHoraRelato = scanner.nextLine();
            listaEmergencia[i].naturezaEmergencia = scanner.nextLine();
            listaEmergencia[i].tipoResposta = scanner.nextLine();
            listaEmergencia[i].statusResposta = scanner.nextLine();

            String resposta_movel = scanner.nextLine();

            if(resposta_movel.equalsIgnoreCase("Sim")){
                listaEmergencia[i].chamadaMovel = "Sim";
                listaEmergencia[i].coordenadasGPS = scanner.nextLine();
            } else{
                listaEmergencia[i].chamadaMovel = "Não";
            }
        }
        for(int i = 0; i < qtdEmergencia; i++){
            System.out.println("Emergência #" + (i + 1));
            System.out.println();
            listaEmergencia[i].mostrarEmergencias();

            if(i < qtdEmergencia - 1){
                System.out.println();
            }
        }
        scanner.close();
    }
}
