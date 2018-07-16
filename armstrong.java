import java.util.*;
class Ideone
{
   public static void main (String[] args)
   {		
      Scanner in = new Scanner(System.in);
     int a=in.nextInt();
     int n = 0,b,sum=0;
     
    while(a>0){
    	b=a%10;
    	n=(int) Math.pow(b,3);
    	sum+=n;
    	a=a/10;
    }
    System.out.println(sum);
     in.close();
    	 }
    }
