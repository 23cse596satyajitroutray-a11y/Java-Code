import java.util.*;
class Count1ton{
    public static void main(String srg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number n=");
        int n=sc.nextInt();
        int count=1;
        while(count<=n){
            System.out.println(count);
            count++;
        }
    }
}