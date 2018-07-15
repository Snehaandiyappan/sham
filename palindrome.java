import java.util.*;
class Ideone
{
	public static void main (String[] args) 
{
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int value=n;
	int a=0;
	int sum=0;
	while(n>0){
		a=n%10;
		sum=(sum*10)+a;
		n=n/10;
	}
	if(value==sum){
	System.out.println("Yes");
	}else{
		System.out.println("No");

	}
}
}
