public class Encapsulation {

    static class Mahasiswa {
        //Private tidak bisa diakses langsung dari luar
        private String nama;
        private int nim;
        private double ipk;

        //Constructor
        Mahasiswa(String nama, int nim, double ipk) {
            this.nama = nama;
            this.nim = nim;
            this.ipk = ipk;
        }

        //Getter
        String getNama() {
            return nama;
        }

        int getNIM() {
            return nim;
        }

        double getIpk() {
            return ipk;
        }

        //Setter dengan validasi
        void setIpk(double ipk) {
            if (ipk >= 0 && ipk <= 4.0) {
                this.ipk = ipk;
            } else {
                System.out.println("IPK tidak valid");
            }
        }

        void info() {
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
            System.out.println("IPK: " + ipk);
        }
    }

    static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Andi", 1234, 3.99);
        mhs.info();

        System.out.println("\nUpdate IPK: ");
        mhs.setIpk(4.0);
        System.out.println("IPK baru: " + mhs.getIpk());

        System.out.println("\nCoba IPK tidak valid: ");
        mhs.setIpk(5.0);
    }

}