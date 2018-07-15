import java.util.*;
class Ideone
{
	public static void main (String[] args) 
{
	Scanner in=new Scanner(System.in);
	int a[]=new int[3];
	int temp;
	for(int i=0;i<3;i++){
		a[i]=in.nextInt();
	}
	for(int i=0;i<3;i++){
		for(int j=0;i<3;i++){
		
		if(a[i]>a[j] ){
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		}
		System.out.println(a[0]);
		}
}
}
