/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.pruebas;

import app.modelo.Usuario;
import app.persistencia.UsuarioDao;

/**
 *
 * @author joseluissuarez
 */
public class PruebaBuscaUsuario {

    public static void main(String[] args) {
        Usuario u;
        UsuarioDao uDao = new UsuarioDao();
        u = uDao.busca("Ramon", "zzzzz");
        if (u==null) {
            System.out.println("Usuario Inexistente");
        } else {
            System.out.println("Usuario encontrado: nombre = "+u.getNombre());
            
        }
        u = uDao.busca("Luis", "123");
       if (u==null) {
            System.out.println("Usuario Inexistente");
        } else {
            System.out.println("Usuario encontrado: nombre = "+u.getNombre());
            
        } 
 
    }

}
