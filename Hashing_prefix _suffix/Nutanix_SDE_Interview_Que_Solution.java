class Nutanix_SDE_Interview_Que_Solution {
//  a[i]+b[j]+c[k]+d[l]+e[m] = 0
//  d[l]+e[m] = -( a[i]+b[j]+c[k])

public int CountFiveSum(int[] a,int[] b,int[] c,int[] d,int[] e){
	HashMap<Integer,Integer> hm=new HashMap<>();
	int n=a.length;
	
	for(int l=0;l<n;l++){

	     for(int m=0;m<n;m++){
		int sum=d[l]+e[m];
		hm.put(sum,hm.getOrDefault(sum,0)+1);
		
	}    }
	int count =0;
	
	for(int i=0;i<n;i++){

	     for(int j=0;j<n;j++){
		
		for(int k=0;k<n;k++){
			 int req_Sum= -( a[i]+b[j]+c[k]);
			if(hm.containsKey(req_sum)){
				count+=hm.get(req_Sum);
			}


	}}}

	return count;
}

}