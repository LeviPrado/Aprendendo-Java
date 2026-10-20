package exercicio3;

class Temperatura {
    private double temperatura;

    public Temperatura(double temperaturaInicial){
        this.temperatura = temperaturaInicial;
    }

    public void converteFahrenheit(){
        this.temperatura = this.temperatura * 9.0 / 5.0 + 32;
    }

    public void converteCeusius(){
        this.temperatura = (this.temperatura - 32) * 5.0 / 9.0;
    }

    @Override
    public String toString(){
        return String.valueOf(this.temperatura);
    }
}
