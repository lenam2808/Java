import java.util.Scanner;
public class bai10c2 {
	public static void main(String[] agrs) {
		String a,b;
		int dem=0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Nhap vao chuoi:");
			a = scan.nextLine();
		}while(a.length()>=80);
		do {
			System.out.println("Nhap 1 ky tu bat ky:");
			b = scan.nextLine();
		}while(b.length()>1);
		
		for(int i=0;i<a.length();i++)
		{
			if(b.charAt(0) == a.charAt(i))
			{
				dem++;
			}
		}
		System.out.print("So lan xua hien cua ky tu "+b.charAt(0)+" la: "+dem);
		
	}

}
