/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author Tier3
 */
public class Conexion {       
    
   static Connection Conn_Test = null;
    public String atrError = "";

    public String codigo = "";
    public String mensaje = "";
    
    // conexion con querystring
    public  Connection getConnection(){
        try {
            Connection conn;  
             conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "rob", "rob");
            System.out.println("Conexion local exitosa");
            return conn;
        } catch (SQLException e) {
            System.out.println(" localhost Error de SQL al conectar" + e.getMessage());
             return null;
        }        
    }
    
    //conexion con ds
    public  Connection getDsConnection() throws SQLException{
             try {
            Context cxt = new InitialContext();
            DataSource ds = (DataSource) cxt.lookup("java:TestDs");
            this.Conn_Test = ds.getConnection();
            return this.Conn_Test;
        } catch (NamingException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     /*21/03/2017 Metodo limpiar conexiones agregado por oulloa@tigo.com.gt */
    public void LimpiaConexiones() {
        try {
            if (!this.Conn_Test.isClosed()) {
                this.Conn_Test.close();
            }
        } catch (Exception ex) {
            this.Conn_Test = null;
            ex.getMessage();
        }
    }
}
