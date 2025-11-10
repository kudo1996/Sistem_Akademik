package tugas2;

/**
 * Kelas abstrak Member adalah kontrak dasar untuk semua jenis anggota
 * (Dosen, Karyawan, Mahasiswa). Menyediakan atribut umum seperti nama,
 * alamat, dan email, serta metode abstrak untuk input data dan notifikasi.
 */
public abstract class Member{
   
   private String nama;
   private String alamat;
   private String email;

    /**
     * Mendapatkan nama anggota.
     * @return nama anggota
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengatur nama anggota.
     * @param nama nama anggota
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Mendapatkan alamat anggota.
     * @return alamat anggota
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * Mengatur alamat anggota.
     * @param alamat alamat anggota
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * Mendapatkan email anggota.
     * @return email anggota
     */
    public String getEmail() {
        return email;
    }

    /**
     * Mengatur email anggota.
     * @param email email anggota
     */
    public void setEmail(String email) {
        this.email = email;
    }
   
    /**
     * Metode abstrak untuk melakukan input data anggota.
     * Implementasi ditentukan oleh kelas turunannya.
     */
    public abstract void tambahData();
    
    /**
     * Metode abstrak untuk menampilkan notifikasi setelah data ditambahkan.
     */
    public abstract void tampilNotif();
}