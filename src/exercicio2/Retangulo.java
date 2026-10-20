package exercicio2;

    class Retangulo {
        private int comprimento = 1;
        private int largura = 1;

        public int getComprimento(){
            return comprimento;
        }

        public int getLargura(){
            return largura;
        }

        public void setComprimento(int comprimento){
            if(comprimento > 0 && comprimento < 20){
                this.comprimento = comprimento;
            }
        }

        public void setLargura(int largura){
            if(largura > 0 && largura < 20){
                this.largura = largura;
            }
        }
        public int calcularPerimetro(){
            return 2 * (comprimento + largura);
        }
        public int calcularArea(){
            return comprimento * largura;
        }
}
