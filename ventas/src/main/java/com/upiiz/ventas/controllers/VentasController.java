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
@RequestMapping("api/v1/ventas")
public class VentasController {
    //Respuesta para todas las ventas - GET
    @GetMapping
    public String listarVentas(){
        return "Listado de todas las ventaes - GET";
    }
    
    //Respuesta para una venta por id - GET
    @GetMapping("/{id}")
    public String listarVenta(@PathVariable int id){
        return "Obtener una venta por id - GET " + id;
    }
    

    //Agrega una venta -                POST
    @PostMapping
    public String agregarVenta(@RequestBody String venta){
        return "Agregar venta - POST: " + venta;
    }
    
    //Actualizar una venta  -           PUT
    @PutMapping("/{id}")
    public String actualizarVenta(@PathVariable int id, @RequestBody String venta){
        return "Actualizar venta - PUT: " + venta + " con id: " + id;
    }

    //Eliminar una venta  -              DELETE
    @DeleteMapping("/{id}")
    public String eliminarVenta(@PathVariable int id){
        return "Eliminar una venta - DELETE: " + id;
    }
}
