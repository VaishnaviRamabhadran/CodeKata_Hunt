import java.io.*;
import java.util.*;
class CodeKata_Hunter6{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n,i,num,flag=0;
HashMap<Integer,Integer> hm=new HashMap();
n=sc.nextInt();
for(i=0;i<n;i++)
{
num=sc.nextInt();
if(hm.containsKey(num))
{
hm.put(num,hm.get(num)+1);
flag=1;
}
else
hm.put(num,1);
}
if(flag==0)
{
System.out.print("unique");
}
else
{
  for(Map.Entry m:hm.entrySet())
  {
   if((int)m.getValue()>1)
   {
    System.out.print(m.getKey()); 
    break;
    }
   }
}
}}