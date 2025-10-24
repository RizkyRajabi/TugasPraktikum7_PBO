import java.util.Scanner;

public class TokoSerbaAda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("TOKO SERBA ADA");
        System.out.println("********************");
        System.out.print("Masukkan Item Barang : ");
        int n = input.nextInt();
        
        // Deklarasi array untuk menyimpan data
        String[] kode = new String[n];
        String[] nama = new String[n];
        int[] harga = new int[n];
        int[] jumlah = new int[n];
        int[] total = new int[n];
        
        // Input data
        for (int i = 0; i < n; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode : ");
            kode[i] = input.next();
            System.out.print("Masukkan jumlah Beli : ");
            jumlah[i] = input.nextInt();
            
            // Penentuan nama dan harga berdasarkan kode
            switch (kode[i]) {
                case "a001":
                    nama[i] = "Buku";
                    harga[i] = 3000;
                    break;
                case "a002":
                    nama[i] = "Pensil";
                    harga[i] = 4000;
                    break;
                case "a003":
                    nama[i] = "Pulpen";
                    harga[i] = 5000;
                    break;
                default:
                    nama[i] = "Tidak Dikenal";
                    harga[i] = 0;
            }
            
            // Hitung total bayar tiap item
            total[i] = harga[i] * jumlah[i];
        }
        
        // Tampilkan hasil
        System.out.println();
        System.out.println("TOKO SERBA ADA");
        System.out.println("********************");
        System.out.println("No  Kode Barang  Nama Barang   Harga   Jumlah Beli   Jumlah Bayar");
        System.out.println("===============================================================");
        
        int totalBayar = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("%-3d %-12s %-12s %-8d %-12d %-10d\n", 
                    (i + 1), kode[i], nama[i], harga[i], jumlah[i], total[i]);
            totalBayar += total[i];
        }
        
        System.out.println("===============================================================");
        System.out.printf("Total Bayar\t\t\t\t\t\t %d\n", totalBayar);
        System.out.println("===============================================================");
    }
}
