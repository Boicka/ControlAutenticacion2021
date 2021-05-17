/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.persistencia;

import app.modelo.Usuario;
import java.util.ArrayList;

/**
 *
 * @author joseluissuarez
 */
public class UsuarioDao {

    private ArrayList<Usuario> usuarios;

    public UsuarioDao() {
        usuarios = new ArrayList<Usuario>();
        
        Usuario u = new Usuario();
        //--------
        u.setId(1);
        u.setContrasena("123");
        u.setAlias("Luis");
        u.setNombre("Luis Pasteur");
        usuarios.add(u);
        //--------
        Usuario b = new Usuario();
        
        b.setId(2);
        b.setContrasena("abc");
        b.setAlias("Maria");
        b.setNombre("Maria Felix");
        usuarios.add(b);
        //--------
        Usuario c = new Usuario();

        c.setId(3);
        c.setContrasena("cba");
        c.setAlias("Antonio");
        c.setNombre("Antonio Lopez");
        usuarios.add(c);

    }

    /**
     * Get the value of usuarios
     *
     * @return the value of usuarios
     */
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * Set the value of usuarios
     *
     * @param usuarios new value of usuarios
     */
    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Usuario busca(String alias, String contrasena) {
        Usuario u = null;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getAlias().equals(alias)
                    && usuarios.get(i).getContrasena().equals(contrasena)) {
                u = usuarios.get(i);
                break;
            }
        }
        return u;
    }

}
