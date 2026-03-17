import java.util.*; 
public class Q3 {
    public static void main(String arg[]){
         int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number =");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            fact=fact*i;
            System.out.println(i+"fact="+fact);
        }
    }
}
