import java.util.Scanner;

class Basic{
    public static int Sum(int a,int b){//parameters
        int sum=a+b;
        System.out.print("sum is ="+sum);
        return sum;
    }
    public static void main(String s[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a=");
        int a=sc.nextInt();
         System.out.print("Enter b=");
        int b=sc.nextInt();
        Sum(a,b);//argument
    }
}