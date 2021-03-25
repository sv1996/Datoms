import java.util.Scanner;

class Test {


public static String smallestWindow(String s , String pat)
{

if(s==null || s.length()==0) return "-1";
int map[] =  new int[128];
for (char k : pat.toCharArray())
map[k]++;
int count =0,start =-1,end =-1,lo=0,hi=0,min=Integer.MAX_VALUE;
for(hi=0;hi<s.length();hi++)
{
    if(map[s.charAt(hi)]>0)
    count++;
    map[s.charAt(hi)]--;
    if(count ==pat.length())
    {
        while(lo<hi && map[s.charAt(lo)] <0)
        {
     map[s.charAt(lo)]++;
     lo++;
        }
        if(min>hi -lo + 1){
            min = hi-lo+1;
            start = lo;
            end = hi+1;
        }
        map[s.charAt(lo)]++;
        lo++;
        count--;


    }
}
 return start == -1 ?"-1" : s.substring(start,end);

}







 public static void main(String[] args) {
Scanner s = new Scanner(System.in);
String str =  "FORCESABCDEFDIVGHIJKLMNOPQRSTUVWXYZ";
String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


   
   String st= smallestWindow(str , str1);

   System.out.println(st.length());
}


 }
 
 
 