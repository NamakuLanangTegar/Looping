import java.util.Scanner;

public class perulanganFor {
    public static void main(String[] args) {
        int nilAw, nilAk;
        String k;
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan kata katamu abangkuhhh");
        k = s.nextLine();
        System.out.println("Masukkan nilai awal: ");
        nilAw = s.nextInt();
        System.out.println("Masukkan nilai akhir: ");
        nilAk = s.nextInt();
        

        
        for (int i = nilAw; i <= nilAk; i++) {
            System.out.println(i+". "+k);
        }
        s.close();
    }
}
