package com.hotel.api.service;


import com.hotel.api.model.Usuario;

public interface UsuarioService {
    Usuario findById(Integer id);

    //Usuario findByName(String nome); Implementar depois

    Usuario create(String nome, String email, String contato);
}
