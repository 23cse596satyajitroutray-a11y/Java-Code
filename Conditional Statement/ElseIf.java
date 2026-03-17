import java.util.*;
class ElseIf{
    public static void main(String arg[]){
        Scanner sc = new Scanner (System.in);
            System.out.print("Enter any Number=");
            int Num=sc.nextInt();
            if (Num>=18){
                System.out.println("Adult");
            }
            else if(Num>=19){
                System.out.println("teen");
            }
            else{
                System.out.println("child");
            }
        }

    }
