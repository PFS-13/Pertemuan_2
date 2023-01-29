import java.util.Scanner;


public class Soal3 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int a,b,hasil = 0;
		char opsi;
		a = userInput.nextInt();
		opsi = userInput.next().charAt(0);
		b = userInput.nextInt();
		userInput.close();
		switch(opsi) {
		case '+': hasil = a+b;break;
		case '-': hasil = a-b;break;
		case '/': hasil = a/b;break;
		case '*': hasil = a*b;break;
		case '%': hasil = a%b;break;
		}
		
		if(opsi == '/' &&  a % b != 0){
			System.out.println("Tidak habis dibagi");
		} else if(a < 1 && a > 1000 && b < 1 && b > 1000) {
			System.out.println("Nilai yang diinputkan melebihi batas");
		} else {
			System.out.println(hasil);
		}
		
	
		
	}
}
