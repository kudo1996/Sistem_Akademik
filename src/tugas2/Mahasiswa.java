package tugas2;

import java.util.Scanner;

/**
 * Representasi data untuk seorang Mahasiswa.
 * Menyediakan input lewat konsol untuk NIM, nama, alamat, email, dan prodi.
 */
public class Mahasiswa extends Member{
    
    private int nim;
    private String prodi;
    
   Scanner inputData = new Scanner(System.in);
   String nama;
   String email;
   String alamat;

    /**
     * Konstruktor default Mahasiswa.
     */
    public Mahasiswa (){
        super.setNama(nama);
        super.setAlamat(alamat);
        super.setEmail(email);
    }

    /**
     * Mendapatkan NIM.
     * @return nim sebagai int
     */
    public int getNim() {
        return nim;
    }

    /**
     * Mengatur NIM.
     * @param nim nilai NIM
     */
    public void setNim(int nim) {
        this.nim = nim;
    }

    /**
     * Mendapatkan program studi.
     * @return prodi sebagai String
     */
    public String getProdi() {
        return prodi;
    }

    /**
     * Mengatur program studi.
     * @param prodi nama program studi
     */
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    
    
    /**
     * Menjalankan form input data Mahasiswa lewat konsol.
     */
    @Override
    public void tambahData() {
        System.out.println("===========================");
        System.out.println("Form Tambah Data Mahasiswa");
        System.out.println("===========================");
        
        System.out.print("NIM             : " ); 
        nim = inputData.nextInt();
        System.out.print("Nama Lengkap    : "); 
        inputData.nextLine();
        nama = inputData.nextLine() ;
        System.out.print("Alamat          : "); 
        alamat = inputData.nextLine();
        System.out.print("Email           : "); 
        email = inputData.nextLine();
        System.out.print("Prodi           : "); 
        prodi = inputData.nextLine();
    }

    /**
     * Menampilkan notifikasi bahwa data Mahasiswa telah tersimpan.
     */
    @Override
    public void tampilNotif() {
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println(nama + " Telah terdaftar Sebagai Mahasiswa, passwordnya adalah " + nim);
        System.out.println("Email Telah terkirim ke alamat : "+ email);
        System.out.println("---------------------------------------------------------------------------------------------------------------");
    }
    
}