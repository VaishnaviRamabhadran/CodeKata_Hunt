import java.util.*;
import java.io.*;
class CodeKata_Hunter2{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int i,n,sum=0;
n=sc.nextInt();
ArrayList<Integer> arr=new ArrayList();
HashMap<Integer,Integer> op=new HashMap();
for(i=0;i<n;i++)
{
arr.add(sc.nextInt());
}
Collections.sort(arr);

for(i=n-1;i>=0;i--)
{
if(arr.get(i)!=0)
sum+=(Math.pow(10,i))*arr.get(i);
//System.out.print(arr.get(i));
}
System.out.print(sum);
}
}