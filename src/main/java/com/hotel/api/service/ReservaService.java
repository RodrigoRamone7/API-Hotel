package com.hotel.api.service;

import com.hotel.api.model.Reserva;

public interface ReservaService {
    Reserva findById(Integer id);

    Reserva create(Reserva reserva);
}
