public class Binomial{
    public static int facto(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static int bio(int n,int r){
        int fac_n=facto(n);
        int fac_r=facto(r);
        int fac_nmr=facto(n-r);

        int binomial=fac_n/(fac_r*fac_nmr);
        return binomial;
    }
    public static void main(String A[]){
        System.out.print(bio(5,2));
    }
}
