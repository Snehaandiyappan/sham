import java.util.*;
class Ideone
{	public static void main (String[] args)
	{
	Scanner in=new Scanner(System.in);
	System.out.print("how many no. do you want to print");
	int a=in.nextInt();
	
	int count=0;
for(int i=1;i<=(a*5);i++){
		if(i%5==0){
			count++;
			System.out.println(i);
		}
		if(count==a){
			break;
		}
	}
}
}
