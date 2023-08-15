//• Método get y set del atributo carga.
//• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//el atributo propio de la lavadora.
//• Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
//carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//método padre y añadir el código necesario. Recuerda que las condiciones que hemos
//visto en la clase Electrodoméstico también deben afectar al precio.
package servicio;

import entidad.Electrodomestico;
import entidad.Lavadora;

public class LavadoraServicio extends ElectrodomesticoServicio {

    public Lavadora crearLavadora() {
        Electrodomestico elec = crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora");
        int carga = leer.nextInt();
        return new Lavadora(elec.getPrecio(), elec.getColor(), elec.getConsumoEnergetico(), elec.getPeso(), carga);
    }
//ejercicio 2 y 3
    public double precioFinal(Lavadora aux) {
        super.precioFinal(aux);
        if (aux.getCarga() > 30) {
            aux.setPrecio(aux.getPrecio() + 500);
        }
        return aux.getPrecio();
    }
}
