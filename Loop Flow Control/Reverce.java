import java.util.*;
public class Reverce {
   public static void main(String Are[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number=");
    int n=sc.nextInt();
    int last;
    while(n>0){
        last=n%10;
        System.out.print(last);
        n=n/10;
    }
   } 
}
