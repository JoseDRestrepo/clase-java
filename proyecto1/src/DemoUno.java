import java.util.*;

public class DemoUno {
    public static void main(String[] args) { //variablesnumericas
        //wrappers
        int p = 10; //valor primitivo
        Integer w = p; //trabaja con valores numericos como si fueran objetos (autoboxing: convertir primitivos a objetos)
        int q = w; //unboxing

        List<Integer> nums = Arrays.asList(1, 2, 3); //declaracion de listas
        int suma = 0;
        for (Integer n : nums) suma += n;

        Integer a = 128, b = 128;
        System.out.println(a == b); //comparaciones
        System.out.println(a.equals(b));

        int x = Integer.parseInt("42"); //parseo
        double y = Double.parseDouble("3.14");
        System.out.println("Resultado: " + (suma + x + y)); //concatenacion
    }
}
