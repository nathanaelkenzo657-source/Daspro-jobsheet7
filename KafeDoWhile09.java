import java.util.Scanner;
 public class KafeDoWhile09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalHarga;
        String nama;
         
        do {
            System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            nama = sc.nextLine();

            if (nama.equalsIgnoreCase("batal")){
                System.out.println("Transaksi dibatalkan. ");
                break;
            }
            System.out.println("jumlah kopi");
            kopi = sc.nextInt();
            System.out.println("Jumlah teh");
            teh = sc.nextInt();
            System.out.println("jumlah roti");
            roti = sc.nextInt();
            
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp. "+ totalHarga);
            sc.nextInt();
         } while(true);
         System.out.println("Semua transaksi selesai. ");
         sc.close();
    }
 }