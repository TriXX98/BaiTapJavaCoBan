package XuLiSo;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("\tFIBONACI");
		System.out.println("Nhap so phan tu cua day: ");
		int m = input.nextInt();
		System.out.print("Day Fibonaci: ");
		for (int i = 0; i < m; i++) {
			System.out.print(Fibonaci(i) + " ");
		}
		System.out.println("");

		System.out.println("Tim so Fibonaci thu n");
		System.out.println("Nhap vi tri can tim: ");
		int n = input.nextInt();
		System.out.println("So can tim la: "+Fibonaci(n-1));

	}

	public static int Fibonaci(int m) {
		int f1 = 0;
		int f2 = 1;
		int f3 = 1;
		if (m == 0 || m == 1) {
			return m;

		} else if (m < 0) {
			return -1;
		} else {
			for (int i = 2; i < m; i++) {
				f1 = f2;
				f2 = f3;
				f3 = f1 + f2;

			}
		}
		return f3;
	}



}
