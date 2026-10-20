package exercicio4;

class Conta {
    private int numeroConta;
    private String nomeCliente;
    private double saldo;
    private int senha;

    //construtor
    public Conta(int numeroConta, String nomeCliente, double saldo, int senha){
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.senha = senha;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public String getNomeCliente(){
        return  nomeCliente;
    }
    public double getSaldo(int senhaInformada){
        if(this.senha == senhaInformada){
            return this.saldo;
        }
        return -1.0;
    }

    public boolean sacar(double valor, int senhaInformada){
        if(this.senha == senhaInformada && valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean depositar(double valor, int senhaInformada){
        if(this.senha == senhaInformada && valor > 0){
            this.saldo += valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, int senhaInformada, Conta conta2){
        if(this.senha == senhaInformada && valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
            conta2.saldo += valor;
            return true;
        }
        return false;
    }
}
