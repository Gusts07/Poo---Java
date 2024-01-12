package aula05;

import static java.util.Arrays.equals;

public class ContaBanco {
//Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean estado;
    
   //metodos personalizados
   public void estadoATual(){
       System.out.println("------------------------");
       System.out.println("Conta: " + this.getNumConta());
       System.out.println("Tipo: " + this.getTipo());
       System.out.println("Dono: " + this.getDono());
       System.out.println("Saldo: " + this.getSaldo());
       System.out.println("Estado: " + this.getEstado());
       System.out.println("------------------------");
   }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setEstado(true);
       
        if ("CC".equals(t)){
           this.setSaldo(50);
        } else if ("CP".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    public void fecharConta(){
        if (this.getSaldo()>0){
            System.out.println("Conta não pode ser fechada,saldo está positivo");
        }else if(getSaldo()<0){
            System.out.println("Conta não pode ser fechada,saldo está negativo");
        }else {
            this.setEstado(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    public void depositar(float s){
        if (this.getEstado()== true){
            this.setSaldo(this.getSaldo()+s);
            System.out.println("Depósito realizado com sucesso na conta de " +this.getDono());
        }else{
            System.out.println("impossivel depositar em uma conta fechada");
        }
    }
    public void sacar(float s){
        if (this.getEstado()){
            if(this.getSaldo()>= s){
                this.setSaldo(this.getSaldo()-s);
                System.out.println("Saldo realizado na conta de " +this.getDono());
            }else {
                System.out.println("Saldo insuficiente");
            }
        }else {
            System.out.println("Impossivel sacar de conta fechada");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        }else if (this.getTipo() == "CP"){
            v = 20;
        }if (this.getEstado()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso");
        }else{
        System.out.println("Impossivel pagar uma conta fechada");
        }
    }
 //Metodos especiais
    public void contaBanco(){
        this.saldo = 0;
        this.estado = false;
    }
    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta(){
        return this.numConta;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return this.dono;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setEstado(boolean e){
        this.estado = e;
    }
    public boolean getEstado(){
        return this.estado;
    }
}