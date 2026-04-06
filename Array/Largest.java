class Largest{
  public static void la(int num[]){
    int large=num[0];
    for(int i=0;i<num.length;i++){
     if(num[i]>large){
      large=num[i];
     }
     
        }
        System.out.print(large);
  
    
  }
  
  public static void main(String A[]){
    int num[]={1,2,3,4,5};
    la(num);
  }
}