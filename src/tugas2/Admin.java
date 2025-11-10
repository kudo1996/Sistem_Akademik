package tugas2;

/**
 * Kelas Admin bertanggung jawab untuk memproses penambahan data anggota (Member)
 * dan menampilkan notifikasi setelah data ditambahkan. Semua komentar JavaDoc
 * ditulis dalam bahasa Indonesia sesuai tugas.
 */
public class Admin {
    /**
     * Menjalankan form tambah data untuk objek Dosen.
     * @param dosen objek Dosen (turunan Member) yang akan diisi datanya
     */
    public void tampilDataDosen(Member dosen){
        System.out.println("");
        dosen.tambahData();
        dosen.tampilNotif();
    }

    /**
     * Menjalankan form tambah data untuk objek Karyawan.
     * @param karyawan objek Karyawan (turunan Member) yang akan diisi datanya
     */
    public void tampilDataKaryawan(Member karyawan){
        System.out.println("");
        karyawan.tambahData();
        karyawan.tampilNotif();
    }

    /**
     * Menjalankan form tambah data untuk objek Mahasiswa.
     * @param mahasiswa objek Mahasiswa (turunan Member) yang akan diisi datanya
     */
    public void tampilDataMahasiswa(Member mahasiswa){
        System.out.println("");
        mahasiswa.tambahData();
        mahasiswa.tampilNotif();
    }

    /**
     * Mengatur apakah program akan dilanjutkan atau keluar berdasarkan input.
     * Jika input adalah 'n' atau 'N' maka program akan keluar.
     * @param lanjut input user, diharapkan 'y' untuk lanjut atau 'n' untuk keluar
     */
    public void lanjut(String lanjut){
        if(lanjut == null) {
            System.out.println("Inputan Tidak Valid");
            return;
        }
        if(lanjut.equalsIgnoreCase("y")){
            System.out.println("Melanjutkan Program..\n");
        }
        else if(lanjut.equalsIgnoreCase("n")){
            System.out.println("Anda telah Keluar Dari Form");
            System.exit(0);
        }
        else{
            System.out.println("\nInputan Tidak Valid\n");
        }
    }
   
}