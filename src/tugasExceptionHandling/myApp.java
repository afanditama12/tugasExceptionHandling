package tugasExceptionHandling;
// soal no 2
public class myApp {
	// field / atribut class myApp
	String name = "Mark";
	int nilai[] = {100, 0};
	void getNilai() {
		System.out.println("Nilai rata-rata : " + ((nilai[1]+nilai[2])/2));
	}
	// menambah method baru agar nilai di array dapat dibagi dengan 2
	void getNilai2() {
		System.out.println("Nilai rata-rata : " + ((nilai[0]+nilai[2])/2));
	}
	// class main
	public static void main(String[] args) {
		try {
			// objeck untuk memanggil method getNilai
			myApp app = new myApp();
			System.out.println(app.name);
			app.getNilai();
			// membuat objeck baru untuk memanggil method getNilai2
			myApp app2 = new myApp();
			System.out.println(app.name);
			app2.getNilai2();
		} catch(ArithmeticException obj) {
			System.out.println("Error, ada pembagian dengan 0");
		} catch(ArrayIndexOutOfBoundsException obj) {
			System.out.println("Error pengakses array di luar batas");
		} finally {
			System.out.println("Finally here");
		}
	}
}
