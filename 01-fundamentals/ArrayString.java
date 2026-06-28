public class ArrayString {

    public static void main(String[] args) {

        // ARRAY
        int[] angka = {10, 20, 30, 40, 50};

        System.out.println("=== ARRAY ===");
        System.out.println("Elemen pertama: " + angka[0]);
        System.out.println("Elemen terakhir: " + angka[4]);
        System.out.println("Panjang array: " + angka.length);

        System.out.println("Semua elemen:");
        for (int a : angka) {
            System.out.println("- " + a);
        }

        // STRING
        System.out.println("\n=== STRING ===");
        String nama = "Andi Budi";

        System.out.println("Nama: " + nama);
        System.out.println("Panjang: " + nama.length());
        System.out.println("Huruf besar: " + nama.toUpperCase());
        System.out.println("Huruf kecil: " + nama.toLowerCase());
        System.out.println("Mengandung 'Andi': " + nama.contains("Andi"));
        System.out.println("Substring: " + nama.substring(0, 6));
    }
}