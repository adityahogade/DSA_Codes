class Solution {
    public boolean check(int arr[],int k,int mid){
        int first=arr[0];
        int c=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-first >=mid){
                c++;
                first=arr[i];
            }
            if(c>=k-1) return true;
        }
        return false;
    }
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int l=0;
        int r=stalls[stalls.length-1];
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(check(stalls,k,mid)) {
                ans=mid;
                l=mid+1;
            }
            else r=mid-1;
        }
        return ans;
    }
}