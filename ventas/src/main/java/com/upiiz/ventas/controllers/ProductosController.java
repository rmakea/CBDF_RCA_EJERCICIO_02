package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("api/v1/productos")
public class ProductosController {
    //Respuesta para todos los productos - GET
    @GetMapping
    public String listarProductos(){
        return "Listado de todas los productos - GET";
    }
    
    //Respuesta para una producto por id - GET
    @GetMapping("/{id}")
    public String listarProducto(@PathVariable int id){
        return "Obtener un producto por id - GET " + id;
    }
    

    //Agrega un producto -                POST
    @PostMapping
    public String agregarProducto(@RequestBody String producto){
        return "Agregar producto - POST: " + producto;
    }
    
    //Actualizar un producto  -           PUT
    @PutMapping("/{id}")
    public String actualizarProducto(@PathVariable int id, @RequestBody String producto){
        return "Actualizar producto - PUT: " + producto + " con id: " + id;
    }

    //Eliminar un producto  -              DELETE
    @DeleteMapping("/{id}")
    public String eliminarProducto(@PathVariable int id){
        return "Eliminar un producto - DELETE: " + id;
    }
}
