import java.util.Scanner;

public class MahasiswaMain26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumMhs = s.nextInt();
        PencarianMhs26 data = new PencarianMhs26(jumMhs);
        System.out.println("-------------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari Nim Terkecil");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("-------------------------------------------------------");
            System.out.print("Nim\t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = s1.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();

            Mahasiswa26 m = new Mahasiswa26(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("-------------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
        System.out.print("Nama : ");//modif
        String cariNama = s1.nextLine();//modif

        System.out.println("menggunakan binary Search");
        data.searchAndPrint(cariNama);//modif
        data.searchAllAndPrint(cariNama);//modif

        s.close();
        s1.close();
    }
}
