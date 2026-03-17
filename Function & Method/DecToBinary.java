public class DecToBinary {
    public static void Dec(int n){
        int rem;
        int pow = 0;     // initialize
        int bino = 0;    // initialize

        while(n > 0){
            rem = n % 2;
            bino = bino + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n / 2;
        }

        System.out.println(bino);  // print after loop
    }

    public static void main(String A[]){
        Dec(5);
    }
}