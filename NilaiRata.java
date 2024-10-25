import java.util.Scanner;
public class NilaiRata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilaiMhs, totalNilai=0, diatasRataRata=0, dibawahRataRata=0, jumlahSiswa=0, rataRata=0;
        double mayoritas;
        String nama_siswa;

        do {
            System.out.println("Masukkan nama siswa (ketik selesai untuk berhenti) : ");
            nama_siswa = sc.nextLine();
            if (nama_siswa.equalsIgnoreCase("selesai")) {
                System.out.println("Transaksi selesai.");
                mayoritas = jumlahSiswa/0.5;
                if(diatasRataRata>mayoritas){
                    System.out.println("Mayoritas siswa diatas rata rata");
                }else{
                    System.out.println("Mayoritas siswa dibawah rata rata");
                }
                break;
            } 

            System.out.println("Masukkan Nilai siswa : ");
            nilaiMhs = sc.nextInt();

            jumlahSiswa++;
            totalNilai += nilaiMhs;
            rataRata += totalNilai/jumlahSiswa; 

            if (nilaiMhs>=rataRata) {
                diatasRataRata++;
            }else{
                dibawahRataRata++;
            }
            
            System.out.println("Jumlah siswa diatas rata rata = "+diatasRataRata);
            System.out.println("Jumlah siswa dibawah rata rata = "+dibawahRataRata);

            sc.nextLine();
        } while (true);
    
    }
    
}
