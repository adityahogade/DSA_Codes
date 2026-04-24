class Amazon_SDE2_Sol{

public boolean check(int arr[],int d,int k){
int sum=0;
for(int i=0;i<arr.length;i++){
sum+= Math.ceil(arr[i]/k);
}
return sum<=d;

}

public int countPageReadDaily(int[] arr,int d){
int n=arr.length;
int max=0;
for(int i=0;i<n;i++)   max=Math.max(max,arr[i]);
int l=1,r=max;
int ans=0;
int u=0;

while(l<=r && u==0){
int mid=l+(r-l)/2;
boolean fit=check(arr,d,mid);

if(fit) {
if(mid==1){
u=1;
ans=mid;
}
else if(check(arr,d,mid-1)==false) {
u=1;
ans=mid;
}
r=mid+1;
ans=mid;

}
else l=mid-1;

}

return ans;
}
}