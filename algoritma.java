package aka;

public class algoritma {
	public int hitungIteratif(int[] data, int nilaiPembanding) {
		int jumlah = 0;
		
	    for (int i = 0; i < data.length; i++) {
	        if (data[i] > nilaiPembanding) {
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


