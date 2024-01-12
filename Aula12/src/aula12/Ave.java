package aula12;
public class Ave extends Animal{
    private String corPena;
          
    @Override
    public void locomover(){
        System.out.println("Voando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo Frutas");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de ave");
    }
    public void soltarBolhas(){
        System.out.println("Soltou uma bolha");
    }
    public void fazerNInho(){
        System.out.println("Fez um ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}
