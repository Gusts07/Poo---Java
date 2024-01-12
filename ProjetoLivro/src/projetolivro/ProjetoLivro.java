package projetolivro;
public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro [3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Paula", 25, "F");
        
        l[0] = new Livro("Java Poo", "Roberto benevides", 300, p[0]);
        l[1] = new Livro("Aprender + Poo", "Claúdio brandão", 500, p[1]);
        l[2] = new Livro("As Crônicas de POO", "Carlos augusto aguiar", 1000, p[1]);
        
        l[0].abrir();
        l[0].folear(200);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        
    }
}
