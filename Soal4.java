import java.util.Scanner;
public class Soal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int jumlahPenjualan = input.nextInt();
		input.close();
		int gaji = 500000,bonusPenjualan; double bonus = 0.1;
		if(jumlahPenjualan >= 40) {
			bonus = 0.25;
		}else if(jumlahPenjualan > 80){
			bonus = 0.35;
		}else if(jumlahPenjualan < 15) {
			jumlahPenjualan = (15 - jumlahPenjualan) * - 1;
			bonus = 0.15;
			
		}
		int bns = (int) (bonus * 50000);
		
		bonusPenjualan =  bns * jumlahPenjualan;
		gaji += bonusPenjualan;
		System.out.println(gaji);	
	}

}
