/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import enumeraciones.TipoP;
import java.util.ArrayList;

/**
 *
 * @author Facund
 */
public abstract class Edificio {
    
    protected Integer ancho;
    protected Integer largo;
    protected Integer alto;
    
    public abstract int calcularSuperficie();
    public abstract int calcularVolumen();

    public Edificio() {
    }

    public Edificio(Integer ancho, Integer largo, Integer alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Edificio{" + "ancho=" + ancho + ", largo=" + largo + ", alto=" + alto + '}';
    }
    

    
    
    
}
