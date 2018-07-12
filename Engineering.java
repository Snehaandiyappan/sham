import java.util.*;
 class Engineering{ 
	 public static void main(String[] args){ 
Scanner in=new Scanner(System.in);
String s=in.next();
 int l=s.length(); 
int i; 
int d,e,f,g,t; 
char h;
 String output=" "; 
char[] a=s.toCharArray(); 
char c=a[l-1]; 
int temp=c; 
if((temp>=65 && temp<=90)||(temp>=97 && temp<=122)){
 if(temp>=65 && temp<=90){ 
d= temp-64; 
}else{ 
d=temp-96;
 } for(i=0;i<l-1;i++){
	int ascii=a[i];
	 if(ascii>=65 && ascii<=90){ 
e=ascii-64;
 f=e-d; 
if(f<=0){
 g=f+26;
 t=g+64;
 h=(char)t;
 output=output+h;
 } else{
 t=f+64;
 h=(char)t;
 output=output+h; 
} 
}else{ 
e=ascii-96;
 f=e-d; 
if(f<=0){ 
g=f+26; 
t=g+96; 
h=(char)t; 
output=output+h;
 }else{ t=f+96;
 h=(char)t; 
output=output+h;
 }
 } 
} 
System.out.print(output); 
} 
in.close();
} 
}