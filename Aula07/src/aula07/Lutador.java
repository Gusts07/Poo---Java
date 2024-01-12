package aula07;
public class Lutador{
//Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empate;
    
//Metodos personalizados
    
    public void apresentar(){
        System.out.println("---------------------------------------------");
        System.out.println("Apresentando Lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " Anos");
        System.out.println(this.getAltura() + "m De Altura");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println("Com incriveis " + this.getVitoria() + " Vitorias!");
        System.out.println("Apenas " + this.getDerrota() + " Derrotas!");
        System.out.println("E tendo " + this.getEmpate() + " Empates!");
        System.out.println("---------------------------------------------");
    }
    
    public void status(){
        System.out.println("---------------------------------------------");
        System.out.println(this.getNome() + " e um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitoria());
        System.out.println("Perdeu " + this.getDerrota());
        System.out.println("Empatou " + this.getEmpate());
        System.out.println("---------------------------------------------");    
    }
    
    public void ganharLuta(){
        this.setVitoria(this.getVitoria() + 1);
    }
    
    public void perderLuta(){
        this.setDerrota(this.getDerrota() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpate(this.getEmpate() + 1);
    }
    //Construttor

    public Lutador(String no, String nac, int id, float alt, float pe, int v, int d, int e) {
        this.nome = no;
        this.nacionalidade = nac;
        this.idade = id;
        this.altura = alt;
        this.setPeso(pe);
        this.vitoria = v;
        this.derrota = d;
        this.empate = e;
    }
    
    //Metodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2){
            this.categoria = "Inválido";
        }
        else if (this.peso <= 70.3){
            this.categoria = "Leve";    
        }
        else if (this.peso <= 83.9){
            this.categoria = "Medio";
        }
        else if (this.peso <= 120.2){
            this.categoria = "pesado";
        }
        else  
             this.categoria = "Invalido";
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
}