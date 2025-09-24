package animales;
public abstract class Animal {
    //para crear una clase abstracta se usa la palabra clave abstract
    //una clase abstracta no puede ser instanciada, es decir, no se pueden crear objetos de esa clase
    public String nombre;
    public int edad;
    public boolean macho;

    private Vacuna _vacuna;
    //composicion: una clase puede tener atributos que son objetos de otras clases
    //en este caso, un animal puede tener una vacuna

    //un metodo abstracto es un metodo que no tiene cuerpo, es decir, no tiene implementacion
    //una clase que contiene al menos un metodo abstracto debe ser declarada como abstracta
    public abstract void sonido();

    public Animal(String nombre, int edad, boolean macho, Vacuna vacuna) {
        this.nombre = nombre;
        this.edad = edad;
        this.macho = macho;
        this._vacuna = vacuna;
    }

    //constructor sobrecargado sin vacuna
    public Animal(String nombre, int edad, boolean macho) {
        this(nombre, edad, macho, null);
    }

    public void informacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        if (macho) {
            System.out.println("Es macho");
        } else {
            System.out.println("Es hembra");
        }
        if (_vacuna != null) {
            System.out.println("Vacuna: " + _vacuna.nombre + ". Duracion: " + _vacuna.añosDuracion + " años");
        } else {
            System.out.println("No tiene vacuna");
        }
    }

    public void setVacuna(Vacuna vacuna) {
        this._vacuna = vacuna;
    }
}
