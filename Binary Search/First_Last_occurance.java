class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int l=0;
        int r=arr.length-1;
        int fo=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==x){
                fo=mid;
                r=mid-1;
            }
            else if(arr[mid]>x) r=mid-1;
            else l=mid+1;
            
        }
        ans.add(fo);
        
        int lo=-1;
        l=0;
        r=arr.length-1;
        while(l<=r){
        int mid=l+(r-l)/2;
        if(arr[mid]==x){
            lo=mid;
            l=mid+1;
        }
        else if(arr[mid]>x) r=mid-1;
        else l=mid+1;
    }
    ans.add(lo);
    return ans;
}
}