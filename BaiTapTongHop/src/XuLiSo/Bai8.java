package XuLiSo;

public class Bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		System.out.println("\t Tat ca cac so nguyen to co 5 chu so");
		System.out.println("Cac so nguyen to co 5 chu so la: ");
		for (int i = 10000; i <= 100000; i++) {
			if (checkSNT(i)) {
				System.out.println(""+i);
				sum +=i ;
			}
		}
		System.out.println("Tong tat ca cac so nguyen to co 5 chu so la: "+sum);

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

}
