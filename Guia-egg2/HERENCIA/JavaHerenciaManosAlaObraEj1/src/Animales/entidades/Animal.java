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
public class Animal {
    protected Integer cantidaddeanimales;

    public Animal(Integer cantidaddeanimales) {
        this.cantidaddeanimales = cantidaddeanimales;
    }

    public Integer getCantidaddeanimales() {
        return cantidaddeanimales;
    }

    public void setCantidaddeanimales(Integer cantidaddeanimales) {
        this.cantidaddeanimales = cantidaddeanimales;
    }
    
    
}
