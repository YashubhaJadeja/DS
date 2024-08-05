import java.util.Scanner;

class Stack{
    Scanner sc=new Scanner(System.in);
    int top;
    int[] arr;
    int length;

    Stack(int length){
        this.top = -1;
     this.length=length;
     arr=new int[length];
   
    }
   
  
    public void push(int p){
        if(top>=length-1){
            System.out.println("stack overflow");
        }else{
            top++;
            arr[top]=p;
            System.out.println("element is inserted on top");
            System.out.println("top element"+arr[top]);
        }
    }
    public int pop(){
        if(top==-1){
           System.out.println("stack underflow");
        }
        else{
            top--;

            return arr[top+1];
        }
    }
}
public class Lab_7_1 {
    public static void main(String[] args) {
        System.out.println("enter length of array");
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        
       
        Stack s= new Stack(length);                                                                                                                 ```     `   `   `   `   `` j;pjljk,l;,,.,,..,   
       System.out.println("enter 1 for push ..enter 2 for pop");
         int k=sc.nextInt();
        switch (k) {
            case 1:
            System.out.println("enter thye value you want to push on top");
            int p=sc.nextInt();
            s.push( p );  

            break;
            case 2:
            s.pop();
            break;
            default:
            System.out.println("enter valid operation");
                break;
        }
    }
}
