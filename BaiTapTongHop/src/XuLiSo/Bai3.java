package XuLiSo;

import java.util.Scanner;

public class Bai3 {
	public Bai3() {
		// TODO Auto-generated constructor stub

	}

	public static final char Language = 55;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("\tDOI CO SO 10 THANH CO SO m (2 <= m <=16))");
		System.out.println("Nhap so can doi: ");
		int n = input.nextInt();
		System.out.println("Nhap co so m : ");
		int m = input.nextInt();
		System.out.println("Doi co so 10 thanh co so " + m + " : " + Bai3.doiCoSo(n, m));
	}

	public static String doiCoSo(int n, int m) {
		if (n < 0 || n < 2 || n > 16) {
			return "";
		}
		StringBuffer convert = new StringBuffer();
		int number = n;
		int i;
		while (number > 0) {
			// nếu phép chia có số lớn hơn 0 thì tiếp tục thực hiện
			if (m > 10) {
				// chia lấy dư
				i = number % m;
				if (i >= 10) {
					// nếu số dư là các số lớn hơn 10
					// thì sẽ chuyển thành các chứ từ A-F(10-15)
					convert.append((char) (Language + i));
				} else {
					// nếu nhỏ hơn 10 thì lấy dư là các số 0-9
					convert.append(i);
				}
				// Nếu cơ số nhỏ hơn 10 thì ta chia lấy dư và đảo ngược nó lại :))
			} else {
				convert.append(number % m);

			}
			// đươc thêm vào trong chuỗi convert.append
			// giảm dần số number theo cơ số m
			number = number / m;
		}
		// trả về chuỗi đảo ngược 
		return convert.reverse().toString();
	}

}
