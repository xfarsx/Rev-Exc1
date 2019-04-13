package br.com.digitalhouse;

public class Prof implements GerarNumero{

        private String nome;
        private Integer rd = 0;

        public Prof (){}

    public Prof(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRd() {
        return rd;
    }
    public void setRd(Integer rd) {
        this.rd = rd;
    }

    @Override
    public int gerarnumero(int codigo) {
        codigo = rd + 1;
        return codigo;
    }
}
