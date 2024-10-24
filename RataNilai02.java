import java.util.Scanner;
public class RataNilai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilaiMhs, totalNilai; 
        System.out.print("Masukkan input nilai ke- ");
        int inputNilai = sc.nextInt();
        for (int i = 1; i <= inputNilai; i++) {
            int total = 0;
            System.out.println("Nilai " + i + " = ");
            for (int j = 1; j < inputNilai; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilaiMhs = sc.nextInt();
                total += nilaiMhs;
                System.out.println("rataRata nilai: ");
            }
            double rataRata = (double) total / inputNilai;
            System.out.println("Rata-rata nilai " + i + ": " + rataRata);
            System.out.println();
            
        
        }
    
    }
    
}
