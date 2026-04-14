class Microsoft_OA_Prefix {
//Understanding :-> We are given an array  of size “N”. 
//We have to pick “x” elements at exactly “y” distance; sum of all them should be minimum.

public  long MinCost(int arr[],int y,int x){
int n=arr.length;

long[] prefix=new long[n+1];
for(int i=0;i<y;i++) prefix[i]=arr[i];

for(int i=y;i<n;i++){
prefix[i]=prefix[i-y]+(long)arr[i];
}

long min_ans = Long.MAX_VALUE;

for(int i=y;i<n;i++){

int prev_ind=i-((x-1)*y);
if(prev_ind>=0){
long val=prefix[i];
if(prev_ind-y>=0) val-=prefix[prev_ind-y];
min_ans= Math.min(val,min_ans);
}

}

return min_ans;

}
}