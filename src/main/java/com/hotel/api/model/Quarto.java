package com.hotel.api.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_quartos")
public class Quarto {

    public Quarto(int numero, int capacidade, BigDecimal preco) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.preco = preco;
    }

    public Quarto(int numero, String tipo, int capacidade, BigDecimal preco) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.preco = preco;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "numero_quarto", nullable = false)
    private int numero;

    @Column(name = "tipo_quarto")
    private String tipo;

    @Column(name = "capacidade_quarto", nullable = false)
    private int capacidade;

    @Column(name = "preco_quarto", nullable = false, precision = 10, scale = 2)
    private BigDecimal preco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
