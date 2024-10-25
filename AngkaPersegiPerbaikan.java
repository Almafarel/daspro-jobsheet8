import java.util.Scanner;
public class AngkaPersegi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan ukuran persegi (minimal 3): ");
        int ukuran = sc.nextInt();

        if (ukuran < 3) {
            System.out.println("Ukuran minimal adalah 3. Menggunakan ukuran 3 secara otomatis.");
            ukuran = 3;
        }
        for (int i = 0; i < ukuran; i++) {
            for (int j = 0; j < ukuran; j++) {
                if (i == 0 || i == ukuran - 1 || j == 0 || j == ukuran - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println(); 
        }

    }
}