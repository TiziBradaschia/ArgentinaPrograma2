/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tmb.tiziana.Controlador;

import com.tmb.tiziana.Entidad.Usuario;
import com.tmb.tiziana.Interfaz.IUsuarioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class UsuarioControlador {
    @Autowired IUsuarioServicio iusuarioServicio;
    
    @GetMapping("usuarios/traer")//se va ejecutar con la url usuarios/traer
    public List<Usuario> getUsuario() {
        return iusuarioServicio.getUsuario();
    }
      @GetMapping("usuarios/encontrar")//se va ejecutar con la url usuarios/traer
    public Usuario encontrarUsuario() {
        return iusuarioServicio.buscarUsuario((long)1);
    }
    @PostMapping("/usuarios/crear")//cuando se quiere crear en bd
    public String guardarUsuario(@RequestBody Usuario usuario){
    iusuarioServicio.guardarUsuario(usuario);
    return "Usuario dado de alta";
    }
    @DeleteMapping("/usuarios/borrar/{id}")
    public String borrarUsuario(@PathVariable Long id){
        iusuarioServicio.eliminarUsuario(id);
        return "Usuario eliminado";
    }
    @PutMapping("/usuarios/editar/{id}")
    public Usuario modificarUsuario(@PathVariable Long id,
                                    @RequestParam("nombre")String nuevoNombre, 
                                    @RequestParam("apellido")String nuevoApellido, 
                                    @RequestParam("foto")String nuevaFoto){
        Usuario usuario=iusuarioServicio.buscarUsuario(id);
        usuario.setNombre(nuevoNombre);
        usuario.setApellido(nuevoApellido);
        usuario.setFoto(nuevaFoto);
        iusuarioServicio.guardarUsuario(usuario);
        return usuario;
    }
    
}
