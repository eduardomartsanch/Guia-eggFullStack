/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animales.entidades;

/**
 *
 * @author Dell
 */
public class AnimalGato extends Animal {
     protected Integer patasgatunas, tamanio;
    protected String nombre, raza;

    public AnimalGato(Integer patasgatunas, Integer tamanio, String nombre, String raza, Integer cantidaddeanimales) {
        super(cantidaddeanimales);
        this.patasgatunas = patasgatunas;
        this.tamanio = tamanio;
        this.nombre = nombre;
        this.raza = raza;
    }

    public Integer getPatasgatunas() {
        return patasgatunas;
    }

    public void setPatasgatunas(Integer patasgatunas) {
        this.patasgatunas = patasgatunas;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "AnimalGato{" + "patasgatunas=" + patasgatunas + ", tamanio=" + tamanio + ", nombre=" + nombre + ", raza=" + raza + '}';
    }

    

    
    
    
}
