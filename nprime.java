import java.util.*;
class Ideone
{
   public static void main (String[] args)
   {		
      Scanner in = new Scanner(System.in);
     int a=in.nextInt();
     int b=in.nextInt();
     int count=0,num;
     for(int i=a;i<=b;i++){
    	 for(num=2;num<=a;num++){
    		 if(i%num==0){
    			 count=0;
    			 break;
    		 }else{
    			 count=1;
    		 }
    	 }
    			 if(count==1){
    			 System.out.println(i);
    			 }
    			
    		 }
     in.close();
    	 }
    }
