import java.util.*;
public class Matrix{
public static void main(String[] args)
{
//Scanner s=new Scanner(System.in);
int n=5;
int r=5;
int a[][]=new int[n][r];
int b[][]=new int[n][r];
//int c[][]=new int[n][r];
for(int i=0;i<=n;i++)
{
for(int j=0;j<=r;j++)
{
System.out.print(a[i][j]);
c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j]);
}
}
}
}