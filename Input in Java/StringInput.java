import java.util.*;

public class StringInput {
    public static void main(String args[]) {
        System.out.print("Enter name:");
            Scanner sc = new Scanner(System.in);
            // String input = sc.next();             
            // System.out.print(input);
            String name=sc.nextLine();
              System.out.print("Your name is name:"+name);
        }
    }
