import java.util.Scanner;

public class nilaiSiswa {
    public static void main(String[] args) {
        int nilAw, jumlahSiswa, nilai=0, totalNilai=0;
        double rataRata=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan jumlah siswa");
        jumlahSiswa = s.nextInt();
        
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Masukkan nilai siswa "+i);
            nilai = s.nextInt();
            totalNilai += nilai;
        }
            rataRata = totalNilai/jumlahSiswa;
            System.out.println("Total nilai: "+totalNilai);
            System.out.println("Rata-rata: "+rataRata);
        s.close();
    }
}
