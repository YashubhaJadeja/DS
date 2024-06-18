import java.util.Scanner;
public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter  First number ");
        int m = sc.nextInt();
        System.out.println(" Enter Second number ");
        int n = sc.nextInt();
        int sum=0;
        for(int i=m;i<=n;i++){
            sum+=i;

        }
        System.out.println("sum  = "+ sum);
    }
}
