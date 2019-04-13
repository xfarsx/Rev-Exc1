package br.com.digitalhouse;

public class Aluno implements GerarNumero {

    private String nome;
    private String sobrenome;
    private Integer ra = 0;

    public Aluno(){}

    public Aluno(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }
    @Override
    public int gerarnumero(int codigo) {
        codigo = ra + 1;
        return codigo;
    }
}
