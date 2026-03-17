import java.util.Scanner;

public class SumUseInput {
    public static void main(String s[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value =");
        int a=sc.nextInt();
        System.out.println("Enter b value =");
        int b=sc.nextInt();
        int Sum=a+b;
        System.out.println("Sum of a+b ="+Sum);
    }
}
