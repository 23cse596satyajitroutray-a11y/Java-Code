public class Reverse {
public static void re(int num[]){
    int first=0,end=num.length-1;
    while(first<end){
        int temp=num[end];
        num[end]=num[first];
        num[first]=temp;
        first++;
        end--;
    }

}
public static void main(String A[]){
    int num[]={1,3,4,5,6,7,78,65};
    re(num);
    for(int i=0;i<num.length;i++){
        System.out.print(num[i]+" ");

    }
}
}
