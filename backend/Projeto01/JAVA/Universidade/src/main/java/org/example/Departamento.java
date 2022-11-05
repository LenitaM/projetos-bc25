package org.example;

public class Departamento {
    private int idDepartamento;
    private String diretor;
    private String centro;
    private String email;
    private int tel;
    private String endereco;
    private int numero;
    private String cidade;
    private String estado;

    public Departamento (int idDepartamento, String diretor, String centro, String email, int tel, String endereco, int numero,  String cidade, String estado) {
        this.idDepartamento = idDepartamento;
        this.diretor = diretor;
        this.centro = centro;
        this.email = email;
        this.tel = tel;
        this.endereco = endereco;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getDiretor() {
        return this.diretor;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getCentro() {
        return this.centro;
    }

    public String getNomeCentro() {

        return this.diretor + " é diretora do Centro Universitário " + this.centro;
    }

    //Teste
    public static void main (String[] args){

        Departamento diretor = new Departamento (1,"Renata Vasconcelos", "CIN","renatavasconcelos@gmail.com",978776655, "Av. Prof. Moraes Rego",1235,"Recife","PE");

        System.out.println(diretor.getDiretor());

        System.out.println(diretor.getNomeCentro());

    }
}


