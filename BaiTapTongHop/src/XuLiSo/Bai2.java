package XuLiSo;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("TINH GIAI THUA");
		System.out.println("Nhap n: ");
		int n = input.nextInt();
		int gt= 1;
		for (int i =1; i <= n; i++) {
			gt = gt*i;
		}
		System.out.println("Giai thua cua "+n+" la: "+gt);
	}

}
