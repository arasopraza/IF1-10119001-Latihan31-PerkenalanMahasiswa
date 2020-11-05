public class Main {
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
