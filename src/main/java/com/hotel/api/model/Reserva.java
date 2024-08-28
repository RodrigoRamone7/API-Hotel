package com.hotel.api.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "tb_reserva")
public class Reserva {

    public Reserva(int id_usuario, Integer id_quarto) {
        this.id_usuario = id_usuario;
        this.id_quarto = id_quarto;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "data_checkin")
    private Date dataCheckIn;

    @Column(name = "data_checkout")
    private Date dataCheckOut;

    @ManyToOne(targetEntity = Usuario.class)
    private Integer id_usuario;

    @ManyToOne(targetEntity = Quarto.class)
    private Integer id_quarto;

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(Date dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public Date getDataCheckOut() {
        return dataCheckOut;
    }

    public void setDataCheckOut(Date dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Integer getId_quarto() {
        return id_quarto;
    }

    public void setId_quarto(Integer id_quarto) {
        this.id_quarto = id_quarto;
    }
}
