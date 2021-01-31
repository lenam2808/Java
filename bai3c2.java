import java.util.Scanner;
public class bai3c2 {
	public static void main(String[] args) {
		int n,tuoi;
		String m;
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		m = scan.next();
		System.out.println("Nhap nam sinh: ");
		n = scan.nextInt();
		System.out.println(m);
		tuoi = 2021 - n;
		System.out.println(tuoi);
		if(tuoi>10 && tuoi<18)
		{
			System.out.println("Vi thanh nien");
		}
		else if(tuoi>18 && tuoi<60)
		{
			System.out.println("Truong thanh");
		}
		else 
			System.out.println("Nghi huu");
		
	}
	

}
