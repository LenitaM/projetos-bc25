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

    Departamento (int idDepartamento, String diretor, String centro, String email, int tel, String endereco, int numero,  String cidade, String estado) {
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

}
