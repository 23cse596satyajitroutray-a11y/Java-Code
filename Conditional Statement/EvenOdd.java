import java.util.*;
public class EvenOdd {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number=");
        int Num=sc.nextInt();
        
        if(Num%2==0){
            System.out.println(Num+ " is Even");
        }
        else{
            System.out.println(Num+" is Odd");
        }
    }
    
}
