package tugas2;

import java.util.Scanner;

/**
 * Representasi data untuk seorang Dosen.
 * Kelas ini memperluas kelas abstrak Member dan mengimplementasikan
 * metode untuk memasukkan data dan menampilkan notifikasi.
 */
public class Dosen extends Member{
    private int nidn;
    
    Scanner inputData = new Scanner(System.in);
    String nama;
    String alamat;
    String email;
    
    /**
     * Konstruktor default Dosen. Menginisialisasi nilai ke super (jika diperlukan).
     */
    public Dosen (){
        super.setNama(nama);
        super.setAlamat(alamat);
        super.setEmail(email);
    }
    
    /**
     * Mendapatkan NIDN Dosen.
     * @return nidn sebagai int
     */
    public int getNidn() {
        return nidn;
    }

    /**
     * Mengatur NIDN Dosen.
     * @param nidn nilai NIDN
     */
    public void setNidn(int nidn) {
        this.nidn = nidn;
    }

    /**
     * Menjalankan form input data Dosen lewat konsol.
     * Meminta NIDN, nama, alamat, dan email.
     */
    @Override
    public void tambahData() {
        System.out.println("===========================");
        System.out.println("Form Tambah Data Dosen");
        System.out.println("===========================");
        
        System.out.print("NIDN            : " ); 
        nidn = inputData.nextInt();
        System.out.print("Nama Lengkap    : ");
        inputData.nextLine();
        nama = inputData.nextLine() ;
        System.out.print("Alamat          : "); 
        alamat = inputData.nextLine();
        System.out.print("Email           : "); 
        email = inputData.nextLine();
        
    }

    /**
     * Menampilkan notifikasi bahwa data Dosen telah tersimpan.
     */
    @Override
    public void tampilNotif() {
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println(nama + " Telah terdaftar Sebagai Dosen, passwordnya adalah " + nidn);
        System.out.println("Email Telah terkirim ke alamat : "+ email);
        System.out.println("---------------------------------------------------------------------------------------------------------------");
    }
    

}