import javafx.scene.Cursor;

public class Aluno {
    private String nome;
    private String curso;
    private String disciplina;
    private int bimestre;
    private double nota;

    //Construtor
    public Aluno(String nome, String curso, String disciplina, int bimestre, double nota){
        this.nome = nome;
        this.curso = curso;
        this.disciplina = disciplina;
        this.bimestre = bimestre;
        this.nota = nota;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }
        

    public String getCurso(){
        return this.curso;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
        
    public String getDisciplina(){
        return this.disciplina;
    }

    public void setBimestre(int bimestre){
        this.bimestre = bimestre;
    }
        
    public int getBimestre(){
        return this.bimestre;
    }

    public void setNota(double nota){
        this.nota = nota;
    }

    public double getNota(){
        return this.nota;
    }

}
