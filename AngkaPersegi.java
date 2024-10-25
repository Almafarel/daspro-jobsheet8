import java.util.Scanner;
public class AngkaPersegi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        while (N < 3) {
            System.out.println("Nilai N harus minimal 3.");
            return;
        }

        for (int i = 0; i < N; i++) {
            // Loop kolom
            for (int j = 0; j < N; j++) {
                // Gunakan angka untuk menentukan apakah di pinggir atau di dalam
                int edgeCheck = i * (N - 1 - i) * j * (N - 1 - j);

                // Jika hasil perkalian bernilai 0, berarti di pinggir
                if (edgeCheck == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
    }
}