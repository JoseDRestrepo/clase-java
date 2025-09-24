import java.util.ArrayList;
import java.util.Scanner; //importacion de libreria para captura de datos

public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

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
        // System.out.println("EJERCICIO 1");
        // int zapatos = 350000;
        // int tennis = 280000;
        // int camisas = 175000;
        // int jeans = 200000;

        // System.out.println("====PRECIO ARTICULOS====");
        // System.out.println("Zapatos: $" + zapatos);
        // System.out.println("Tennis: $" + tennis);
        // System.out.println("Camisas: $" + camisas);
        // System.out.println("Jeans: $" + jeans);

        // int totalArticulos = zapatos + tennis + camisas + jeans;
        // int promedio = totalArticulos / 4;

        // System.out.println("TOTAL TODOS LOS ARTICULOS: $" + totalArticulos);
        // System.out.println("Precio promedio: $" + promedio);
        // double newJeans = (jeans * 6.4) / 100 + jeans;
        // double newZapatos = -(zapatos * 0.8) / 100 + zapatos;

        // System.out.println("===NUEVOS PRECIOS===");
        // System.out.println("Jeans: $" + newJeans);
        // System.out.println("Zapatos: $" + newZapatos);

        // //ejercicio 2
        // System.out.println("======================");
        // System.out.println("EJERCICIO 2");
        // System.out.print("Nombre de usuario/vivienda: ");
        // String nombreVivienda = sc.nextLine();

        // System.out.print("lectura inicial del mes (en Litros): ");
        // double lecturaInicial = sc.nextDouble();
        // System.out.print("lectura final del mes (en Litros): ");
        // double lecturaFinal = sc.nextDouble();

        // double tarifa = 0.15;
        // double consumoLitros = lecturaFinal - lecturaInicial;
        // double factura = consumoLitros * tarifa;

        // System.out.println("--- Resumen del consumo ---");
        // System.out.println("Usuario: " + nombreVivienda);
        // System.out.println("Consumo: " + consumoLitros + "lt " + "Costo total: " + factura);

        //Ej estructura if: verificar si el usuario puede ingresar
        // System.out.print("Ingrese su edad: ");
        // int age = sc.nextInt();
        // sc.nextLine(); //limpiar el buffer
        // int age_parameter = 18;
        // boolean tiene_boleta = true;

        // if (!(age < age_parameter || !tiene_boleta)) {
        //     System.out.println("Puede ingresar");
        // } else {
        //     System.out.println("No puede ingresar");
        // }

        // if (age >= age_parameter && tiene_boleta) {
        //     System.out.println("Puede ingresar");
        // } else if (age >= age_parameter && !tiene_boleta) {
        //     System.out.println("No puede ingresar");
        // } else if (age < age_parameter && tiene_boleta) {
        //     System.out.println("No puede ingresar");
        // } else {
        //     System.out.println("No puede ingresar");
        // }

        //operador ternario
        // String mensaje = age >= age_parameter ? "Eres mayor de edad" : "Eres menor de edad";
        // System.out.println(mensaje);

        // mensaje = age >= age_parameter && tiene_boleta ? "Puede ingresar";


        //if, else anidado
        // int edad = 19;
        // boolean tieneBoleta = true;
        // java.time.LocalDate fechaEvento = java.time.LocalDate.parse("2025-08-14");
        // String msg = "";

        // if (edad >= 18) {
        //     if (tieneBoleta) {
        //         if (fechaEvento.isEqual(java.time.LocalDate.now())) { //equals tmbn funca
        //             msg = "Puede ingresar";
        //         } else {
        //             msg = "No puede ingresar, el evento ya paso";
        //         }
        //     } else {
        //         msg = "No puede ingresar, no tiene boleta";
        //     }
        // } else {
        //     msg = "No puede ingresar, es menor de edad";
        // }

        // System.out.println(msg);

        //ej switch
        //sintaxis
        // switch (sc) {
        //     case value:
                
        //         break;
        
        //     default:
        //         break;
        // }

        //int dia = 3;

        // switch (dia) {
        //     case 1:
        //         System.out.println("Lunes");
        //         break;
        //     case 2:
        //         System.out.println("Martes");
        //         break;
        //     case 3:
        //         System.out.println("Miercoles");            
        //     default:
        //         System.out.println("Otro dia");
        //         break;
        // }

        //switch expressions (desde java 14)
        // String resultado = switch (dia) {
        //     case 1 -> "Lunes";
        //     case 2 -> "Martes";
        //     case 3 -> "Miercoles";
        //     default -> "otro dia";
        // };

        //Ej estructura for (con break): detiene la ejecucion del ciclo pero no del programa.
        //Solo detiene el ciclo mas cercano y se usa cuando se cumple una condicion y no desea continuar el ciclo
        //ejemplo: se busca un elemento y cuando se encuentra se desea detener el ciclo.
        //Sintaxis:
        //for (int i = 0; i < 5; i++) {
        //if (i==3) {
        //  break;
        //}
        //System.out.println("Iteracion: " + i);
        //}

        // int[] numeros = {1,2,3,4,5};
        // int numeroBuscado = 3;
        // boolean encontrado = false;

        // for (int i = 0; i < numeros.length; i++) {
        //     if (numeros[i] == numeroBuscado) {
        //         encontrado = true;
        //         break;
        //     }
        // }
        // if (encontrado) {
        //     System.out.println("Numero encontrado");
        // } else {
        //     System.out.println("Numero no encontrado");
        // }

        //ej estructura repetitiva for con continue: detiene una iteracion y continua con otra
        //sintaxis:
        // for (int i = 0; i<5; i++) {
        //     if (i == 3) {
        //         continue;
        //     }
        //     System.out.println("Iteracion" + i);
        // }
        //omitir un elemento de un arreglo:
        // int numeros[] = {1, 2, 3, 4, 5};
        // int numeroOmitido = 3;
        // for (int i = 0; i < numeros.length; i++) {
        //     if (numeros[i] == numeroOmitido) {
        //         continue;
        //     }
        //     System.out.println("Numero: " + numeros[i]);
        // }
    
        // String[] comportamiento = {"Disciplinado", "Serio", "Indisciplinado", "Juicioso", "Amable"};
        // String comportamientoOmitido = "Indisciplinado";

        // for (int i = 0; i < comportamiento.length; i++) {
        //     if (comportamiento[i].equals(comportamientoOmitido)) {
        //         continue;
        //     }
        //     System.out.println("Comportamiento: " + comportamiento[i]);
        // }

        //while con break y continue
        // int i = 0;
        // while (comportamiento[i] != comportamientoOmitido) {
        //     i = i + 1;
        //     System.out.println(comportamiento[i]);
        //     break;
        // }

        // while (comportamiento[i] != comportamientoOmitido) {
        //     i = i + 1;
        //     System.out.println(comportamiento[i]);
        //     continue;
        // }

        //foreach: recorre arrays sin un indice explicito
        //Sintaxis
        // for (tipoElemento variable : coleccion) {
        // instrucciones
        // }

        // String[] frutas = {"Manzanas", "Banano", "Pera"};
        // for (String fruta : frutas) {
        //     System.out.println(fruta);
        // }

        // ArrayList<String> colores = new ArrayList<>();
        // colores.add("Rojo");        
        // colores.add("Verde");
        // colores.add("Azul");
        // for (String color : colores) {
        //     System.out.println(color);
        // }

        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banano");
        frutas.add("Pera");

        //alternativa con foreach
        frutas.forEach(f -> System.out.println("-> " + f));

        sc.close(); //cerrar la libreria    
    }
}
