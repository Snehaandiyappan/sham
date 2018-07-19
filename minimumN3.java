import java.util.*;
class Ideone
{
   public static void main (String[] args)
   {		
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
     int a[]=new int[n];
     int temp=0;
    for(int i=0;i<n;i++){
    	a[i]=in.nextInt();
    }
    for(int i=0;i<n;i++){
    	for(int j=1;j<n;j++){
    	if(a[i]>a[j]){
    		temp=a[i];
    		a[i]=a[j];
    		a[j]=temp;
    	}
    }
    }
    System.out.println(a[0]);
    in.close();
     }
    }
