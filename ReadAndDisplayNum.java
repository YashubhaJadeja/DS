import java.util.Scanner;
public class ReadAndDisplayNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println(" Enter size  of array ");
		n = sc.nextInt();
		int[] x=  new int[n];
		for(int i=0;i<n;i++)
{
	System.out.println(" Enter array "+ i+";");
	x[i]=sc.nextInt();

}
 for(int i=0;i<x.length;i++)
			{
				System.out.println("your array lenth is "+ x[i]);
			}
		}
	

	}
