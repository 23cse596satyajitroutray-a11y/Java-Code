import java.util.*;
public class Mul {
    public static void Multi(int a,int b){
        int sum=a*b;
        System.out.print(sum);
    }
    public static void main(String K[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Emter the a=");
      int a=sc.nextInt();
      System.out.println("Emter the b=");
      int b=sc.nextInt();
        Multi(a,b);
    }
}
