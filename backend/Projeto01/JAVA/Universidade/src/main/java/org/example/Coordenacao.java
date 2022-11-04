package org.example;

public class Coordenacao {
    private int idCoordenacao;
    private String nome;
    private String coordernador;
    private String email;
    private int tel;
    private String endereco;
    private int numero;
    private String cidade;
    private String estado;


    Coordenacao (int idCoordenacao, String nome, String coordernador, String email, int tel) {
        this.idCoordenacao = idCoordenacao;
        this.nome = nome;
        this.coordernador = coordernador;
        this.email = email;
        this.tel = tel;
        this.endereco = endereco;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCoordernador() {
        return  this.coordernador;
    }
}
