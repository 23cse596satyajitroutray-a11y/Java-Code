import java.util.*;
public class Ternary {
   public static void main(String a[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number=");
    int num=sc.nextInt();
    String val=(num%2==0)?"Even":"Odd";
    System.out.println(val);
   } 
}
