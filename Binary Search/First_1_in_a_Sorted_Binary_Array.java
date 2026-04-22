// User function Template for Java

class Solution {

    public long firstIndex(int arr[]) {
        
        // Your code goes here
        int l=0;
        int r=arr.length-1;
        int ans=-1;
        
        while(l<=r){
            int mid =l+(r-l)/2;
            if(arr[mid]==1) {
                ans=mid;
                r=mid-1;
            }
            else l=mid+1;
            
            
        }
        return ans;
    }
}