import java.util.Scanner; //importacion de libreria para captura de datos

public class Main {
    public static void main(String[] args) {
        //impresion
        System.out.println("Hola, mundo!"); //salto de linea
        /* System.out.print("Otro sakudo"); //compila
        System.out.println("programación java"); */

        //manejo de variables
/*         int edad = 25;
        System.out.println("La edad es: " + edad);
        double precio = 99.99;
        char inicial = 'J';
        boolean esMayor = true;
        String nombre = "Juan";

        String mensaje = String.format("%n tiene %e años", nombre, edad); //concatenacion
        System.out.println(mensaje);

        int n1 = 10;
        int n2 = 15;

        int resultado = n1 + n2; 
        System.out.println("El resultado es: " + resultado); */

        //uso de scanner para capturar datos desde consola
        java.util.Scanner sc = new java.util.Scanner(System.in);

        //captura de un string
        /* System.out.print("Escriba su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Nombre: " + nombre);

        //captura de un entero
        System.out.print("Su edad: ");
        int edad = sc.nextInt();
        System.out.println("Edad: " + edad);

        //de un decimal
        System.out.print("Su altura: ");
        double altura = sc.nextDouble();
        System.out.println("Su altura: " + altura);

        //de un caracter
        System.out.print("Escriba su inicial: ");
        char inicial = sc.next().charAt(0);
        System.out.println("Su inicial: " + inicial);

        //de un booleano
        System.out.print("Es estudiante? (true/false): ");
        boolean esEstudiante = sc.nextBoolean();
        System.out.println("Es estudiante?: " + esEstudiante); */

        //precaucion con nextLine despues de nextInt o nextDouble
        //cuando se usa nextInt o nextDouble queda un salto de linea en el buffer
        //lo que puede causar que nextLine se salte la entrada del usuario, para evitarlo:
        //usa scanner.nextLine(); despues de nextInt o nextDouble

        /* System.out.print("Escriba su nombre: ");
        String name = sc.nextLine();

        System.out.print("Su edad: ");
        int age = sc.nextInt(); 
        scanner.nextLine();*/

        //ejercicio 1
        System.out.println("EJERCICIO 1");
        int zapatos = 350000;
        int tennis = 280000;
        int camisas = 175000;
        int jeans = 200000;

        System.out.println("====PRECIO ARTICULOS====");
        System.out.println("Zapatos: $" + zapatos);
        System.out.println("Tennis: $" + tennis);
        System.out.println("Camisas: $" + camisas);
        System.out.println("Jeans: $" + jeans);

        int totalArticulos = zapatos + tennis + camisas + jeans;
        int promedio = totalArticulos / 4;

        System.out.println("TOTAL TODOS LOS ARTICULOS: $" + totalArticulos);
        System.out.println("Precio promedio: $" + promedio);
        double newJeans = (jeans * 6.4) / 100 + jeans;
        double newZapatos = -(zapatos * 0.8) / 100 + zapatos;

        System.out.println("===NUEVOS PRECIOS===");
        System.out.println("Jeans: $" + newJeans);
        System.out.println("Zapatos: $" + newZapatos);

        //ejercicio 2
        System.out.println("======================");
        System.out.println("EJERCICIO 2");
        System.out.print("Nombre de usuario/vivienda: ");
        String nombreVivienda = sc.nextLine();

        System.out.print("lectura inicial del mes (en Litros): ");
        double lecturaInicial = sc.nextDouble();
        System.out.print("lectura final del mes (en Litros): ");
        double lecturaFinal = sc.nextDouble();

        double tarifa = 0.15;
        double consumoLitros = lecturaFinal - lecturaInicial;
        double factura = consumoLitros * tarifa;

        System.out.println("--- Resumen del consumo ---");
        System.out.println("Usuario: " + nombreVivienda);
        System.out.println("Consumo: " + consumoLitros + "lt " + "Costo total: " + factura);

        sc.close(); //cerrar la libreria 
    }
}
