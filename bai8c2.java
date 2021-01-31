import java.util.Scanner;
public class bai8c2 {
	public static void main(String[] agrs) {
		int n,i;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Nhap vao so phan tu:");
			n = scan.nextInt();
		}while(n<0);
		int a[] = new int[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Nhap phan tu thu "+i +": ");
			a[i] = scan.nextInt();
		}
		float tbc=0;
		for(i=0;i<n;i++)
		{
			tbc+=a[i];
		}
		System.out.println("TBC la= "+tbc/n);
	}
}
