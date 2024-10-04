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
@RequestMapping("api/v1/clientes")
public class ClientesController {
     //Respuesta para todos los clientes - GET
     @GetMapping
     public String listarClientes(){
         return "Listado de todas las clientes - GET";
     }
     
     //Respuesta para una cliente por id - GET
     @GetMapping("/{id}")
     public String listarCliente(@PathVariable int id){
         return "Obtener un cliente por id - GET " + id;
     }
     
 
     //Agrega un cliente -                POST
     @PostMapping
     public String agregarCliente(@RequestBody String cliente){
         return "Agregar cliente - POST: " + cliente;
     }
     
     //Actualizar un cliente  -           PUT
     @PutMapping("/{id}")
     public String actualizarCliente(@PathVariable int id, @RequestBody String cliente){
         return "Actualizar cliente - PUT: " + cliente + " con id: " + id;
     }
 
     //Eliminar un cliente  -              DELETE
     @DeleteMapping("/{id}")
     public String eliminarCliente(@PathVariable int id){
         return "Eliminar un cliente - DELETE: " + id;
     }

    @GetMapping("/{id}/facturas")
    public String listarFacturas(@PathVariable int id) {
        return "Obtener todas las facturas del cliente con id: " + id;
    }

    @GetMapping("/{id}/facturas/{idFactura}")
    public String listarFacturas(@PathVariable int id, @PathVariable int idFactura) {
        return "Obtener la factura con id: " + idFactura + " del cliente id: " + id;
    }
}
