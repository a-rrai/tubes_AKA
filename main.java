package aka;

public class main {

	public static void main(String[] args) {
		int[] data = {3, 7, 1, 9, 5, 8};
        int nilaiPembanding = 5;

        iteratif hitung = new iteratif();
        int hasil = hitung.hitungLebihBesar(data, nilaiPembanding);
        
        System.out.println(
            "\nJumlah elemen yang lebih besar dari " 
            + nilaiPembanding + " adalah: " + hasil
        );
    }
}
