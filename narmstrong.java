import java.util.*;
class Ideone
{
   public static void main (String[] args)
   {		
      Scanner in = new Scanner(System.in);
     int a=in.nextInt();
     int c=in.nextInt();
     int i,d=0;
     int n=0 ,b;
     for( i=a;i<=c;i++){
     d=i;
    while(d>0){
    	b=d%10;
    	n+=Math.pow(b,3);
    	d=d/10;
    	}
     if(n==i){
    	System.out.println(i);
     }
     
    n=0;
     }
    in.close();
     }
    }
