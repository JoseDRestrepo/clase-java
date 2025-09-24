package Bebidas;
public class Bebida {
    //en la herencia la clase padre establece atributos y metodos generales, pero esta clase puede 
    //ser poco flexible a la hora de crear objetos, por lo que luego se usa la herencia para solucionar esto
    public String nombre;
    public double precio;
    public int ml;
    
    public Bebida(String nombre, double precio, int ml) {
        this.nombre = nombre;
        this.precio = precio;
        this.ml = ml;
    }
    public void Informacion() {
        System.out.println("Nombre: " + nombre);
        System.out.printf("Precio: $%,.0f%n", precio);
        System.out.println("Contenido: " + ml + "ml");
    }
}
