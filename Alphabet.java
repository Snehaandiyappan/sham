import java.util.*;
class Ideone
{
	public static void main (String[] args) 
{
	Scanner in=new Scanner(System.in);
	char a=in.next().charAt(0);
 if(a>='A' && a<='Z' || a>='a' && a<='z'){
		System.out.println("Alphabet");
}else{
		System.out.println("Not");
}
	}
}
