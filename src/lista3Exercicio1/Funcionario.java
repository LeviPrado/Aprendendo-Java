package lista3Exercicio1;

    class Funcionario {
        public String nomeFuncionario;
        public int qtdProducao;
        public int horasTrabalhadas;

        public Funcionario(String nomeFuncionario, int qtdProducao, int horasTrabalhadas){
            this.nomeFuncionario = nomeFuncionario;
            this.qtdProducao = qtdProducao;
            this.horasTrabalhadas = horasTrabalhadas;
        }

        public int calcularProdutividade(){
            return qtdProducao / horasTrabalhadas;
        }
}

