import java.util.*;

public class DemoDos {
    public static void main(String[] args){
        //estructuras de colecciones

        //ArrayList: acceso mediante indice
        List<String> a = new ArrayList<>();
        a.add("A"); a.add("C"); a.add(1, "B");
        System.out.println("ArrayList: " + a);

        //LinkedList: acceso secuencial
        Deque<String> dq = new LinkedList<>();
        dq.addFirst("B"); dq.addLast("C"); dq.addFirst("A");
        System.out.println("LinkedList/deque: " + dq);
        System.out.println("Pop: " + dq.removeFirst());

        //hashset: no permite duplicados
        Set<String> set = new HashSet<>(Arrays.asList("rojo", "verde", "rojo", "azul"));
        System.out.println("Hashset: " + set);

        //TreeSet: no permite duplicados y los ordena
        Set<String> orden = new TreeSet<>(Arrays.asList("z", "b", "a", "c"));
        System.out.println("TreeSet: " + orden);

        //HashMap: almacena en clave-valor
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Ana", 28);
        edades.put("Luis", 35);
        edades.put("Ana", 29);
        System.out.println("HashMap: " + edades);

        //TreeMap: clave-valor ordenado
        Map<String, Integer> puntuacion = new TreeMap<>();
        puntuacion.put("Mar", 80);
        puntuacion.put("Alba", 95);
        puntuacion.put("Zoe", 77);
        System.out.println("Treemap: " + puntuacion);
        System.out.println("Primero: " + ((TreeMap<String, Integer>) puntuacion).firstEntry());
    }
}
