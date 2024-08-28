package com.hotel.api.model;

import jakarta.persistence.*;

@Entity(name = "tb_telefone")
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "contato_telefone")
    private String contato;

    @ManyToOne(targetEntity = Usuario.class)
    private int id_usuario;

    public Telefone(String contato) {
        this.contato = contato;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
