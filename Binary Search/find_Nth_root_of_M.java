class Solution {
    public int nthRoot(int n, int m) {
        // code here
       
        int l=0,r=m;
        while(l<=r){
            int mid=(l+r)/2;
            double val=Math.pow(mid,n);
            if(val==m) return mid;
            else if(val>m) r=mid-1;
            else l=mid+1;
        }
        return -1;
    }
}