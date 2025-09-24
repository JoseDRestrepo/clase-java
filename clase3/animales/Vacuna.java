package animales;
public class Vacuna {
    //la composicion es una relacion entre clases donde una clase contiene a otra clase como parte de su definicion
    public String nombre;
    public int añosDuracion;

    public Vacuna(String nombre, int duracion) {
        this.nombre = nombre;
        this.añosDuracion = duracion;
    }
    //la composicion es preferible a la herencia cuando una clase no es un tipo de otra clase
    //por ejemplo, un animal no es un tipo de vacuna, pero un animal puede tener una vacuna
}