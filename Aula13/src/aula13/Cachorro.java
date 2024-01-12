package aula13;
public class Cachorro extends Lobo{
    
@Override
    public void emitirSom(){
        System.out.println("Au! Au! Au!");
    }
    public void reagir(String frase){
     if(frase.equals("toma comida") || frase.equals("ola")){
        System.out.println("Abanar e latir");
     } else {
         System.out.println("Rosnar");
     }
    }
    public void reagir(int hora, int min){
        if(hora < 12 ){
            System.out.println("Abanar");
        }else if (hora >=18){
            System.out.println("ignorar");
        }
    }
    public void reagir(boolean dono){
        if(dono){
            System.out.println("abanar");
            }else{
            System.out.println("rosnar e latir");
        }
    }
    public void reagir(float peso, int idade){
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
       }
    
    }
}