
package entidad;

import Interface.calculosFormas;

//Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
public class Rectangulo implements calculosFormas{

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    @Override
    public double calcularArea() {
        return this.base * this.altura;
         }

    @Override
    public double calcularPerimetro() {
        return (this.base + this.altura) * 2;
   }
    
}
