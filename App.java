import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        
        Scanner leitor = new Scanner(System.in);

        Personagem Chapeuzinho = new Personagem(
            "Chapeuzinho",
            100);

        Capitulo capitulo1 = new Capitulo(
            "Capitulo 1",
            "Chapeuzinho! Chapeuzinho!, desça as escadas e leve esses doces para a sua vózinha \n - Cheguei mãe, posso pegar um dos doces? \n - Não! pegue esssa cesta e leve para ela, cuidado ao sair, e vá pelo caminho seguro \n\n Ao sair de casa você se depara com dois caminhos, o caminho seguro demora um pouco mais, contudo o caminho perigoso é mais rápido, qual seguir:",
            new String [] {"Caminho seguro",
             "Caminho perigoso"},
             Chapeuzinho,
            0,
            leitor);

        Capitulo capitulo2 = new Capitulo(
            "Final 1",
            "Você foi pelo caminho seguro! Você andou a tarde toda, e chegou cansada na casa de sua avó\n Ao chegar, você foi recebida com um beijo e um abraço quente de sua avó\nVocê teve um final feliz!",
            new String []{"",
            ""},
            Chapeuzinho,
            -75,
            leitor);

        Capitulo capitulo3 = new Capitulo(
            "Caminho perigoso",
            "\nAo caminhar na floresta densa, você encontra com um lobo enorme \nvocê se esconde e pensa em no que fazer, ao olhar pro lado você uma arvoré, para onde ir?",
           new String[]{ "Correr",
            "Arvore"},
            Chapeuzinho,
            -50,
            leitor);

        Capitulo capitulo4 = new Capitulo(
            "Final 2",
            "\nVocê tenta correr mais rápido que o lobo, mas ele te alcança e te morde \nSua família espera por você até hoje",
          new String[]{  "",
            ""},
            Chapeuzinho,
            -50,
            leitor);

        Capitulo capitulo5 = new Capitulo(
            "Final 3",
            "\nVocê foge por cima das arvorés e consegue sair da floresta, contudo você chega toda suja e sua vó reclama com você \nVocê não conta a ela por onde foi, e continua com sua vida",
            new String []{"",
            ""},
            Chapeuzinho,
            +50,
            leitor);


        

        
        
        capitulo1.escolhas.add(new Escolha( "Caminho perigoso", capitulo3));
        capitulo3.escolhas.add(new Escolha( "Arvore",capitulo5));
        Capitulo raiz = capitulo1;
        raiz.mostrar();
        leitor.close();
       
        
    }
}

