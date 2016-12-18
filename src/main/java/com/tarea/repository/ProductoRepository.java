/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea.repository;

import com.tarea.dominio.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jazmin rivera
 */
public class ProductoRepository {

    void save(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    List<Producto> getproductobyProducto(int cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public interface Productorepository extends CrudRepository<Producto, Integer> {
    @Query(value = "select * from producto where cantidad >=?1", nativeQuery=true)
	public List<Producto> getproductobyProducto(int cantidad);
        
        
    }
        
}
