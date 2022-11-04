package org.example;

public class Professor {
    private int idProfessor;
    private String nome;
    private String email;
    private int tel;
    private String disciplina;
    private String endereco;
    private int numero;
    private String cidade;
    private String estado;

    public Professor (int idProfessor, String nome, String email, int tel, String disciplina, String endereco, int numero, String cidade, String estado) {
        this.idProfessor = idProfessor;
        this.nome = nome;
        this.email = email;
        this.tel = tel;
        this.disciplina = disciplina;
        this.endereco = endereco;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;

    }

    public int getTel() {

        return this.tel;
    }

    public String getNome() {
        return  this.nome;
    }

    public void setDisciplina(String addDisciplina) {
        if (addDisciplina == "Algoritmos e Programa II"){
            this.disciplina = addDisciplina;
        System.out.println("Foi adicionano ao professor " + getNome() + " a disciplina " + addDisciplina + ".");
        }else {
            System.out.println("O " + getNome() + ", não corresponde a essa matéria.");
        }
    }


}
