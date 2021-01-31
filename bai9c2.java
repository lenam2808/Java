import java.util.Scanner;
public class bai9c2 {
	public static void main(String[] agrs) {
		String a;
		int dodai=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap chuoi ky tu:");
		a = scan.nextLine();
		dodai = a.length();
		System.out.println("Do dai cua chuoi la: "+dodai);
	}
}
