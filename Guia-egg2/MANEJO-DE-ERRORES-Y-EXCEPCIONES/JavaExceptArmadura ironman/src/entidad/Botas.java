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
public class Botas extends Armadura{
protected Integer consumo;
    public Botas() {
    }

    public Botas(Integer salud, Integer resistencia, Integer energia, String Material, Integer consumoEnergetico, Integer tiempo) {
        super(salud, resistencia, energia, Material, consumoEnergetico, tiempo);
    }

    public Integer getConsumo() {
        return consumo;
    }

    public void setConsumo(Integer consumo) {
        this.consumo = consumo;
    }

    public Integer getSalud() {
        return salud;
    }

    public void setSalud(Integer salud) {
        this.salud = salud;
    }

    public Integer getResistencia() {
        return resistencia;
    }

    public void setResistencia(Integer resistencia) {
        this.resistencia = resistencia;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public Integer getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Integer consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }
    
}
