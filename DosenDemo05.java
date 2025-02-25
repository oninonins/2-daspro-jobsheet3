import java.util.Scanner;
public class DosenDemo05 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data dosen: ");
        int jumlahData = input.nextInt();

        Dosen05[] arrayOfDosen = new Dosen05[jumlahData];

        for (int i = 0; i < jumlahData; i++) {
            arrayOfDosen[i] = new Dosen05();
            arrayOfDosen[i].tambahData();
        }

        for (int i = 0; i < jumlahData; i++) {
            arrayOfDosen[i].tampilData();
        }
        //panggil method dataSemuaDosen
    dataDosen05.dataSemuaDosen(arrayOfDosen);
    dataDosen05.jumlahDosenPerJenisKelamin(arrayOfDosen);
    dataDosen05.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
    dataDosen05.infoDosenPalingTua(arrayOfDosen);
    dataDosen05.infoDosenPalingMuda(arrayOfDosen);
    
    }
}
