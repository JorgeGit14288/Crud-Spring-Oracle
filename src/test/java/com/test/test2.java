/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.NamingException;

import com.dal.Conexion;

/**
 *
 * @author Tier3
 */
public class test2 {
    public static void main(String[] args) throws NamingException, SQLException {

        Conexion objcon = new Conexion();
        Connection myCon = objcon.getDsConnection();
        Statement stmt1;
        ResultSet rset;
        String Query = "select * from Test";
        System.out.println(Query);
        PreparedStatement stmt = myCon.prepareStatement(Query);
        rset = stmt.executeQuery(Query);
        while (rset.next()) {
            System.out.println(" row " + rset.getString(1) +" "+ rset.getString(2) +" "+ rset.getString(3) );
        }

        objcon.LimpiaConexiones();
    }
}
