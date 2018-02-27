package XuLiSo;

import java.util.Scanner;

public class Bai9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Phan tich so nguyen");
		System.out.println("Nhap n: ");
		int n = input.nextInt();
		System.out.print(n +" = ");
		Bai9.nguyenThanhSoNT(n);
		System.out.println("Tong cac so nguyen la: " + tongSoNT(n));
	}

	private static void nguyenThanhSoNT(int n) {
		int i = 2;
		while (n > 1) {
			if (n % i == 0) {
				if (n == i) {
					System.out.println(i);
				} else {
					System.out.print(i + "x");
				}
				// giảm n đi i lần 
				n = n / i;
			} else {
				// nếu n ko chia hết cho i thì t tăng i lên và tiep tuc chia
				i++;

			}
		}
	}

	private static int tongSoNT(int n) {
		int tg = 0;
		while (n > 0) {
			// thực hiện phép tính tổng các số trong 1 số nguyên 
			// phép thực hiện lấy dư theo cơ số 10
			tg += n % 10;
			n = n / 10;
		}
		return tg;
	}

}
