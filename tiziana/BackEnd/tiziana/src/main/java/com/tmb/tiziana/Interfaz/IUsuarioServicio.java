/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tmb.tiziana.Interfaz;

import com.tmb.tiziana.Entidad.Usuario;
import java.util.List;


public interface IUsuarioServicio {
public List <Usuario> getUsuario();
public void guardarUsuario(Usuario usuario);
public void eliminarUsuario(Long id);
public Usuario buscarUsuario(Long id);
    
}
