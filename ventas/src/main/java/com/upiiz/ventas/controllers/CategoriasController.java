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
@RequestMapping("api/v1/categorias")
public class CategoriasController {
    //Respuesta para todas las categorias - GET
    @GetMapping
    public String listarCategorias(){
        return "Listado de todas las categorias - GET";
    }
    
    //Respuesta para una categoria por id - GET
    @GetMapping("/{id}")
    public String listarCategoria(@PathVariable int id){
        return "Obtener una categoria por id - GET " + id;
    }
    

    //Agrega una categoria -                POST
    @PostMapping
    public String agregarCategoria(@RequestBody String categoria){
        return "Agregar Categoria - POST: " + categoria;
    }
    
    //Actualizar una categoria  -           PUT
    @PutMapping("/{id}")
    public String actualizarCategoria(@PathVariable int id, @RequestBody String categoria){
        return "Actualizar Categoria - PUT: " + categoria + " con id: " + id;
    }

    //Eliminar una categora  -              DELETE
    @DeleteMapping("/{id}")
    public String eliminarCategoria(@PathVariable int id){
        return "Eliminar una Categoria - DELETE: " + id;
    }
}
