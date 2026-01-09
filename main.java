package aka;

public class main {

	public static void main(String[] args) {
		int[] data = {10, 100, 1000, 10000, 100000};
        int nilaiPembanding = 57500;

        algoritma hitung = new algoritma();
        int hasilIteratif = hitung.hitungIteratif(data, nilaiPembanding);
		int hasilRekursif = hitung.hitungRekursif(data, nilaiPembanding, 0);
        
        System.out.println("Jumlah elemen > " + nilaiPembanding + " (iteratif): " + hasilIteratif);
        System.out.println("Jumlah elemen > " + nilaiPembanding + " (rekursif): " + hasilRekursif);
    }
}

