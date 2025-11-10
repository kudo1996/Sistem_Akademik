package tugas2;

import java.util.Scanner;

/**
 * Representasi data untuk seorang Karyawan.
 * Berisi fields untuk NIP dan divisi, serta implementasi input dan notifikasi.
 */
public class Karyawan extends Member{
    
   private int nip;
   private String divisi;
   
   Scanner inputData = new Scanner(System.in);
   String nama;
   String email;
   String alamat;
   
   /**
    * Konstruktor default Karyawan.
    */
   public Karyawan(){
       super.setNama(nama);
       super.setAlamat(alamat);
       super.setEmail(email);
   }

    /**
     * Mendapatkan NIP.
     * @return nip sebagai int
     */
    public int getNip() {
        return nip;
    }

    /**
     * Mengatur nilai NIP.
     * @param nip nilai NIP
     */
    public void setNip(int nip) {
        this.nip = nip;
    }

    /**
     * Mendapatkan divisi.
     * @return divisi sebagai String
     */
    public String getDivisi() {
        return divisi;
    }

    /**
     * Mengatur divisi.
     * @param divisi nama divisi
     */
    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    /**
     * Menjalankan form input data Karyawan lewat konsol.
     */
    @Override
    public void tambahData() {
        System.out.println("==========================");
        System.out.println("Form Tambah Data Karyawan");
        System.out.println("===========================");
        
        System.out.print("NIP             : " ); 
        nip = inputData.nextInt();
        System.out.print("Nama Lengkap    : "); 
        inputData.nextLine();
        nama = inputData.nextLine() ;
        System.out.print("Alamat          : "); 
        alamat = inputData.nextLine();
        System.out.print("Email           : "); 
        email = inputData.nextLine();
        System.out.print("Divisi          : "); 
        divisi = inputData.nextLine();
    }

    /**
     * Menampilkan notifikasi bahwa data Karyawan telah tersimpan.
     */
    @Override
    public void tampilNotif() {
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println(nama + " Telah terdaftar Sebagai Karyawan, passwordnya adalah " + nip);
        System.out.println("Email Telah terkirim ke alamat : "+ email);
        System.out.println("---------------------------------------------------------------------------------------------------------------");
    }

   
   
    
}