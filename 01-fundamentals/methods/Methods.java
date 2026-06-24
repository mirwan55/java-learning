public class Methods {
        //Method tanpa return value
        static void Sapa(String nama) {
            System.out.println("Halo, " + nama + "!");
        }

        //Method dengan return value
        static int tambah(int a, int b) {
            return a + b;
        }

        //Method dengan return value desimal
        static double luasLingkaran(double radius) {
            return 3.14 * radius * radius;
        }

        static void main(String[] args) {
            //Panggil method
            Sapa(" Andi");

            int hasil = tambah(10, 5);
            System.out.println("10 + 5 = " + hasil);

            double luasLingkaran = luasLingkaran(21);
            System.out.println("Luas Lingkaran r=21: " + luasLingkaran);

    }
}