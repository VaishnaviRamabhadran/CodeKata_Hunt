import java.util.*;
import java.io.*;
class CodeKata_Hunter3{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int i,n,num;
n=sc.nextInt();
TreeSet<Integer> ts=new TreeSet();
for(i=0;i<n;i++)
{
num=sc.nextInt();
if(i==num)
ts.add(num);
}
for(Integer value:ts)
System.out.print(value+" ");
}
}