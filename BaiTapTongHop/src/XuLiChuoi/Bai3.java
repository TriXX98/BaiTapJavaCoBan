package XuLiChuoi;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Kiem tra xau 1 co chua xau 2");
		Scanner input = new Scanner(System.in);
		System.out.println("Moi ban nhap xau 1: ");
		String str1 = input.nextLine();
		System.out.println("Moi ban nhap xau 2: ");
		String str2 = input.nextLine();
		
		if (str1.contains(str2)) {
			System.out.println("Xau 1 co chua xau 2");
		}
		else {
			System.out.println("Xau 1 khac xau 2");
		}

	}

}
