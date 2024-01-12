package projetofinal;
public class ProjetoFInal {
    public static void main(String[] args) {
            Video v[] = new Video[3];
        v[0] = new Video("Aula 1 Poo");
        v[1] = new Video("Aula 19 Php");
        v[2] = new Video("Aula 3 HTML5");
        
        Aluno a[] = new Aluno[2];
        a[0] = new Aluno("Jubileu", 25, "F", "Juba");
        a[1] = new Aluno("Creusa", 16, "M", "Creusa");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(a[0],v[2]);
        System.out.println(vis[0].toString());
        /*System.out.println("Videos\n-------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("Alunos\n-------------------");
        System.out.println(a[0].toString());
        System.out.println(a[1].toString());*/
                
    }
}