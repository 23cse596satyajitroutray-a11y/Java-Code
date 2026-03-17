public class BinamyToDecimal {
    public static void bino(int biNum){
        int pow=0;
        int dec=0;
        
        while(biNum>0){
            int lastdigit=biNum%10;
            dec=dec+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            biNum=biNum/10;
        }
        System.out.print(dec);
    }
    public static void main(String A[]){
        bino(100);
    }
}
