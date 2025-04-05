package com.paulo.desafioProgramador.desafios;

public class Entrega {
    private String destinatario;
    private String endereco;
    private String tipoEntrega; // "normal" ou "expressa"
    private double distanciaKm;

    public Entrega(String destinatario, String endereco, String tipoEntrega, double distanciaKm) {
        this.destinatario = destinatario;
        this.endereco = endereco;
        this.tipoEntrega = tipoEntrega;
        this.distanciaKm = distanciaKm;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    // construtor, getters e setters
}
