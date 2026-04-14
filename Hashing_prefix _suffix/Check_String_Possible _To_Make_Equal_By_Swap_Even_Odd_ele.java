import java.util.*;

class Check_String_Possible _To_Make_Equal_By_Swap_Even_Odd_ele  {

// check string by swaping even with even and odd with odd ele 
//return yes if it is possible to make equal 
public boolean checkString(String str1,String str2){

if(str1.length != str2.length) return false;
HashMap <Character,Integer> hm_odd1=new HashMap<>();
HashMap <Character,Integer> hm_even1= new HashMap<>();

HashMap <Character,Integer> hm_odd2=new HashMap<>();
HashMap <Character,Integer> hm_even2= new HashMap<>();

int n=str1.length;
for(int i=0;i<n;i++){
char ch=str1.charAt(i);
if(i%2==0){
hm_even1.put(ch,hm.getOrDefault(ch,0)+1) ;
}
else{
hm_odd1.put(ch,hm.getOrDefault(ch,0)+1) ;

}

}

for(int i=0;i<n;i++){
char ch=str2.charAt(i);
if(i%2==0){
hm_even2.put(ch,hm.getOrDefault(ch,0)+1) ;
}
else{
hm_odd2.put(ch,hm.getOrDefault(ch,0)+1) ;

}

}



if(hm_even1.equals(hm_even2) && hm_odd1.equals(hm_odd2)){
return true; 
}


return false; 


}

}