package com.hotel.api.controller;

import com.hotel.api.model.Telefone;
import com.hotel.api.model.Usuario;
import com.hotel.api.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/users")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<Usuario> create (@RequestBody String nome,@RequestBody String email,@RequestBody String contato){
        var usuarioCriar = usuarioService.create(nome, email, contato);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("{id}")
                .buildAndExpand(usuarioCriar.getId())
                .toUri();
        return ResponseEntity.created(location).body(usuarioCriar);
    }
}
