package exercicio1;

class Emergencia {
    public String nomeChamador;
    public String telefoneChamador;
    public String localEmergencia;
    public String dataHoraRelato;
    public String naturezaEmergencia;
    public String tipoResposta;
    public String statusResposta;
    public String chamadaMovel;
    public String coordenadasGPS;

    public void mostrarEmergencias(){
        System.out.println("--- Informações da Emergência ---");
        System.out.println();
        System.out.println("Nome do Chamador: " + nomeChamador);
        System.out.println("Telefone: "+ telefoneChamador);
        System.out.println("Local da Emergência: "+ localEmergencia);
        System.out.println("Data/Hora do Relato: "+ dataHoraRelato);
        System.out.println("Natureza da Emergência: "+ naturezaEmergencia);
        System.out.println("Tipo de Resposta: "+ tipoResposta);
        System.out.println("Status da Resposta: "+ statusResposta);
        System.out.println("Chamada via celular: "+ chamadaMovel);

        if(chamadaMovel.equalsIgnoreCase("Sim")){
            System.out.println("Coordenadas GPS: " + coordenadasGPS);
        }
    }
}