import java.util.ArrayList;
import java.util.Scanner; 

public class Capitulo{

    String nome;
    String texto;
    ArrayList <Escolha> escolhas;
    Personagem perso;
    int alterarEnergia;
    Scanner input;

    Capitulo(String nome, 
             String texto, 
             String[] escolhas,
             Personagem perso, 
             int alterarEnergia, 
             Scanner input){

        this.nome = nome;
        this.texto = texto;
        this.perso = perso;
        this.alterarEnergia = alterarEnergia;
        this.input = input;
        this.escolhas = new ArrayList<Escolha>();
    }
    void mostrar(){
        System.out.println(this.texto);
        this.perso.alterarEnergia(this.alterarEnergia);
        System.out.println();

         if(this.escolhas.size() > 0){
         for(Escolha escolha : escolhas){
             System.out.println(escolha.texto);
        }
        int IdEscolha = escolher();
        this.escolhas.get(IdEscolha).próximo.mostrar();

         }
        
        }
        int escolher(){
        int idEscolha=0;
        String receba=input.nextLine();
         for(int i = 0; i<escolhas.size();i++){
          if (receba.equals(escolhas.get(i))){
        idEscolha=i;
        }
        }
        return idEscolha;
        }
        }
        
        
