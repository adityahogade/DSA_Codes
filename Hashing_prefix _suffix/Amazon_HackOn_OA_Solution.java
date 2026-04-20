import java.util.*;
class Amazon_HackOn_OA_Solution{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];

for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}

long sum=0;
long ans=0;
for(int i=0;i<n;i++){
int digit= arr[i]==0 ? 1 : (int) Math.log10(Math.abs(arr[i]))+1;

ans+=((arr[i]*i)+ (sum*Math.pow(10,digit)));

sum+=arr[i];

}
System.out.println(ans);


}

}