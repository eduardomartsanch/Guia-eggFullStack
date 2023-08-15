/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Facund
 */
public final class EdificioDeOficina extends Edificio {
    
    private Integer numOficina;
    private Integer cantPers;
    private Integer numPisos;

    public EdificioDeOficina() {
    }

    public EdificioDeOficina(Integer numOficina, Integer cantPers, Integer numPisos, Integer ancho, Integer largo, Integer alto) {
        super(ancho, largo, alto);
        this.numOficina = numOficina;
        this.cantPers = cantPers;
        this.numPisos = numPisos;
    }
    
    public void cantPerso(){
                
        System.out.println("-----------------------------------");
        System.out.println("Entran " + (cantPers*numOficina) + " personas por piso.");
        System.out.println("Entran " + (cantPers*numOficina*numPisos) + " personas en todo el edificio." );
        
    }

    @Override
    public int calcularSuperficie() {
        return ancho*largo*numPisos;
    }

    @Override
    public int calcularVolumen() {
        return ancho*largo*numPisos*alto;

    }

    @Override
    public String toString() {
        return "EdificioDeOficina{" + "numero de Oficinas=" + numOficina + ", cantidad de Personas X oficina=" + cantPers + ", cantidad de Pisos=" + numPisos + '}';
    }
    
    
    
}
