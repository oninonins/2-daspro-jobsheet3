public class dataDosen05 {
    
    //a menampilkan data dosen
    public static void dataSemuaDosen(Dosen05[] arrayOfDosen) {
        System.out.println("=== Data Semua Dosen ===");
        for (Dosen05 i : arrayOfDosen) {
            i.tampilData();
        }
        System.out.println("-----------------------------");

    }

    //b menampilkan data dosen berdasarkan jenis kelamin
    public static void jumlahDosenPerJenisKelamin(Dosen05[] arrayOfDosen) {
        int laki = 0;
        int perempuan = 0;
        for (Dosen05 i : arrayOfDosen) {
            if (i.jenisKelamin) {
                laki++;
            } else {
                perempuan++;
            }
        }
        System.out.println("Jumlah dosen laki-laki: " + laki);
        System.out.println("Jumlah dosen perempuan: " + perempuan);
        System.out.println("-----------------------------");

    }

    //c menampilkan rata-rata usia dosen per jenis kelamin
    public static void rerataUsiaDosenPerJenisKelamin(Dosen05[] arrayOfDosen) {
        int laki = 0;
        int perempuan = 0;
        int usiaLaki = 0;
        int usiaPerempuan = 0;
        for (Dosen05 i : arrayOfDosen) {
            if (i.jenisKelamin) {
                laki++;
                usiaLaki += i.usia;
            } else {
                perempuan++;
                usiaPerempuan += i.usia;
            }
            
        }
        System.out.println("-----------------------------");

        if (laki > 0) {
                System.out.println("Rata-rata usia dosen laki-laki: " + (usiaLaki / laki));
        } else {
            System.out.println("Tidak ada dosen laki-laki");
        }
        if (perempuan > 0 ) {
            System.out.println("Rata-rata usia dosen perempuan: " + (usiaPerempuan / perempuan));
        } else {
            System.out.println("Tidak ada dosen perempuan");
        }
        System.out.println("-----------------------------");

        }

    //d menampilkan data dosen tertua 
    public static void infoDosenPalingTua(Dosen05[] arrayOfDosen) {
        int usiaTertua = 0;
        Dosen05 dosenTertua = new Dosen05();
        for (Dosen05 i : arrayOfDosen) {
            if (i.usia > usiaTertua) {
                usiaTertua = i.usia;
                dosenTertua = i;
            }
        }
        System.out.println("Dosen tertua: " + usiaTertua);
        dosenTertua.tampilData();
        System.out.println("-----------------------------");

    }

    //e menampilkan data dosen termuda
    public static void infoDosenPalingMuda(Dosen05[] arrayOfDosen) {
        int usiaMuda = 100;
        Dosen05 dosenMuda = new Dosen05();
        for (Dosen05 i : arrayOfDosen) {
            if (i.usia < usiaMuda) {
                usiaMuda = i.usia;
                dosenMuda = i;
            }
        }
        System.out.println("Dosen termuda: ");
        dosenMuda.tampilData();
        System.out.println("-----------------------------");
        
    }
    
}   
