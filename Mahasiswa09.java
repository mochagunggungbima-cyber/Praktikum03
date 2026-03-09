import java.util.Scanner;

public class Mahasiswa09 {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

public class MahasiswaDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa09[] arrayofMahasiswa09 = new Mahasiswa09[3];
        String dummy;

        for (int i=0; i<3; i++) {
            arrayofMahasiswa09[i] = new Mahasiswa09();

            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("NIM: ");
            arrayofMahasiswa09[i].nim = sc.nextLine();
            System.out.print("Nama: ");
            arrayofMahasiswa09[i].nama = sc.nextLine();
            System.out.print("Kelas: ");
            arrayofMahasiswa09[i].kelas = sc.nextLine();
            System.out.print("IPK: ");
            arrayofMahasiswa09[i].ipk = sc.nextFloat();
            sc.nextLine(); 
            System.out.println("-----------------------------"); 
        }
        for (int i=0; i<3; i++) {
            System.out.println("Data mahasiswa ke-" + (i+1));
            System.out.println("NIM: " + arrayofMahasiswa09[i].nim);
            System.out.println("Nama: " + arrayofMahasiswa09[i].nama);
            System.out.println("Kelas: " + arrayofMahasiswa09[i].kelas);
            System.out.println("IPK: " + arrayofMahasiswa09[i].ipk);
            System.out.println("-----------------------------"); 
        }
    }
}
}