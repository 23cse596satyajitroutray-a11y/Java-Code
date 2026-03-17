import java.util.*;
public class Nnatural {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number=");
        int n=sc.nextInt();
        int num=1;
        while(num<=n){
            System.out.println(num);
            num=num+1;
        }
         System.out.print("Sum of N natural number is="+num);
    }
}