package Animal.Entidad;

public class Gato extends Animal implements AnimalInterface{

    @Override
    public void hacerRuido() {
        System.out.println("Miau");
    }

    @Override
    public Animal crearAnimal() {
        return new Gato();
        
    }   
}
