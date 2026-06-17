class SelectionShort{
    public static void Select(int arr[]){
        int n=arr.length;
        for(int i=0;i<=n-1;i++){
            int min_index=i;
            for(int j=i+1;j<=n-1;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
        for(int i=0;i<n;i++){
 System.out.print(arr[i]+" ");
        }
       
    }
    public static void main(String A[]){
        int arr[]={5,4,1,3,2};
        Select(arr);
        
    }
}