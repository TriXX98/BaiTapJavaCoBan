package XuLiSo;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("\tGIAI PHUONG TRINH BAC 2");
		System.out.println("\tAx^2+Bx+C=0");
		int a , b ,c ;
		System.out.println("Nhap a: ");
		a  = input.nextInt();
		System.out.println("Nhap b: ");
		b  = input.nextInt();
		System.out.println("Nhap c: ");
		c  = input.nextInt();
		float delta = (float) (b*b) - 4*a*c;
		float x1 = (float) (-b + Math.sqrt(delta))/2*a;
		float x2 = (float) (-b - Math.sqrt(delta))/2*a;
		
		if (a==0) {
			System.out.println("Phuong trinh co dang : Bx + C =0");
			
			if(b==0){
				System.out.println("Phuong trinh vo nghiem");
				if (c==0) {
					System.out.println("Phuong trinh co vo so nghiem");
				}
			}else {
				System.out.println("Phuong trinh co nghiem x = "+(float) (-c)/b);
			}
		}else {
			if(delta == 0){
				System.out.println("Phuong trinh co nghiem kep x1 = x2 = "+(float)(-b)/a );
				
			}else if(delta<0) {
				System.out.println("Phuong trinh vo nghiem");
			}else {
				System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = "+x1+" va x2 = " +x2);
			}
		}
	}

}
