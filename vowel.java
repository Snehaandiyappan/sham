import java.util.*;
class Vowel
{
	public static void main (String[] args) 
{
	Scanner in=new Scanner(System.in);
	char a=in.next().charAt(0);
if(a=='a' ||a=='A' ||a=='e' ||a=='E' ||a=='i' ||a=='I'||a=='o' ||a=='O' ||a=='u' ||a=='U'){
	System.out.println("vowel");
}
else if(a>='b' && a<='z' || a>='B' && a<='Z'){
		System.out.println("Constant");
}else{
		System.out.println("Invalid");
}
	}
}
