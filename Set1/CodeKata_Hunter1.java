import java.util.*;
import java.io.*;
class CodeKata_Hunter1{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n,flag=0;
HashMap<Integer,Integer> op=new HashMap();
while(sc.hasNextInt())
{
n=sc.nextInt();
if(op.containsKey(n))
{
op.put(n,op.get(n)+1);
flag=1;
}
else
op.put(n,1);
}

if(flag==0)
{
System.out.print("unique");
}
else
{
for(Map.Entry entry: op.entrySet())
{
if((int)entry.getValue()>1)
System.out.print(entry.getKey());
}
}
}
}