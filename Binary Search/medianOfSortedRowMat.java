class medianOfSortedRowMat {
public static int upperBound(int[] arr,int k){
    int l=0;
    int r=arr.length-1;
    
    int ans=arr.length;
    while(l<=r){
        int mid=l+(r-l)/2;
        
        if(arr[mid]>k){
            ans=mid;
            r=mid-1;
        }
        else l=mid+1;
    }
    return ans;
    
}
 static int findMedian(int[][] matrix, int N, int M) {
     // write code here...
     int l=1;
     int r=Integer.MAX_VALUE;
     int total=N*M;
     int ans=-1;
     
     
     while(l<=r){
         int mid=l+(r-l)/2;
         int lessEqu=0;
         
         for(int i=0;i<N;i++){
             lessEqu+=upperBound(matrix[i],mid);
         }
         if(lessEqu > total/2){
             ans=mid;
             r=mid-1;
         }
         else l=mid+1;
     }
     return ans;
     
 }   }