import java.util.Scanner;
public class matakuliah05 {
    public String kode;
    public String nama;
    public int sks;
    public int JumlahJam;

    //berparameter
    public matakuliah05(String kode, String nama, int sks, int JumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.JumlahJam = JumlahJam;
    }
    //tidak berparameter
    public matakuliah05() {
      
    }

    public void tambahData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kode  : ");
        kode = input.nextLine();
        System.out.print("Nama  : ");
        nama = input.nextLine();
        System.out.print("SKS : ");
        sks = Integer.parseInt(input.nextLine());
        System.out.print("Jumlah Jam : ");
        JumlahJam = Integer.parseInt(input.nextLine());
        System.out.println("----------------------------------------");
    }   


    public void cetakInfo() {
        System.out.println("Kode  : " + kode);
        System.out.println("Nama  : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah Jam : " + JumlahJam);
        System.out.println("----------------------------------------");
    }
}
