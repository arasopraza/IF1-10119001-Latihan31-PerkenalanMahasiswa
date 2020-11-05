/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: Program ini sesuai dengan implementasi OOP
 * dan class diagram
 */

public class Mahasiswa {
    public String nim, nama;

    public void perkenalkanDiri() {
        System.out.println("Hallo Everyone");
        System.out.println("My NIM is " + nim);
        System.out.println("My Name is " + nama);
        System.out.print("\n");
    }

    public static void main(String[] args) {
        Mahasiswa satu = new Mahasiswa();
        satu.nama = "Arsy Opraza Akma";
        satu.nim = "10119001";

        Mahasiswa dua = new Mahasiswa();
        dua.nama = "Aras Opraza";
        dua.nim = "10119002";

        Mahasiswa tiga = new Mahasiswa();
        tiga.nama = "Arsy";
        tiga.nim = "10119003";

        Mahasiswa empat = new Mahasiswa();
        empat.nama = "Aras";
        empat.nim = "10119004";

        satu.perkenalkanDiri();
        dua.perkenalkanDiri();
        tiga.perkenalkanDiri();
        empat.perkenalkanDiri();
    }
}
