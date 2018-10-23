/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interfaz;
import com.model.TestModel;
import java.util.List;

/**
 *
 * @author Tier3
 */
public interface TestInterfaz {
    
     List<TestModel> GetAll();
     boolean Insert(TestModel model);
     boolean Update(TestModel model);
     boolean Delete(int id);
     TestModel FindId(int id);
    
}
