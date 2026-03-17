import java.util.*;
public class Factorial{
    public static void fact(int n){
    int factorial=1;
    for(int i=1;i<=n;i++){
        factorial=factorial*i;
    }  
      System.out.print("The factorial is ="+factorial);
  }

public static void main(String A[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the n value");
    int n=sc.nextInt();
    fact(n);
    sc.close();
 }
}
