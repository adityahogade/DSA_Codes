class Amazon_OA_Solution{

//you given an parcel[] and extra parcel 
// your task is to add extra parcel in parcel by distributing
//such a way like minimize the maximum val 
// ex :-  [1 2 3] extra_parcel=3
// ans -> [3,3,3]   -> 3

public boolean check(int arr[],int mid,int k,){
int i=0;
int extra=k;
while(extra>0 && i<arr.length){
extra-=(mid-arr[i]);
i++;
}
return extra<=0;

}

public int Minimal_Max(int[] parcel,k){
int max=0;
for(int i=0;i<parcel.length;i++)   max=Math.max(max,parcel[i]);

int l=max,r=max+k ;
while(l<=r){
int mid=l+(r-l)/2;
int ans=-1;
if(check(parcel,mid,k)){
ans=mid;
r=mid-1;
}
else l=mid+1;

}
return ans;
}
}