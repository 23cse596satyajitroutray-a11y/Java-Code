import java.util.Scanner;

public class Switch {
    
public static void main(String a[]){
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter the number =");
    int Num=sc.nextInt();
    switch (Num) {
        case 1:
            System.out.print("Samosa");
            break;
        case 2:
            System.out.print("Etli");
            break;
        case 3:
            System.out.print("AluChap");
            break;
        default:
            System.out.print("NO MOENY");
            break;
    }
}
    
}
