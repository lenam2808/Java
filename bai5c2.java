import java.util.Scanner;
public class bai5c2 {
	public static void main(String[] args) {
		int n,tong=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen: ");
		while(true) {
			n = scanner.nextInt();
			tong = tong + n;
			if(tong>100)
				break;
		}
			System.out.println("Tong =" + tong);
	}
}
