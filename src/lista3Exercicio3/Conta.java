package lista3Exercicio3;

class Conta {
    public String agencia;
    public String numero;
    public double saldo = 0.0;

    public void depositaPersonalizado(double valor){
        if(valor <= 0.0){
            throw new DepositoInvalidoException("Valor inválido para depósito");
        }

        if(valor > 10000.00){
            throw new DepositoInvalidoException("Valor acima do limite permitido de 10000.00");
        }

        this.saldo += valor;
    }
}