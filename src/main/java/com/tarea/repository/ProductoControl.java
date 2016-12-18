/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea.repository;

import com.tarea.dominio.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author jazmin rivera
 */
public class ProductoControl {
        
    @Autowired
	private ProductoRepository productorepository;
    
    @RequestMapping (value= "/producto",method = RequestMethod.POST)
	    public ResponseEntity<?> crearProducto(@RequestBody Producto producto){
		productorepository.save(producto);
	        return new ResponseEntity<>(producto,HttpStatus.CREATED);
	    }
	    
	    @RequestMapping (value= "/producto/{cantidad}",method = RequestMethod.GET)
	    public ResponseEntity<?> ConsultarProducto(@PathVariable int cantidad){
	        List<Producto> producto= productorepository.getproductobyProducto(cantidad);
	        return new ResponseEntity<>(producto,HttpStatus.OK);
	    }
}
