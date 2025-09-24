import java.util.Scanner;

public class IvaPorCategoria {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Categoria: ");
        String categoria = sc.nextLine().toLowerCase();
        System.out.print("Precio base: ");
        double precio = sc.nextDouble();

        double iva = 0;
        double precioMasIva = 0;

        switch (categoria) {
            case "electronico":
                iva = 0.07;
                precioMasIva = precio * iva + precio;
                System.out.println("Precio base: " + precio + " Precio mas IVA: " + precioMasIva);
                break;
            case "alcohol":
                iva = 0.16;
                precioMasIva = precio + iva + precio;
                System.out.println("Precio base: " + precio + " Precio mas IVA: " + precioMasIva);
                break;
            case "tabaco":
                iva = 0.21;
                precioMasIva = precio + iva + precio;
                System.out.println("Precio base: " + precio + " Precio mas IVA: " +precioMasIva);
                break;
            case "juguete":
                iva = 0.04;
                precioMasIva = precio + iva + precio;
                System.out.println("Precio base: " + precio + " Precio mas IVA: " + precioMasIva);
                break;
            case "ropa":
                iva = 0.05;
                precioMasIva = precio + iva + precio;
                System.out.println("Precio base: " + precio + " Precio mas IVA: " + precioMasIva);
                break;
            case "libro":
                iva = 0.02;
                precioMasIva = precio + iva + precio;
                System.out.println("Precio base: " + precio + " Precio mas IVA: " + precioMasIva);
                break;
            case "comida":
                iva = 0.03;
                precioMasIva = precio + iva + precio;
                System.out.println("Precio base: " + precio + " Precio mas IVA: " + precioMasIva);
                break;
            default:
                System.out.println("No hay productos disponibles");
                break;
        }

        sc.close();
    }
}
