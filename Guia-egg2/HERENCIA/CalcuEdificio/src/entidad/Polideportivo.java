/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import enumeraciones.TipoP;

/**
 *
 * @author Facund
 */
public final class Polideportivo extends Edificio {
    
    private String nombre;
    private TipoP tipo;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, TipoP tipo, Integer ancho, Integer largo, Integer alto) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoP getTipo() {
        return tipo;
    }

    public void setTipo(TipoP tipo) {
        this.tipo = tipo;
    }
    
    
      
  

    @Override
    public int calcularSuperficie() {
        return ancho*largo;
    }

    @Override
    public int calcularVolumen() {
        return ancho*largo*alto;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", tipo=" + tipo + '}';
    }
    
    
    
    
    
    
    
}
