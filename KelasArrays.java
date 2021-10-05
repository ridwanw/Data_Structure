import java.util.Arrays;

// ----------------------------------------
// Contoh penggunaan beberapa metode
//    milik kelas Arrays
// ----------------------------------------

public class KelasArrays {

    public static void main(String[] args) {
        double[] data = { 65.1, 77.2, 1.23, 45.6, 2.1, 3.5 };
        
        tampilkanArray(data);
        
        Arrays.sort(data);
        tampilkanArray(data);
        
        int posisi = Arrays.binarySearch(data, 45.6);
        System.out.println("Posisi 45.6 ada di indeks = " + posisi);
        
        double[] nilai = new double[10];
        Arrays.fill(nilai, 9);
        tampilkanArray(nilai);
    }

    public static void tampilkanArray(double[] x) {
        System.out.print("{" + x[0]);
        for (int i = 1; i < x.length; i++)
            System.out.print(", " + x[i]);
        
        System.out.println('}');
    }

}
