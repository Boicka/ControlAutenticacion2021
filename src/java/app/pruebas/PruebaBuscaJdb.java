/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.pruebas;

import app.modelo.Usuario;
import app.persistencia.UsuarioDaoJdb;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joseluissuarez
 */
public class PruebaBuscaJdb {

    public static void main(String[] args) {
        //Defunir usuario a buscar
        String alias = "boicka";
        String contrasena = "123456";
        Usuario u = null;

        //Consultar la BD
        UsuarioDaoJdb uDao = new UsuarioDaoJdb();
        try {
            //Obtener resultados
            u = uDao.busca(alias, contrasena);
        } catch (SQLException ex) {
            System.out.println("No se pudo conectar a la BD");
            System.exit(0);
        }
        if (u==null) {
            System.out.println("Usuario Inexistente !!!!");
            System.exit(0);
        } 
        System.out.println(u.getNombre());
        
    }

}
