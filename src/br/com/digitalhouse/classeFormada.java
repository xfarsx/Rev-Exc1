package br.com.digitalhouse;

public class classeFormada {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Fernando","Santos");
        Prof professor = new Prof("Jessica");
        Prof professor2 = new Prof("Tairo");
        Turma turma = new Turma ("19h","22h30","História Java","Mobile","Noite");




        System.out.println(professor.gerarnumero(0));
        System.out.println(professor2.gerarnumero(1));
        System.out.println(aluno.gerarnumero(0));

    }
}
