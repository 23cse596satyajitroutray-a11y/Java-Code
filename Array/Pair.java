public class Pair {
    public static void pa(int num[]){
        int tp = 0;
        for(int i=0;i<num.length;i++){
           
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+num[i]+","+num[j]+")");
                 tp++;
            }
            System.out.println("");
           
        }
        System.out.print("Total Pointer :"+tp);
    }
    public static void main(String A[]){
        int num[]={1,2,3,4,5,6,7};
        pa(num);
    }
}
