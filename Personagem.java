public class Personagem {

    String nome;
    String texto;
    int energia;

    Personagem(String nome, int energia){

        this.nome = nome;
        this.energia = 100;
    }

    void alterarEnergia(int alteracao){
        this.energia = this.energia + alteracao;

        if (alteracao >= 0) {
            System.out.println("Você realizou sua ação e recebeu " + alteracao + " pontos de energia");
        } else {
            System.out.println("Você realizou sua ação e perdeu " + alteracao + " pontos de energia");
        }

        if(this.energia > 100){
            this.energia = 100;
        } else if(this.energia < 0){
            this.energia = 0;
            System.out.println("Você foi derrotado, tente novamente!");
        }

    }
}
