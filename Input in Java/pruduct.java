import java.util.Scanner;

public class pruduct {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a=");
        int a=sc.nextInt();
      
        int b=sc.nextInt();
        
        System.out.println("Enter b=");
        int product=a*b;
        System.out.println(product);
    }
}
