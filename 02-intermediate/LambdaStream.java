import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaStream {

    static void main(String[] args) {
        List<Integer> angka = new ArrayList<>();
        angka.add(5);
        angka.add(12);
        angka.add(3);
        angka.add(18);
        angka.add(7);
        angka.add(25);

        // Lambda - forEach
        System.out.println("=== SEMUA ANGKA ===");
        angka.forEach(System.out::println);

        // Stream - filter angka > 10
        System.out.println("\n=== ANGKA > 10 ===");
        List<Integer> besar = angka.stream()
                .filter(n -> n > 10)
                .collect(Collectors.toList());
        System.out.println(besar);

        // Stream - kalikan 2
        System.out.println("\n=== DIKALI 2 ===");
        List<Integer> kali2 = angka.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(kali2);

        // Stream - jumlahkan semua
        System.out.println("\n=== TOTAL ===");
        int total = angka.stream()
                .reduce(0, (a,b) -> a+b);
        System.out.println("Total: " + total);
    }
}