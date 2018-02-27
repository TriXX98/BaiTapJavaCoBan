package XuLiSo;

import java.util.Scanner;

public class Bai11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Liet ke cac so Fibonaci nho hon n va la so nguyen to");
		System.out.println("Nhap n: ");
		int n = new Scanner(System.in).nextInt();
		System.out.println("Cac so Fibonaci nho hon n va la so nguyen to la: ");
		for (int i = 0; i < n; i++) {
			if (checkSNT(Fibonaci(i))) {
				if (Fibonaci(i) < n) {
					System.out.print(" "+Fibonaci(i));	
				}
				
			}
		}

	}

	private static boolean checkSNT(int n) {
		if (n < 2) {
			return false;
		} else {
			for (int i = 2; i < Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	private static int Fibonaci(int n) {
		if (n < 0) {
			return -1;
		} else if (n == 0 || n == 1) {
			return n;
		}
		return Fibonaci(n - 1) + Fibonaci(n - 2);
	}

}
