import java.util.*;
public class FailPass {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENter the marks=");
        float Marks=sc.nextInt();
        if(Marks>=90){
            System.out.print("Grade A");
        }
        else if(Marks<=20){
            System.out.print("Tu fail");
        }
    }
}
