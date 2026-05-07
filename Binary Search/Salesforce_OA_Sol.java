class Salesforce_OA_Sol {
public Boolean check(int arr[],int mid,int k){
int c=0;
int sum=0;
int i=0;

while(i<arr.length){

sum+=arr[i];
if(sum<=mid) i++;
else {
c++;
sum=0;
	}

}

return (c+1)<=k;
}


public int solution(int arr,int k){
int sum=0;
int mx=0;
for(int i=0;i<n;i++) {
sum+=arr[i];
mx=Math.max(mx,arr[i]);
	}
int l=mx;
int r=sum;
int ans=-1;
int u=0;
while(l<=r && u==0){
int mid=l+(r-l)/2;

if(check(arr,mid,k)){
if(check(arr,mid-1,k){
ans=mid;
u=1;
}
else r=mid-1;
}
else l=mid+1;
}
return ans;
}
}