import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	 int n,a,d;
	  n=in.nextInt();
	  a=in.nextInt();
	  d=in.nextInt();
	  int b=(n*((2*a)+((n-1)*d)))/2;
	System.out.println(b);
 in.close();
 }
}
