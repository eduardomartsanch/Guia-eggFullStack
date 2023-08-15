
package Main;

import Animal.Entidad.Animal;
import Animal.Entidad.Gato;
import Animal.Entidad.Perro;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animales=new ArrayList();
        
        Animal a = new Animal();
        Animal b = new Gato();
        Animal c = new Perro();
        
        animales.add(a);
        animales.add(b);
        animales.add(c);
        
        //Ahora vamos a iterar sobre la lista Animal con un for each
        for (Animal animal : animales) {
            animal.hacerRuido();
        }
    } 
    
}
