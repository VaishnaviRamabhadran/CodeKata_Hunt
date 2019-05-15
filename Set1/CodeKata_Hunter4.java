import java.util.*;
import java.io.*;
class CodeKata_Hunter4{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int i,n,num;
n=sc.nextInt();
HashMap<Integer,Integer> hm=new HashMap();
for(i=0;i<n;i++)
{
	num=sc.nextInt();
	if(hm.containsKey(num))	
	{
	hm.put(num,hm.get(num)+1);
	}
	else
	{
	hm.put(num,1);
	}
}
for(Map.Entry m:hm.entrySet())
{
if((int)m.getValue()==1)
System.out.print(m.getKey()+" ");
}

}
}