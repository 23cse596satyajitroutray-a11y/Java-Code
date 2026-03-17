class SwapNum{
    public static void  Swap(int a,int b){
        int temp=a;
         a=b;
         b=temp;
        System.out.println("a="+a);
        System.out.print("a="+a);

    }
    public static void main(String a[]){
        Swap(10,5);
    }
}