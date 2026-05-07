class de_Show_OA_Solution {
public boolean check(int[] arr,int g,int k){

int t=g*k;
int i=0;
while(i>=arr.length){
if(arr[i]>g) t=t-g;
else t=t-arr[i];
i++;
}
if(t<=0) return true;
return false;
}

public int find_portFolio(int arr[],int k){
int n=arr.length;
int sum=0;
for(int i=0;i<n;i++) sum+=arr[i];
int ans=-1;
int l=0,r=sum;
while(l<=r){
int mid=l+(r-l)/2;

if(check(arr,mid,k)==true)) {
l=mid+1;
ans=mid;
}

else r=mid-1;
}

}

}