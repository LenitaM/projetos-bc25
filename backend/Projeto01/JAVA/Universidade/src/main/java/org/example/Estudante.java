package org.example;

public class Estudante {
    private int idEstudante;
    public String nome;
    public String curso;
    private String email;
    private int tel;
    private String cpf;
    private String endereco;
    private int numero;
    private String cidade;
    private String estado;

    public Estudante (int idEstudante, String nome, String curso, String cpf, int tel, String email, String endereco, int numero,  String cidade, String estado) {
        this.idEstudante= idEstudante;
        this.nome = nome;
        this.curso = curso;
        this.cpf = cpf;
        this.tel = tel;
        this.email = email;
        this.endereco = endereco;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCurso (String trocarCurso){
        if (trocarCurso == "Ciência da Computação") {
            this.curso = trocarCurso;
            System.out.println(getNome() + ", "+ " você selecionou uma área correspondente a sua área, prepare-se para a prova interna. Boa sorte!");
        }else {
            System.out.println("Você não selecionou um curso correspondente a sua área. Processo de modificação anulada.");
        }
    }

    public String getCurso() {
        return this.curso;
    }


    public void setTel(int novoTel) {
        if (novoTel > 9) {
            this.numero = novoTel;
            System.out.println("Novo número do estudante " + getNome() + " é " + novoTel + ".");
        } else {
            System.out.println("Número inválido. Seu número não foi modificado.");
        }
    }

    public String getEndereco() {

        return this.endereco;
    }

    public String getNomeCurso() {

        return this.nome + " é estudante do curso de " + this.curso;
    }

    public void setEndereco(String novoEndereco) {

        this.endereco = novoEndereco;
    }

    //Teste
    public static void main(String[] args){

        Estudante estudante1 = new Estudante(1,"Pedro Henrique", "ADS",  "222.222.222-11", 555555555, "pedrohenri@gmail.com", "rua Soledad", 123, "Recife", "PE");

    System.out.println(estudante1.getNome());
    System.out.println(estudante1.getNomeCurso());

    estudante1.setTel(98759878);



    }

}
