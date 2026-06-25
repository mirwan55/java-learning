public class Inheritance {

    //Parent class
    static class Hewan{
        String nama;
        int umur;
        Hewan(String nama, int umur){
            this.nama = nama;
            this.umur = umur;
        }

        void bersuara() {
            System.out.println(nama + " bersuara...");
        }

        void info() {
            System.out.println("Nama " + nama + ", umur: " + umur);
        }
    }

    //Child class
    static class Kucing extends Hewan{
        String warna;

        Kucing(String nama, int umur, String warna) {
            super(nama, umur);
            this.warna = warna;
        }

        @Override
        void bersuara() {
            System.out.println(nama + " bersuara: Meow!");
        }
    }

    //Child class lain
    static class Anjing extends Hewan{
        Anjing(String nama, int Umur) {
            super(nama, Umur);
        }

        @Override
        void bersuara() {
            System.out.println(nama + " bersuara: Guk guk!");
        }
    }

    static void main(String[] args) {
        Kucing k = new Kucing("Kitti", 2, "Black");
        Anjing a = new Anjing("Bucks", 3);

        k.info();
        k.bersuara();

        System.out.println();

        a.info();
        a.bersuara();
    }


}