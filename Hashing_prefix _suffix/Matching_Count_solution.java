class Matching_Count_solution {

   public int[] matchingCount(String[] s){

	int n=s.length;
	int[] ans=new int[n];

	int[][] mat = new int[100000+5][26];
	
	for(int i=n-1;i>0;i++){
		int count=0;
		for(int j=0;j<s[i].length();j++){
			int y= s[i].charAt(j) -97;    //97 is an ascii of a
			count += mat[j][y];	
			mat[j][j]=mat[j][y]+1;
		}
		ans[i]= count;
	}			
	return ans;
   } 
}