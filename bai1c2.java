import java.util.Scanner;
public class bai1c2 {
	public static void main(String[] args) {
		int n,m;
		int tong,hieu,tich,thuong,du;
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap so thu 1: ");
		n = scan.nextInt();
		System.out.println("Nhap so thu 2: ");
		m = scan.nextInt();
		tong = n+m;
		hieu = n-m;
		tich = n*m;
		thuong = n/m;
		du = n%m;
		System.out.println("Tong = "+tong);
		System.out.println("Hieu = "+hieu);
		System.out.println("Tich = "+tich);
		System.out.println("Thuong = "+thuong);
		System.out.println("Du = "+du);
	}

}
