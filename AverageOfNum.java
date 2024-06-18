import java.util.Scanner;
public class AverageOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter  First number ");
        int m = sc.nextInt();
       
        int sum=0;
      

        for(int i=0;i<=m;i++){
            sum+=i;
    

        }
        double average=0;
        average =sum/m;

        System.out.println("Avg "+average);
    }
}