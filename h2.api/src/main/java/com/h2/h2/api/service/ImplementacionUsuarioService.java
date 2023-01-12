package com.h2.h2.api.service;


import com.h2.h2.api.model.Usuario;
import com.h2.h2.api.respository.UsuarioRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ImplementacionUsuarioService implements UsuarioService {

    private final UsuarioRepository usuarioRepository;


    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Optional<Usuario> obtenerUsuario(Integer id) {
        return Optional.ofNullable(usuarioRepository.findById(id).orElseThrow(() -> {
            throw new RuntimeException();
        }));
    }


    //modifica el campo direccion
    @Override
    public Usuario modificarUsuario(Integer id, Usuario usuario) {
        Usuario usuario_buscado= usuarioRepository.findById(id).get();
        usuario_buscado.setDireccion(usuario.getDireccion());
         return usuarioRepository.save(usuario_buscado);
    }

    @Override
    public boolean  eliminarUsuario(Integer id) {

        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }

    }
}
