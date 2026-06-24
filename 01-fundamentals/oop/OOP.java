public class OOP {
    //Atribut
    String nama;
    int umur;
    String pekerjaan;

    //Constructor
    OOP(String nama, int umur, String pekerjaan) {
        this.nama = nama;
        this.umur = umur;
        this.pekerjaan = pekerjaan;
    }

    //Method
    void perkenalan() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Pekerjaan: " + pekerjaan);
    }

    static void main(String[] args) {
        //Buat object dari class OOP
        OOP orang1 = new OOP("Andi", 10, "FootballPlayer");
        OOP orang2 = new OOP("Beni", 35, "Dokter Bedah");

        System.out.println("=== Orang 1 ===");
        orang1.perkenalan();

        System.out.println("=== Orang 2 ===");
        orang2.perkenalan();
    }
}