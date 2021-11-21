package tugasExceptionHandling;
// soal no 1
public class multipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5, num2 = 0;
		int arrNum[] = {1, 2, 3};
		try {
			// memperbaiki typo penulisan nama array
			int num3 = num1 / arrNum[3];
			int num4 = num1/num2;
			System.out.println("The num 3 = " + num3);
			// memperbaiki typo penulisan nama array
			System.out.println("The 3 elemen is " + arrNum[3]);
			// menampilkan variabel num4
			System.out.println("The num 4 = " + num4);
		}
		catch(ArithmeticException obj) {
			System.out.println("Division by zero");
		} catch(ArrayIndexOutOfBoundsException obj) {
			System.out.println("Error out of bounds");
		} catch(Exception obj) {
			System.out.println("Other error");
		}
	}

}
