public class PrimeOptimize {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(i%2==0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String A[]){
        System.out.print(isPrime(16));
    }
}
