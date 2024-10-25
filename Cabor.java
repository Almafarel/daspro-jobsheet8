import java.util.Scanner;
public class Cabor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String CABOR, JUMLAH_ATLET, atlet;
        int CABOR = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan nama atlet untuk cabor " + CABOR + ":");
            for (int j = 0; j < i; j++) {
                System.out.print("Atlet " + (j + 1) + ": ");
                atlet = sc.nextLine();
            }
            System.out.println(); 
        }

        System.out.println("=== Daftar Atlet Porseni Polinema ===");
        for (int i = 0; i < 5; i++) {
            System.out.println("Cabor: " + CABOR);
            for (int j = 0; j < i; j++) {
                System.out.println("- Atlet " + (j + 1) + ": " + i);
            }
            System.out.println(); // Spasi antar cabor
        }

    }
    
}
