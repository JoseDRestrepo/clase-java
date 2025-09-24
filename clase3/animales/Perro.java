package animales;
public class Perro extends Animal {
    //hereda de la clase Animal
    //al ser un hijo de la clase abstracta Animal debe implementar el metodo abstracto sonido()
    public Perro(String nombre, int edad, boolean macho, Vacuna vacuna) {
        super(nombre, edad, macho, vacuna);
    }

    public Perro(String nombre, int edad, boolean macho) {
        super(nombre, edad, macho, null);
    }

    @Override
    public void sonido() {
        System.out.println("woof");
    }
}

