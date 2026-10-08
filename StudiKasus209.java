import java.util.Scanner;

public class StudiKasus209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nama mahasiswa: ");
        String nama = sc.nextLine();

        System.out.println("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya): ");
        String jenisKegiatan = sc.nextLine();

        System.out.println("jumlah dokumen (0-4): ");
        int jumlahDokumen = sc.nextInt();

        int peringkatJuara = 0;
        int statusPendanaanPKM = 0;

        if (jenisKegiatan.equals("BELMAWA")
            || jenisKegiatan.equals("BAKORMA")
            || jenisKegiatan.equals("Mandiri")) {
            System.out.println("Peringkat juara (1,2,3,atau 0 jika bukan jauara): ");
            peringkatJuara = sc.nextInt();
        } else if (jenisKegiatan.equals("PKM")) {
            System.out.println("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            statusPendanaanPKM = sc.nextInt();
        }
        if (jumlahDokumen == 4) {
            if (jenisKegiatan.equals("BELMAWA")
            || jenisKegiatan.equals("BAKORMA")
            || jenisKegiatan.equals("Mandiri")) {
                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("Status: Mahasiswa memperoleh dana pemghargaan");
                } else {
                    System.out.println("Status: tidak memperoleh dana penghargaan (bukan juara 1,2,atau 3");
                }
            } else if (jenisKegiatan.equals("PKM")) {
                if (statusPendanaanPKM == 1) {
                        System.out.println("Status: mahasiswa memperoleh dana penghargaan");
                } else {
                    System.out.println("Status: tidak memperoleh dana penghargaan (tidak lolos)");
                }
            } else {
                System.out.println("status: tidak memperoleh pendanaan diluar kegiatan tertentu");
            }
        } else {
            int kekurangan = 4-jumlahDokumen;
            System.out.println("Status: Data tidak lengkap. ");
            if (kekurangan > 0 && kekurangan <=4) {
                System.out.println("jumlah dokumen masih kurang: " +kekurangan);
            } else {
                System.out.println("jumlah dokumen tidak valid");
            }
            System.out.println("Dana penghargaan tidak diberikan");
        }
    }
}
