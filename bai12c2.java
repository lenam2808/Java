import java.util.Scanner;
public class bai12c2 {
	public static void main(String[] agrs) {
		int n,m,i,j;
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap so hang:");
		n = scan.nextInt();
		System.out.println("Nhap so cot:");
		m = scan.nextInt();
		int a[][] = new int[n][m];
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Nhap phan tu thu ["+i+"]["+j+"]:");
				a[i][j] = scan.nextInt();
			}
		}
		System.out.println("Ma tran vua nhap la: ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("\n");
		}
		int max=a[0][0];
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				if(a[i][j]>max)
					max=a[i][j];
			}
		}
		System.out.println("So lon nhat la: "+max);
	}
}
