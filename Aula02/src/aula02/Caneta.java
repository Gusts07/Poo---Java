package aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tamapada;
    void status(){
        System.out.println("Uma caneta cor " + this.cor);
        System.out.println("Está tampanda? " + this.tamapada);
        System.out.println("Modelo " + this.modelo);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        
    }
    void rabiscar(){
        if(this.tamapada == true){
        System.out.println("Erro, não posso rabiscar! ")
                } 
        else{
            System.out.println("Estou rabiscando! ");
        }
    }
    void tampar(){
        this.tamapada = true;
    }
    void destampar(){
        this.tamapada = false
    }
}
