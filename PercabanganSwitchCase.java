import java.util.Scanner;

public class PercabanganSwitchCase {
    public static void main(String[] args) {
        int pilihan, jumlahBeli;
        double harga, totalHarga =0;
    
        Scanner s = new Scanner(System.in);
        System.out.println("=+= List Menu =+=");
        System.out.println("1. Ayam Goreng\n2. Ayam Geprek\n3. Ayam Bakar");
        System.out.println("Masukkan Pilihan Menu: ");
        pilihan = s.nextInt();

        switch (pilihan) {
            case 1:
                harga = 15000;
                break;
            case 2:
                harga = 13000;
                break;
            case 3:
                harga = 16000;
                break;

            default:
                harga = 0;
                System.out.println("Inputan salah!");
                
            }
            System.out.println("Jumlah yang dibeli: ");
            jumlahBeli = s.nextInt();
            totalHarga = harga*jumlahBeli;
            System.out.println("Total yang harus dibayarkann adalah: "+totalHarga);
            s.close();
    }
}
