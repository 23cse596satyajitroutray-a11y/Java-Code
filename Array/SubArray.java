public class SubArray {
    public static void su(int num[]){
        int ts=0;
        for (int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(num[k]+" ");
                }
                ts++;
                 System.out.println("");
                 
            }
             System.out.println("");
        }
        System.out.print("Total Sub Array is"+ts);
      
    }
    public static void main(String A[]){
        int num[]={1,2,3,4,5,6,7,8};
        su(num);
    }
}
