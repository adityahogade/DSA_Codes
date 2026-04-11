class google_Interview_Session_SDEIII_Solution {

//arr[i]>arr[j]<arr[k]>arr[l] cal no of quad

public int conut_Quad(int arr[]){
int n=arr.length;
int[] prefix=new int[n];
int[] suffix =new int[n];

prefix[0]=0;
for(int j=1;j<n;j++){

int c=0;
for(int i=0;i<j;i++) {
if(arr[i]>arr[j]) c++;

}   
prefix[j]=c;

}


//suffix cal 

suffix[n-1]=0;
for(int k=n-2;k>=0;k--){

int c=0;
for(int l=n-1;l>k;l--) {
if(arr[k]>arr[l]) c++;

}   
suffix[k]=c;

}


//comparison

int max=0;

for(int j=0;j<n;j++){
for(int k=n-1; k>j ; k--){
max= Math.max(max, prefix[j]*suffix[k]);
}
}
return max;

}
}