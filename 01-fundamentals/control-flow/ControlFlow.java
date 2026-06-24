public class ControlFlow {
    static void main(String[] args) {
        //IF - ELSE
        int nilai = 85;

        if (nilai >= 90) {
            System.out.println("Grade: A");
        } else if (nilai >= 80) {
            System.out.println("Grade: B");
        } else if (nilai >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        //FOR - LOOP
        System.out.println("\nHitung 1 sampai 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Angka: " + i);
        }

        //WHILE - LOOP
        System.out.println("\nHitung mundur:");
        int n = 5;
        while (n > 0) {
            System.out.println(n);
            n--;
        }
    }
}