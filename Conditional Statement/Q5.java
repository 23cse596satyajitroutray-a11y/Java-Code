import java.util.*;
class year{
    public static void main(String a[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Year =");
        int year=sc.nextInt();
        if (year%4==0){
            if(year%100!==0){
                if(year%400==0){
                    System.out.print("Leap year");
                }
                else{
                    System.out.print("Not Leap year");
                }
            }
            else{
               System.out.print("Leap year"); 
            }
        }
    }
}