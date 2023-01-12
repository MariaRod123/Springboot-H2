package com.h2.h2.api.controller;

import com.h2.h2.api.model.Usuario;
import com.h2.h2.api.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class UsuarioController {
    private final UsuarioService usuarioService;


    @PostMapping("/usuarios")
    public ResponseEntity guardarUsuario(@RequestBody  Usuario usuario){
        return new ResponseEntity<>(usuarioService.guardarUsuario(usuario), HttpStatus.CREATED);

    }

    @GetMapping("/usuarios/{id}")
    public ResponseEntity obtenerUsuario(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(usuarioService.obtenerUsuario(id), HttpStatus.OK);
    }


    @DeleteMapping("/usuarios/{id}")
    public ResponseEntity eliminarUsuario(@PathVariable("id") Integer id){
        boolean respuesta= usuarioService.eliminarUsuario(id);
        if(respuesta){
            return new ResponseEntity(HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/usuarios/modificar/{id}")
        public ResponseEntity modificarUsuario (@PathVariable("id") Integer id, @RequestBody Usuario usuario){
            return new ResponseEntity<>(usuarioService.modificarUsuario(id, usuario), HttpStatus.OK);

        }
    }