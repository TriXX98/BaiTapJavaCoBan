package XuLiSo;

import java.util.Scanner;

public class Bai6 {
	static int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("\tCac so nguyen to nho hon n");
		System.out.println("Nhap n: ");
		n = input.nextInt();
		Bai6.soNT();

	}

	public static boolean checkSNT(int n) {
		if (n < 2) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				} 
			}
		}

		return true;
	}

	public static void soNT() {
		System.out.println("Cac so nguyen to nho hon n la: ");
		for (int i = 0; i <= n; i++) {
			if (checkSNT(i)) {
				System.out.print(" "+i);
			}
		}
	}

}
