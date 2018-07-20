import java.util.*;
class Ideone
{
   public static void main (String[] args)
   {		
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
     int a=n;
     int b,sum=0;
     while(n>0){
    	 b=n%10;
    	 sum=sum*10+b;
    	 n=n/10;
     }    
   System.out.println(sum);
     in.close();
     }
    }
