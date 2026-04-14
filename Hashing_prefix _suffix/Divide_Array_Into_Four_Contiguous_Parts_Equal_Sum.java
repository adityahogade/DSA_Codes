class Divide_Array_Into_Four_Contiguous_Parts_Equal_Sum {



public int Count_Ways_of_split(int[] arr){

long total=0;
int n=arr.length;
    for(int i=0;i<n;i++){
	total+=arr[i];

	}

if(total%4 !=0) return false;
long prefix=0;
int ways=0,count2=0,count1=0;
int target=total/4;

for(int i=0;i<n;i++){

    prefix+=arr[i];
    if(prefix==target*3) ways+=count2 ;
    if(prefix==target*2) count2+=count1;
    if(prefix==target) count1++;
}
return ways;

}
}