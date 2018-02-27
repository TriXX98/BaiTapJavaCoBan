package XuLiSo;

import java.util.ArrayList;
import java.util.List;

public class Bai10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\t Kiem tra tinh thuan nghich");
		System.out.println(" In cac so thuan nghich co 6 chu so");
		for (int i = 100000; i < 1000000; i++) {
			if (checkThuanNghich(i)) {
				System.out.println(i);
			}
		}

	}

	private static boolean checkThuanNghich(int n) {
		List<Integer> list = new ArrayList<>();
		do {
			// phân tích số n thành các số
			list.add(n % 10);
			n /= 10;
		} while (n > 0);
		// kiểm tra thuận nghịch
		for (int i = 0; i < list.size()/2; i++) {
			if (list.get(i) != list.get(list.size() - i - 1)) {
				return false;

			}
		}

		return true;
	}

}
