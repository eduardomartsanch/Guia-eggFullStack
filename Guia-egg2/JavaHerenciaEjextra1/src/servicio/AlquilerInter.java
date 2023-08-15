
package servicio;

import entidad.Alquiler;


public interface AlquilerInter {
    public void crearAlquiler(Alquiler alquiler);
    public double calculoAlquiler(Alquiler alquiler);
    public double diasOcupacion(Alquiler alquiler);
    
}
