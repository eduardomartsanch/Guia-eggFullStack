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
public class AnimalPerro extends Animal {
    protected Integer patas, tamanio;
    protected String nombre, raza;

    public AnimalPerro(Integer patas, Integer tamanio, String nombre, String raza, Integer cantidaddeanimales) {
        super(cantidaddeanimales);
        this.patas = patas;
        this.tamanio = tamanio;
        this.nombre = nombre;
        this.raza = raza;
    }

    public Integer getPatas() {
        return patas;
    }

    public void setPatas(Integer patas) {
        this.patas = patas;
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
        return "AnimalPerro{" + "patas=" + patas + ", tamanio=" + tamanio + ", nombre=" + nombre + ", raza=" + raza + '}';
    }


    

    
}
