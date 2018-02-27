package XuLiSo;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\tTIM UCLN va BCNN");
		System.out.println("Nhap a:");
		int a = new Scanner(System.in).nextInt();
		System.out.println("Nhap b:");
		int b =  new Scanner(System.in).nextInt();
        System.out.println("UCLN cua a va b la: "+uCLN(a, b));
        System.out.println("BCNN cua a va b la: "+bCNN(a, b));
	}

	public static int uCLN(int a , int b) {
		if(b==0){
			return a;	
		}			
		return uCLN(b, a%b);
		
	}
	public static int bCNN(int a , int b) {
		
		return (a*b)/ uCLN(a, b) ;
	}
}
