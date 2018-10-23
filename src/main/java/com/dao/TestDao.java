/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;
import com.dal.Conexion;
import com.interfaz.TestInterfaz;
import com.model.TestModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tier3
 */
public class TestDao implements TestInterfaz {

    //@Override
    public List<TestModel> GetAll() {
        try {
            
            List<TestModel> lista = null;
            Conexion objcon = new Conexion();
            Connection myCon = objcon.getConnection();
            ResultSet resultSet;
            String Query = "select * from Test";
            PreparedStatement stmt = myCon.prepareStatement(Query);
            resultSet = stmt.executeQuery(Query);
            while (resultSet.next()) {
                TestModel model = new TestModel();
                model.setId(resultSet.getInt("id"));
                model.setName(resultSet.getString("name"));
                model.setStatus(Boolean.parseBoolean(resultSet.getString("status")));                       
                lista.add(model);                
                System.out.println(" row " + resultSet.getString(1) +" "+ resultSet.getString(2) +" "+ resultSet.getString(3) );                                
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(TestDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }        
    }

    @Override
    public boolean Insert(TestModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Update(TestModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TestModel FindId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
