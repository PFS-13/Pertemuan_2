import java.util.Scanner;
import java.math.BigInteger;

public class Soal6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BigInteger A;
		BigInteger B;
		A = input.nextBigInteger();
		B = input.nextBigInteger();
		input.close();
		System.out.println(A.add(B));
		System.out.println(A.multiply(B));
	}
}
