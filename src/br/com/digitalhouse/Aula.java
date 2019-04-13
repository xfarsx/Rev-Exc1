package br.com.digitalhouse;

public class Aula {
    private String horarioI;
    private String horarioF;
    private String materia;

    public Aula (){}
    public Aula(String horarioI, String horarioF, String materia) {
        this.horarioI = horarioI;
        this.horarioF = horarioF;
        this.materia = materia;
    }

    public String getHorarioI() {
        return horarioI;
    }

    public void setHorarioI(String horarioI) {
        this.horarioI = horarioI;
    }

    public String getHorarioF() {
        return horarioF;
    }

    public void setHorarioF(String horarioF) {
        this.horarioF = horarioF;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
