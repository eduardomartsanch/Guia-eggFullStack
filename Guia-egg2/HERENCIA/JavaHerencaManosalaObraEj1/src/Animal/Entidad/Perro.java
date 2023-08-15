
package Animal.Entidad;

public class Perro extends Animal implements AnimalInterface {

    @Override
    public void hacerRuido() {
        System.out.println("Guau");
        }

    @Override
    public Animal crearAnimal() {
        return new Perro();
        
    }    
}
