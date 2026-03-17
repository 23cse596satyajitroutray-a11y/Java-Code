import java.util.Scanner;

public class Cal{
    
public static void main(String A[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the a=");
     int a=sc.nextInt();
    System.out.println("Enter the b=");
     int b=sc.nextInt();
    System.out.println("Enter the operator=");
    char operator=sc.next().charAt(0);
   
   
    switch (operator) {
        case '+':
            System.out.print(a+b);
            break;
        case '-':
            System.out.print(a-b);
            break;
        case '*':
            System.out.print(a*b);
            break;
        default:
            System.out.print("NO MOENY");
            break;
    }
}
    
}
