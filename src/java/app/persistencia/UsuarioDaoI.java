/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.persistencia;

import app.modelo.Usuario;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author joseluissuarez
 */
public interface UsuarioDaoI {

    public Connection conectar() throws SQLException;

    public void desconectar(Connection c) throws SQLException;

    public Usuario busca() throws SQLException;

    public Usuario busca(String alias, String contrasena) throws SQLException;

    public void agrega(Usuario u) throws SQLException;

    public void elimina(int id) throws SQLException;

    public void modifica(Usuario u) throws SQLException;

}
