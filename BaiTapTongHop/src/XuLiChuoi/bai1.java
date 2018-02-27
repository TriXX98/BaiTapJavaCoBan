package XuLiChuoi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dem so ki tu cua chuoi");
		System.out.println("Moi ban nhap chuoi: ");
		String str = null;
		try {
			str = new BufferedReader(new InputStreamReader(System.in)).readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("So ki tu cua chuoi la: " + str.length());

		System.out.println("\nDem so tu trong 1 xau ");
		System.out.println("So tu cua xau " + str + " la: " + demTu(str));

	}

	private static int demTu(String str) {
		int dem = 0;
		boolean checkCount = true;

		for (int i = 0; i < str.length(); i++) {
			if (str == null) {
				return -1;
			} else if (str.charAt(i) != ' ' && str.charAt(i) != '\t' && str.charAt(i) != '\n') {
				if (checkCount) {
					dem++;
					checkCount = false;
				}
			} else {
				checkCount = true;
			}
		}
		return dem;
	}

}
