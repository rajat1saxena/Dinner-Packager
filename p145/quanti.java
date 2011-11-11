package p145; 
import java.io.*;
//import java.lang.*; 
class quanti{
int quantizer() throws IOException{
System.out.println("Enter amount");
int i;
int full=0;
String str;
try{
BufferedReader kr=new BufferedReader(new InputStreamReader(System.in));
str=kr.readLine();
try{
i=Integer.parseInt(str);
full=full+i;
}catch(NumberFormatException e){
System.out.println("Number Format Error");
}
}catch(IOException e){
System.out.println("Error in I/O");
}
System.out.println("You entered :"+full);
return full;
}
}
