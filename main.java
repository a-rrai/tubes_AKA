package aka;

public class main {

    public static void main(String[] args) {
        int[] ukuranInput = {10,100,1000,10000,100000};
        int nilaiPembanding = 57500;

        algoritma hitung = new algoritma();

        long startIter = System.nanoTime();  
        int hasilIteratif = hitung.hitungIteratif(ukuranInput, nilaiPembanding);
        long endIter = System.nanoTime();    
        double waktuIter = (endIter - startIter) / 1e6; 

        System.out.println("Ukuran input > " + nilaiPembanding + " (iteratif): " + hasilIteratif);
        System.out.println("Waktu eksekusi iteratif: " + waktuIter + " ms");

        long startRek = System.nanoTime();
        int hasilRekursif = hitung.hitungRekursif(ukuranInput, nilaiPembanding, 0);
        long endRek = System.nanoTime();
        double waktuRek = (endRek - startRek) / 1e6; 

        System.out.println("Ukuran input > " + nilaiPembanding + " (rekursif): " + hasilRekursif);
        System.out.println("Waktu eksekusi rekursif: " + waktuRek + " ms");
    }
}
