class Solution {
    static int upperBound(int[] arr,int x){
        int l=0,r=arr.length-1;
        int ans=arr.length;
        
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>x){
                ans=mid;
                r=mid-1;
            }
            else l=mid+1;
        }
        return ans;
    }
    public static ArrayList<Integer> countLessEq(int a[], int b[]) {
        // code here
        Arrays.sort(b);
        ArrayList<Integer> ans=new ArrayList<>();
        
        for(int i=0;i<a.length;i++){
            int ub=upperBound(b,a[i]);
            ans.add(ub);
    }
    return ans;
    }
}