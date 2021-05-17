/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.persistencia;

import app.modelo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author joseluissuarez
 */
public class UsuarioDaoJdb implements UsuarioDaoI {
    
    private String URL = "jdbc:derby://localhost:1527/MiEmpresa2021";
    
    private String usuarioDB = "root";
    
    private String contrasenaDB = "root";

    /**
     * Get the value of contrasenaDB
     *
     * @return the value of contrasenaDB
     */
    public String getContrasenaDB() {
        return contrasenaDB;
    }

    /**
     * Get the value of usuarioDB
     *
     * @return the value of usuarioDB
     */
    public String getUsuarioDB() {
        return usuarioDB;
    }

    /**
     * Get the value of URL
     *
     * @return the value of URL
     */
    public String getURL() {
        return URL;
    }
    
    @Override
    public Connection conectar() throws SQLException {
        Connection c = null;
        c = DriverManager.getConnection(URL, usuarioDB, contrasenaDB);
        return c;
    }
    
    @Override
    public void desconectar(Connection c) throws SQLException {
        c.close();
    }
    
    @Override
    public Usuario busca() throws SQLException {
        Usuario u = null;
        return u;
    }
    
    @Override
    public Usuario busca(String alias, String contrasena) throws SQLException {
        Usuario u = null;
        ResultSet rs;
        Statement st;
        String sql;
        Connection c;
        // Conectarse a la base de datos
        c = this.conectar();
        // Realizar la consulta
        sql = "SELECT * FROM USUARIO WHERE"
                + " alias = " + "'" + alias + "'"
                + " AND contrasena = " + "'" + contrasena + "'";
        System.out.println(sql);    //Solo para depuracion
        st = c.createStatement();
        rs = st.executeQuery(sql);

        // Contruir el objeto usuario con los datos obtenidos en la consulta
        while (rs.next()) {
            u = new Usuario();
            u.setId(rs.getInt("id"));
            u.setAlias(rs.getString("alias"));
            u.setNombre(rs.getString("nombre"));
            u.setContrasena(rs.getString("contrasena"));
        }
        this.desconectar(c);
        return u;
    }
    
    @Override
    public void agrega(Usuario u) throws SQLException {
    }
    
    @Override
    public void elimina(int id) throws SQLException {
    }
    
    @Override
    public void modifica(Usuario u) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
