
import java.util.Scanner;
public class MahasiswaDemo05 {

    
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Mahasiswa05 [] arrayOfMahasiswa = new Mahasiswa05[3];


        // // array index 0
        // arrayOfMahasiswa[0] = new Mahasiswa05();
        // arrayOfMahasiswa[0].nim = "244107060033";
        // arrayOfMahasiswa[0].nama = "Agnes TITANIA KINANTI";
        // arrayOfMahasiswa[0].kelas = "SIB-1B";
        // arrayOfMahasiswa[0].ipk = (float) 3.75;


        // // array index 1
        // arrayOfMahasiswa[1] = new Mahasiswa05();
        // arrayOfMahasiswa[1].nim = "2341720172";
        // arrayOfMahasiswa[1].nama = "ACHMAD MAULANA HAMZAH";
        // arrayOfMahasiswa[1].kelas = "TI - 2A";
        // arrayOfMahasiswa[1].ipk = (float) 3.36;

        // // array index 2 
        // arrayOfMahasiswa[2] = new Mahasiswa05();
        // arrayOfMahasiswa[2].nim = "244107023006";   
        // arrayOfMahasiswa[2].nama = "DIRHAMAWAN PURWANTO";
        // arrayOfMahasiswa[2].kelas = "TI - 2E";
        // arrayOfMahasiswa[2].ipk = (float) 3.80;


        


        // print array of mahasiswa
        System.out.println("NIM     : " + arrayOfMahasiswa[0].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa[0].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa[0].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa[0].ipk);
        System.out.println("----------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa[1].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa[1].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa[1].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa[1].ipk);
        System.out.println("----------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa[2].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa[2].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa[2].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa[2].ipk);

    }
}
