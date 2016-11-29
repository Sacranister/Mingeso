/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.Producto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alexis
 */
public class ProductoServiceTest {
    
    public ProductoServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findAll method, of class ProductoService.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        ProductoService instance = new ProductoService();
        List<Producto> expResult = null;
        List<Producto> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class ProductoService.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Integer id = null;
        ProductoService instance = new ProductoService();
        Producto expResult = null;
        Producto result = instance.find(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class ProductoService.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Producto entity = null;
        ProductoService instance = new ProductoService();
        instance.create(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class ProductoService.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Integer id = null;
        Producto entity = null;
        ProductoService instance = new ProductoService();
        instance.edit(id, entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
