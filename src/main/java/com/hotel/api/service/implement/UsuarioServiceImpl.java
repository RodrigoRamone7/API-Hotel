package com.hotel.api.service.implement;

import com.hotel.api.model.Telefone;
import com.hotel.api.model.Usuario;
import com.hotel.api.repository.UsuarioRepository;
import com.hotel.api.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario findById(Integer id) {
        return usuarioRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    /*@Override
    public Usuario findByName(String nome) {
        return usuarioRepository.findB; Implementar depois
    }*/

    @Override
    public Usuario create(String nome, String email, String contato) {
        Usuario usuarioACriar = new Usuario(nome, email, new Telefone(contato));
        if(usuarioRepository.existsByEmail(usuarioACriar.getEmail())){
            throw new IllegalArgumentException("Este email já está sendo utilizado por outro usuário.");
        }
        return usuarioRepository.save(usuarioACriar);
    }
}
