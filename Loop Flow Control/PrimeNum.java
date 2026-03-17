import java.util.*;
public class PrimeNum {
    public static void main(String A[]){
        Scanner sc=new Scanner(System.in);
System.out.print("Enter any nummber=");
int n=sc.nextInt();
int i;
int count=0;
for(i=1;i<=n;i++){
    if(n%i==0){
        count++;
    }
}
 if(count==2){
        System.out.print("Prime number");
    }
    else{
        System.out.print("Not prime");
    }
    }
}
