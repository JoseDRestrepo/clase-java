package Main;

import java.util.Scanner;

import operaciones.OperacionesAritmeticas;

import Personas.Empleado;
import Personas.Persona;

import animales.Animal;
import animales.Perro;
import animales.Gato;
import animales.Vacuna;

import Bebidas.Bebida;
import Bebidas.Alcohol;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("----------------------------");

        // System.out.print("Nombre persona: ");
        // String nombrePersona = sc.nextLine();
        // System.out.print("Edad persona: ");
        // int edadPersona = sc.nextInt();
        // sc.nextLine();

        Persona personaA = new Persona("", 0);
        personaA.setEdad(22); //poniendo datos de manera controlada mediante un setter
        personaA.setNombre("Pedro"); 

        String nombre = personaA.getNombre(); //acceso a datos privados mediante un getter

        System.out.println("Nombre: " + nombre + ". Edad: " + personaA.edad);
        // edad es public, se puede acceder directamente

        System.out.println("----------------------------");

        Persona empleadoA = new Empleado("", 0, false, 1700000);
        empleadoA.setNombre("Eric Garcia"); 
        empleadoA.setEdad(21);
        empleadoA.MostrarInformacion();

        System.out.println("----------------------------");

        //metodos sobrecargados
        OperacionesAritmeticas op1 = new OperacionesAritmeticas();
        int resultado1 = op1.Sumar(5, 10);
        System.out.println("Resultado suma1: " + resultado1);

        OperacionesAritmeticas op2 = new OperacionesAritmeticas();
        double resultado2 = op2.Sumar(5.4, 10.3);
        System.out.println("Resultado suma2: " + resultado2);

        OperacionesAritmeticas op3 = new OperacionesAritmeticas();
        int resultado3 = op3.Sumar(5, 10, 15);
        System.out.println("Resultado suma3: " + resultado3);
        

        System.out.println("----------------------------");

        //upcasting es instanciar una clase hija como una clase padre
        Persona empleadoB = new Empleado("Pedro", 32, false, 2000000);
        empleadoB.MostrarInformacion();

        System.out.println("----------------------------");

        Vacuna antirrabica = new Vacuna("Antirrabica", 3);
        
        Animal firulais = new Perro("firulais", 3, true, antirrabica);
        firulais.sonido();
        firulais.informacion();

        System.out.println("----------------------------");

        Gato isis = new Gato("isis", 2, false);
        isis.Acicalar();
        isis.sonido();
        isis.informacion();
        isis.Cazar();

        System.out.println("----------------------------");

        Bebida limonada = new Bebida("Limonada", 2500, 500);
        limonada.Informacion();

        System.out.println("----------------------------");

        Bebida cerveza = new Alcohol("Cerveza", 3800, 330, 4.5);
        cerveza.Informacion();

        System.out.println("----------------------------");

        sc.close();
    }
}
