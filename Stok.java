import java.util.Scanner;
public class Stok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahStok=0; 
        double totalStok=0;
        String ulangi; 

        do {

            System.out.print("Masukkan nama barang: ");
            String namaBarang = sc.nextLine();

            System.out.print("Masukkan jumlah unit untuk " + namaBarang + ": ");
            int jumlahUnit = sc.nextInt();

            System.out.print("Masukkan harga per unit untuk " + namaBarang + ": ");
            double hargaPerUnit = sc.nextDouble();

            double stokBarang = jumlahUnit * hargaPerUnit;
            System.out.println("Total stok untuk " + namaBarang + ": Rp" + stokBarang);

            totalStok += stokBarang;
            sc.nextLine(); 

            System.out.print("Apakah Anda ingin memasukkan barang lain? (ya/tidak): ");
            ulangi = sc.nextLine().toLowerCase();
        } while (ulangi.equals("ya"));

        System.out.println("Total stok keseluruhan: Rp" + totalStok);
       
    }

}
