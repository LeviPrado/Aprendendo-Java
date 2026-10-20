package lista3Exercicio2;

class ValidarSenha {
    public void verificarMaiusculas(String senha){
        boolean temMaiuscula = false;

        for(int i = 0; i < senha.length(); i++){
            if(Character.isUpperCase(senha.charAt(i))){
                temMaiuscula = true;
                break;
            }
        }

        if(!temMaiuscula){
            throw new IllegalArgumentException("Erro: a senha deve conter pelo menos uma letra maiúscula");
        }
    }
}