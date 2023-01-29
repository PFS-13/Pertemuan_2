import java.util.Scanner;
public class Soal2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str1 = input.nextLine();
		String str2 = input.nextLine();
		String str3 = input.nextLine();
		
		input.close();
		
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();
		char[] char3 = str3.toCharArray();
		
		String kal1="",kal2="",kal3="";
		int num1=0,num2=0,num3=0;
		
		for (int i = 0; i < char1.length;i++) {
			if(char1[i] == ' ') {
				 String temp = str1.substring(i + 1, str1.length());
				 num1 = Integer.parseInt(temp);
				 break;
			} else {
				 kal1 = kal1 + char1[i];
			}
		}
		
		for (int i = 0; i < char2.length;i++) {
			if(char2[i] == ' ') {
				 String temp = str2.substring(i + 1, str2.length());
				 num2 = Integer.parseInt(temp);
				 break;
			} else {
				 kal2 = kal2 + char2[i];
			}
		}
		
		for (int i = 0; i < char3.length;i++) {
			if(char3[i] == ' ') {
				 String temp = str3.substring(i + 1, str3.length());
				 num3 = Integer.parseInt(temp);
				 break;
			} else {
				 kal3 = kal3 + char3[i];
			}
		}
		
		
		
		
		if(kal1.length() >= 10 && kal2.length() >= 10 && kal3.length() >= 10) {
			System.out.println("String Melebihi Batas");
		} else if(num1 >= 0 && num2 <= 999 && num1 >= 0 && num2 <= 999 && num3 >= 0 && num3 <= 999) {
			System.out.println("================================");
			Show(kal1,num1);
			Show(kal2,num2);
			Show(kal3,num3);
			System.out.println("================================");
			
		} else {
			System.out.println("Angka melebihi batas");
		}
		
	} 
	

	private static void Show(String kal, int num) {
		System.out.print(kal);
		for(int i = 0; i < 15-kal.length();i++) {
			System.out.print(" ");
		}
		if(num < 100) {
			if(num >= 10 ){
			System.out.println("0" + num);
		  } else {
			  System.out.println("00" + num);  
		  }
		} else {
			System.out.println(num);
		}
	
	}
	
	
}
