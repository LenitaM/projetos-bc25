package org.example;

public class Coordenacao {
    private int idCoordenacao;
    private String nome;
    private String coordernador;
    private String email;
    private int tel;


    Coordenacao (int idCoordenacao, String nome, String coordernador, String email, int tel) {
        this.idCoordenacao = idCoordenacao;
        this.nome = nome;
        this.coordernador = coordernador;
        this.tel = tel;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCoordernador() {
        return  this.coordernador;
    }
}
