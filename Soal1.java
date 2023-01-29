import java.util.Scanner;


public class Soal1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String kata = input.nextLine();
		input.close();
		char[] newKata = kata.toCharArray();
		int count = 1;
		for(int i = 0; i < kata.length();i++) {
			if(newKata[i] == ' ' || newKata[i] == '!' || newKata[i] == ',' || newKata[i] == '\'' || newKata[i] == '?'|| newKata[i] == '.' || newKata[i] == '_' || newKata[i] == '@') {
				count++;
			}
		}
		System.out.println(count);
		for(int i = 0; i < kata.length();i++) {
			if(newKata[i] == ' ' || newKata[i] == '!' || newKata[i] == ',' || newKata[i] == '\'' || newKata[i] == '?'|| newKata[i] == '.' || newKata[i] == '_' || newKata[i] == '@') {
				System.out.print("\n");
			}else {
				System.out.print(newKata[i]);
			}
		}
	}
}
