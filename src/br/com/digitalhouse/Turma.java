package br.com.digitalhouse;

public class Turma extends Aula {

    private String curso;
    private String turma;

    public Turma(String horarioI, String horarioF, String materia, String curso, String turma) {
        super(horarioI, horarioF, materia);
        this.curso = curso;
        this.turma = turma;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }



}
