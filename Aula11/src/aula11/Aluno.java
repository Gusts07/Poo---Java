package aula11;
public class Aluno extends Pessoa{
    private String curso;
    private int matricula;
    public  void pagarMensalidade(){
        System.out.println("Pagando Mensalidade do Aluno " + this.getNome());
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
