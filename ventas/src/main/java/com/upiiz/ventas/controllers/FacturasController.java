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
@RequestMapping("api/v1/facturas")
public class FacturasController {
     //Respuesta para todos las facturas - GET
     @GetMapping
     public String listarFacturas(){
         return "Listado de todas las facturas - GET";
     }
     
     //Respuesta para una factura por id - GET
     @GetMapping("/{id}")
     public String listarFactura(@PathVariable int id){
         return "Obtener un factura por id - GET " + id;
     }
     
 
     //Agrega un factura -                POST
     @PostMapping
     public String agregarFactura(@RequestBody String factura){
         return "Agregar Factura - POST: " + factura;
     }
     
     //Actualizar un factura  -           PUT
     @PutMapping("/{id}")
     public String actualizarFactura(@PathVariable int id, @RequestBody String factura){
         return "Actualizar factura - PUT: " + factura + " con id: " + id;
     }
 
     //Eliminar un factura  -              DELETE
     @DeleteMapping("/{id}")
     public String eliminarFactura(@PathVariable int id){
         return "Eliminar un factura - DELETE: " + id;
     }
}
