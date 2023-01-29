import java.util.Scanner;
public class Soal5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String plat;
		plat = input.nextLine();
		input.close();
		plat = plat.replaceAll("\\s+", "");
		System.out.println("PLAT IS "+plat);
		long number = Long.parseLong(plat);
		number = number - 999999;
		if(number % 5 == 0) {
			System.out.println("jalan");
		} else {
			System.out.println("berhenti");
		}
}
}
