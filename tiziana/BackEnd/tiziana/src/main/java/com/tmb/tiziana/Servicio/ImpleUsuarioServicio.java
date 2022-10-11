/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tmb.tiziana.Servicio;

import com.tmb.tiziana.Entidad.Usuario;
import com.tmb.tiziana.Interfaz.IUsuarioServicio;
import com.tmb.tiziana.Repositorio.IUsuarioRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpleUsuarioServicio implements IUsuarioServicio {
   @Autowired IUsuarioRepo iusuariorepo;
    @Override
    public List<Usuario> getUsuario() {
        List<Usuario> usuario=iusuariorepo.findAll();
        return usuario;
    }

    @Override
    public void guardarUsuario(Usuario usuario) {
       iusuariorepo.save(usuario);
    }

    @Override
    public void eliminarUsuario(Long id) {
      iusuariorepo.deleteById(id);
    }

    @Override
    public Usuario buscarUsuario(Long id) {
        Usuario usuario = iusuariorepo.findById(id).orElse(null);
        return usuario;
    }
    
}
