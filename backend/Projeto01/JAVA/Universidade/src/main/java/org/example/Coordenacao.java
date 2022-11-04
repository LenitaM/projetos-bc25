package org.example;

public class Coordenacao {
    private int idCoordenacao;
    private String curso;
    private String coordernador;
    private String email;
    private int tel;
    private String endereco;
    private int numero;
    private String cidade;
    private String estado;


     public Coordenacao (int idCoordenacao, String curso, String coordernador, String email, int tel) {
        this.idCoordenacao = idCoordenacao;
        this.curso = curso;
        this.coordernador = coordernador;
        this.email = email;
        this.tel = tel;
        this.endereco = endereco;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getCurso(){

        return this.curso;
    }

    public String getCoordernador() {

        return  this.coordernador;
    }

    public String get() {

        return this.coordernador + " é responsável pelo " + this.curso;
    }
}
