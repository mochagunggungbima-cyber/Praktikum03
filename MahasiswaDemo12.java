import java.util.Scanner;

// Hapus 'public' di sini jika dalam satu file yang sama
class Mahasiswa12 {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;
}

public class MahasiswaDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Perbaikan: Hapus tanda () sebelum angka [3]
        Mahasiswa12[] arrayOfMahasiswa12 = new Mahasiswa12[3];
        
        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa12[i] = new Mahasiswa12();

            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa12[i].nim = sc.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa12[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa12[i].kelas = sc.nextLine();
            
            // Catatan: Hati-hati saat input float setelah nextLine
            System.out.print("IPK   : ");
            arrayOfMahasiswa12[i].ipk = sc.nextFloat();
            sc.nextLine(); // Untuk menangkap enter sisa dari nextFloat
        }
    }
}