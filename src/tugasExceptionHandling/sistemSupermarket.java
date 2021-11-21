package tugasExceptionHandling;
// soal no 3
public class sistemSupermarket {
	// field / atribut class sistemSupermarket
	int kodeBarang = 01;
	String namaBarang = "beras";
	String namaPabrik = "PT. Jaya";
	int harga[] = {0, 1};
	// method pembelian lebih dari 0
	void getPembelian() {
		System.out.println("Pembelian lebih dari 0" + harga[1]/0);
	}
	// method pembelian kurang dari 0
	void getPembelian2() {
		System.out.println("Pembelian kurang dari 0" + harga[0]/0);
	}
	// class main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// objeck untuk memanggil method getPembelian
			sistemSupermarket dataSistemSupermarket =  new sistemSupermarket();
			System.out.println(dataSistemSupermarket.kodeBarang);
			System.out.println(dataSistemSupermarket.namaBarang);
			System.out.println(dataSistemSupermarket.namaPabrik);
			dataSistemSupermarket.getPembelian();
			// objeck untuk memanggil method getPembelian2
			sistemSupermarket dataSistemSupermarket2 = new sistemSupermarket();
			System.out.println(dataSistemSupermarket2.kodeBarang);
			System.out.println(dataSistemSupermarket2.namaBarang);
			System.out.println(dataSistemSupermarket2.namaPabrik);
		} catch(ArithmeticException obj) {
			System.out.println("harga barang <=0");
		} catch(Exception obj) {
			System.out.println("Harga barang >0");
		}
	}

}
