/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Dell
 */
public class Sintetizador extends Armadura {

    public Sintetizador() {
    }

    public Sintetizador(Integer salud, Integer resistencia, Integer energia, String Material, Integer consumoEnergetico, Integer tiempo) {
        super(salud, resistencia, energia, Material, consumoEnergetico, tiempo);
    }
    
}
