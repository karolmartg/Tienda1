package com.Tienda1.domain;

// Hacemos el import
import lombok.Data;

@Data
public class Cliente {
    // Ponemos los atributos
    public String nombre;
    public int edad;
    public String apellido;
    
    
    // Constructor sin datos
    public Cliente(){}
    
    // Constructor especifico 
    public Cliente(String nombre, int edad, String apellido) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
    }    
}