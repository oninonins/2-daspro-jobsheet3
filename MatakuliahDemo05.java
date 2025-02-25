import java.util.Scanner;
public class MatakuliahDemo05 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Masukkan jumlah matakuliah : ");
    int jumlah = input.nextInt();
    matakuliah05[] arrayOfMataKuliah = new matakuliah05[jumlah];
    String kode,nama,dummy;
    int sks,JumlahJam;

    // for (int i = 0; i < arrayOfMataKuliah.length; i++) {
    //     System.out.println("Matakuliah ke-" + (i+1));
    //     System.out.print("Kode  : ");
    //     kode = input.nextLine();
    //     System.out.print("Nama  : ");
    //     nama = input.nextLine();
    //     System.out.print("SKS : ");
    //     sks = Integer.parseInt(input.nextLine());
    //     System.out.print("Jumlah Jam : ");
    //     dummy = input.nextLine();
    //     JumlahJam = Integer.parseInt(dummy);
    //     System.out.println("----------------------------------------");
        
    //     arrayOfMataKuliah[i] = new matakuliah05(kode, nama, sks, JumlahJam);
    // }
    
    // for (int i = 0; i < arrayOfMataKuliah.length; i++) {
    //     System.out.println("Matakuliah ke-" + (i+1));
    //     System.out.println("Kode  : " + arrayOfMataKuliah[i].kode);
    //     System.out.println("Nama  : " + arrayOfMataKuliah[i].nama);
    //     System.out.println("SKS : " + arrayOfMataKuliah[i].sks);
    //     System.out.println("Jumlah Jam : " + arrayOfMataKuliah[i].JumlahJam);
    //     System.out.println("----------------------------------------");
    // }

    for (int i = 0; i < arrayOfMataKuliah.length; i++) {
        System.out.println("Masukkan data untuk Mata Kuliah ke-" + (i+1));
        arrayOfMataKuliah[i] = new matakuliah05();
        arrayOfMataKuliah[i].tambahData(); 
    }


    for (int i = 0; i < arrayOfMataKuliah.length; i++) {
        System.out.println("Data Mata Kuliah ke-" + (i+1));
        arrayOfMataKuliah[i].cetakInfo();
    }


   } 
}
