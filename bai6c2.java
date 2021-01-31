import java.util.Scanner;
public class bai6c2 {
	public static void main(String[] agrs) {
		int n, temp = 1;
        long giaithua = 1;
        Scanner scanner = new Scanner(System.in);
        do {
        System.out.println("Nhap n: ");
        n = scanner.nextInt();
        } while ((n <= 0) || (n > 10));
        while (temp <= n) {
            giaithua *= temp;
            temp++;
        }
         
        System.out.println(n + "! = " + giaithua);
	}
}
