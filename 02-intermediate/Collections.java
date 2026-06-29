import java.util.ArrayList;
import java.util.HashMap;

public class Collections {

    static void main(String[] args) {

        // ARRAYLIST - seperti array tapi dinamis
        System.out.println("=== ARRAYLIST ===");
        ArrayList<String> buah = new ArrayList<>();
        buah.add("Apel");
        buah.add("Belimbing");
        buah.add("Chery");
        buah.add("Duku");
        buah.add("Jeruk");

        System.out.println("Semua buah: " + buah);
        System.out.println("Jumlah: " + buah.size());
        System.out.println("Elemen ke 2: " + buah.get(1));

        buah.remove("Chery");
        System.out.println("Setelah hapus Chery: " + buah);

        // HASHMAP - key-value pair
        System.out.println("=== HASHMAP ===");
        HashMap<String, int[] > nilai = new HashMap<>();
        nilai.put("Andi", new int[]{90, 92, 89});
        nilai.put("Budi", new int[]{75, 80, 78});
        nilai.put("Cyndi", new int[]{88, 91, 85});

        for (String nama : nilai.keySet()) {
            int[] n = nilai.get(nama);
            System.out.println(nama + ": " + n[0] + "," + n[1] + ", " + n[2]);
        }
    }
}