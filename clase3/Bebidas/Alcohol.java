package Bebidas;
public class Alcohol extends Bebida {
    //para crear un objeto con los atributos generales de otra clase + atributos especificos del nuevo objeto
    //se utiliza la herencia (extends + el nombre de la clase de la que se quiere heredar atributos)
    //ejemplo: las bebidas alcoholicas tienen un porcentaje de alcohol.
    //atributos que las distinguen de otra clase de bebidas
    //por default la variable es package, es decir, accesible solo dentro del mismo paquete
    double porcentajeAlcohol;

    //sintaxis de constructor de una clase hija
    public Alcohol(String nombre, double precio, int ml, double porcentajeAlcohol) {
        super(nombre, precio, ml); //super() invoca el constructor de la clase padre
        this.porcentajeAlcohol = porcentajeAlcohol;
    }
    
    @Override
    public void Informacion() {
        super.Informacion();
        System.out.println("Porcentaje de alcohol: " + porcentajeAlcohol + "%");
    }
}
