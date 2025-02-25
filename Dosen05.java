import java.util.Scanner;
public class Dosen05 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    public Dosen05() {
    }

    //tambah data dosen
    public void tambahData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode dosen: ");
        kode = input.nextLine();
        System.out.print("Masukkan nama dosen: ");
        nama = input.nextLine();
        System.out.print("Masukkan jenis kelamin dosen (laki/perempuan): ");
        String gender = input.nextLine();

        if (gender.equals("laki")) {
            jenisKelamin = true;
        } else if (gender.equals("perempuan")) {
            jenisKelamin = false;
        } else {
           System.out.println("input tidak valid");
        }
            
        
        System.out.print("Masukkan usia dosen: ");
        usia = input.nextInt();
        System.out.println("-----------------------------");
    }

    //tampilkan data dosen
    public void tampilData() {
        System.out.println("Kode Dosen: " + kode);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + usia);
        System.out.println("-----------------------------");

    }

}
