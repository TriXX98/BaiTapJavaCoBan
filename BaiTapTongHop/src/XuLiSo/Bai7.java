package XuLiSo;

import java.util.Iterator;
import java.util.Scanner;

public class Bai7 {
	static int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("\tLiet ke n so nguyen to dau tien");
		System.out.println("Nhap n: ");
		n = input.nextInt();
		Bai7.soNT();

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

	private static void soNT() {
		System.out.println(n + " so nguyen to dau tien la: ");
		int dem = 0;
		int i = 2;
		while (dem < n) {

			if (checkSNT(i)) {
				System.out.print(" " + i);
				dem++;
			}
			i++;
		}
	}

}
