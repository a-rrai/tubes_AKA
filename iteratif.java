package aka;

public class iteratif {
	public int hitungLebihBesar(int[] data, int nilaiPembanding) {
		int jumlah = 0;
		
		System.out.print("Elemen yang lebih besar dari " + nilaiPembanding + " adalah: ");
	    for (int i = 0; i < data.length; i++) {
	        if (data[i] > nilaiPembanding) {
	        	System.out.print(data[i] + " ");
	        	jumlah++;
	        }
	    }
	    return jumlah;
	}

	public int hitungRekursif(int[] data, int nilaiPembanding, int index) {
    	if (index == data.length) {
        	return 0;
    	}
    	int count = 0;
    	if (data[index] > nilaiPembanding) {
        	count = 1;
    	}
    
    	return count + hitungRekursif(data, nilaiPembanding, index + 1);
	}
}

