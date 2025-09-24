package animales;
public class Gato extends Animal implements Felino {
    //el gato cumple el contrato haciendo uso del metodo Cazar
    @Override
    public void Cazar() {
        System.out.println("Mató a un ratón");
    }

    public Gato(String nombre, int edad, boolean macho, Vacuna vacuna) {
        super(nombre, edad, macho, vacuna);
    }

    public Gato(String nombre, int edad, boolean macho) {
        super(nombre, edad, macho, null);
    }
    
    @Override
    public void sonido() {
        System.out.println("miau");
    }
}
