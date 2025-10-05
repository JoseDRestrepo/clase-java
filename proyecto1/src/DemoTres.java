import java.util.*;
import static java.util.Collections.*;

public class DemoTres {
    public static void main(String[] args) {
        //collections
        List<String> nombres = new ArrayList<>(Arrays.asList("Luis", "Ana", "Pedro", "Alba"));
        sort(nombres);
        System.out.println(nombres);

        reverse(nombres);
        System.out.println("Reverse: " + nombres);

        shuffle(nombres);
        System.out.println("Shuffle: " + nombres);

        String min = min(nombres);
        int freq = frequency(nombres, "Ana");
        System.out.println("Min: " + min + ", freq(Ana): "+ freq);

        nombres.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
        System.out.println("Custom sort: " + nombres);

        //inmutable
        List<String> ro = unmodifiableList(nombres);
        System.out.println("RO: " + ro);
    }
}
