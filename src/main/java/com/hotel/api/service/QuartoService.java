package com.hotel.api.service;

import com.hotel.api.model.Quarto;

public interface QuartoService {
    Quarto findById(Integer id);

    Quarto create(Quarto quarto);
}
