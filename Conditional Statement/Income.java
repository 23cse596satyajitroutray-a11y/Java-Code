import java.util.*;
public class Income {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the income=");
        int inc=sc.nextInt();
        int tax;
        if(inc<500000){
            tax=0;
        }
        else if(inc>=500000 && inc<=1000000){
            tax=(int)(inc*0.2);
        }
        else{
            tax=(int)(inc*0.3);
        }
        System.out.println("Tax="+tax);
    }
}
