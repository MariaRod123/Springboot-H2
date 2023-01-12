package com.h2.h2.api.service;

import com.h2.h2.api.model.Usuario;
import java.util.Optional;


public interface UsuarioService {

    // definir los metodos
    Usuario guardarUsuario(Usuario usuario);


    Optional <Usuario> obtenerUsuario(Integer id );

    Usuario modificarUsuario(Integer id, Usuario usuario);

    boolean eliminarUsuario(Integer id);


// implementacion de los mtedos va en la clase ImplementacionUsuarioService

}
