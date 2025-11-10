package tugas2;

import java.util.Scanner;

/**
 * Kelas Main berisi titik masuk (main) untuk program konsol
 * Sistem Informasi Akademik sederhana.
 */
public class Main {

    /**
     * Metode utama yang menjalankan menu interaktif lewat konsol.
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        int menu = 0;
        Scanner inputPilihan = new Scanner(System.in);
        Scanner lanjut = new Scanner(System.in);
        Admin print = new Admin();
        
        
        while(true){
            System.out.println("==================================");
            System.out.println("SISTEM INFORMASI AKADEMIK");
            System.out.println("==================================");
            System.out.println("1) Tambah Member");
            System.out.println("2) Keluar");
            System.out.print("PILIH MENU [1/2] : "); menu = inputPilihan.nextInt();

            if (menu == 1){
                int menu2 = 0;
                String next;
                System.out.println("=========================");
                System.out.println("Form Tambah Data Anggota");
                System.out.println("=========================");
                System.out.println("1) Tambah Data Dosen");
                System.out.println("2) Tambah Data Karyawan");
                System.out.println("3) Tambah Data Mahasiswa");
                System.out.print("PILIH MEMBER [1/2/3] : ") ; menu2 = inputPilihan.nextInt();
                
                switch(menu2){
                    case 1: print.tampilDataDosen(new Dosen());
                            System.out.println("Lanjut [y/n]"); next = lanjut.nextLine();
                            print.lanjut(next);
                            break;
                    case 2: print.tampilDataKaryawan(new Karyawan());
                            System.out.println("Lanjut [y/n]"); next = lanjut.nextLine();
                            print.lanjut(next);
                            break; 
                    case 3: print.tampilDataMahasiswa(new Mahasiswa());
                            System.out.println("Lanjut [y/n]"); next = lanjut.nextLine();
                            print.lanjut(next);
                            break;
                    case 4: System.out.println("Terimakasih Telah menggunakan Program ini");
                    break;
                default : System.out.println("Maaf Data Yang Anda Inputkan SALAH");         
            }
            }
            else if (menu == 2){
                System.out.println("Terima Kasih !!");
                break;
            }
            else{
                System.out.println("Maaf Data Yang Anda Inputkan SALAH");
            }

    }
   }
}
