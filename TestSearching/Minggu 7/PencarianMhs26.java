import java.util.Scanner;

public class PencarianMhs26 {
    Mahasiswa26 listMhs[];
    int idx;

    public PencarianMhs26(int jumMhs) {
        listMhs = new Mahasiswa26[jumMhs];
        idx = 0;
    }

    void tambah(Mahasiswa26 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil() {
        for (Mahasiswa26 m : listMhs) {
            if (m != null) {
                m.tampil();
                System.out.println("--------------------");
            }
        }
    }
    //modif
    public int findBinarySearchByName(String nama, int left, int right) {
        int mid;
        if (right >= left) {
            mid = left + (right - left) / 2;
            if (listMhs[mid] != null && listMhs[mid].nama.equalsIgnoreCase(nama)) {
                return mid;
            } else if (listMhs[mid] != null && listMhs[mid].nama.compareToIgnoreCase(nama) > 0) {
                return findBinarySearchByName(nama, left, mid - 1);
            } else {
                return findBinarySearchByName(nama, mid + 1, right);
            }
        }
        return -1;
    }
    //modif
    public void searchAndPrint(String nama) {
        int left = 0;
        int right = idx - 1;
        int pos = findBinarySearchByName(nama, left, right);
        if (pos != -1) {
            System.out.println("Data ditemukan pada indeks " + pos);
            System.out.println("Detail Mahasiswa:");
            listMhs[pos].tampil();
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
    //modif
    public void searchAllAndPrint(String nama) {
        boolean found = false;
        for (int i = 0; i < idx; i++) {
            if (listMhs[i] != null && listMhs[i].nama.equalsIgnoreCase(nama)) {
                if (!found) {
                    found = true;
                    System.out.println("Data ditemukan pada indeks:");
                }
                System.out.println(i);
            }
        }
        if (!found) {
            System.out.println("Data tidak ditemukan");
        }
    }
}