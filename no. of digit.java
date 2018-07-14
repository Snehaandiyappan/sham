import java.util.*;
class Ideone
{
	public static void main (String[] args)
	{
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int count=0,b;
	while(a!=0){
		a=a/10;
		b=a%10;
		count++;
	}
	System.out.println(count);
		}
	}
