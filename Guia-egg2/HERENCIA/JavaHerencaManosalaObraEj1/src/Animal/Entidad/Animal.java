/*Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();*/

package Animal.Entidad;


public class Animal implements AnimalInterface {
    
    public void hacerRuido(){
        System.out.println("Hola");
        
        
    }

    @Override
    public Animal crearAnimal() {
        return new Animal();
    }
    
}
