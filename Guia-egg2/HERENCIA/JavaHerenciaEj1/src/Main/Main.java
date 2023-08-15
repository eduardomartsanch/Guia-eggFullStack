/**/
package Main;

import entidad.Animal;
import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList();
       Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
       animales.add(perro1);
        Animal perro2 = new Perro("Teddy", "Carnivoro", 10, "Chihuahua");
       animales.add(perro2);
     Animal gato1= new Gato("Pelusa", "Galletas", 15, "Siames");  
    animales.add(gato1);
     Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
     animales.add(caballo1);
     
        for (Animal animal : animales) {
           animal.alimentarse();
        }
    }

}
