import java.util.Scanner;
public class Cabor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah atlet: ");
        int jumlahAtlet = sc.nextInt();
        sc.nextLine(); 
        String[] namaAtlet = new String[jumlahAtlet];
        String[] cabangOlahraga = new String[jumlahAtlet];

        int i = 0;

        while (i < jumlahAtlet) {
            System.out.println("Atlet ke-" + (i + 1) + ":");
            System.out.print("Masukkan nama atlet: ");
            namaAtlet[i] = sc.nextLine();

            String olahraga;
            while (true) {
                System.out.print("Masukkan cabang olahraga (tenis meja, bola basket, volly, badminton): ");
                olahraga = sc.nextLine().toLowerCase();

                if (olahraga.equals("tenis meja") || olahraga.equals("bola basket") ||
                    olahraga.equals("volly") || olahraga.equals("badminton")) {
                    cabangOlahraga[i] = olahraga;
                    break; 
                } else {
                    System.out.println("Cabang olahraga tidak valid. Coba lagi.");
                }
            }

            i++;
        }

        System.out.println("\n=== PORSENI POLINEMA ===");
        for (int j = 0; j < jumlahAtlet; j++) {
            System.out.println("Atlet ke-" + (j + 1) + ": " + namaAtlet[j] + " - " + cabangOlahraga[j]);
        }

    }
}