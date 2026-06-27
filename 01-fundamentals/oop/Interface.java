public class Interface {

    //Abstract Class
    static abstract class Kendaraan {
        String merk;

        Kendaraan(String merk) {
            this.merk = merk;
        }

        //Abstract method - wajib diimplementasi child class
        abstract void bergerak();

        //Method biasa
        void info() {
            System.out.println("Merk: " + merk);
        }
    }

    //Interface
    interface BisaMengisi {
        void isiBahan();
    }

    //Child class implements abstract class + interface
    static class Mobil extends Kendaraan implements BisaMengisi {
        Mobil(String merk) {
            super(merk);
        }

        @Override
        public void bergerak() {
            System.out.println(merk + " melaju di jalan raya!");
        }

        @Override
        public void isiBahan() {
            System.out.println(merk + " mengisi bahan bahar di SPBU");
        }
    }

    static class Sepeda extends Kendaraan {
        Sepeda(String merk) {
            super(merk);
        }

        @Override
        public void bergerak() {
            System.out.println(merk + " di kayuh di Jalan!");
        }
    }

    static void main(String[] args) {
        Mobil m = new Mobil("Astra");
        m.info();
        m.bergerak();
        m.isiBahan();

        System.out.println();

        Sepeda s = new Sepeda("United");
        s.info();
        s.bergerak();
    }
}