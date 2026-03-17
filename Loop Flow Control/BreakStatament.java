import java.util.*;
public class BreakStatament {
    public static void main(String A[]){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enetr a Numbaer n=");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
        }while(true);
    } 
}
