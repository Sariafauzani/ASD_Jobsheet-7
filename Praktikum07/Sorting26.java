public class Sorting26 {

    public static void sequentialSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Data ditemukan pada indeks ke-" + i);
            }
        }
        
        System.out.println("Data tidak ditemukan");
    }
public static void main(String[] args) {
    //sequentialSearch
    int[] daftarNilai = {10, 5, 20, 15, 80, 45};
    sequentialSearch(daftarNilai, 5);
}
}