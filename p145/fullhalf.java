package p145;
import java.io.*;
class fullhalf{
String ordstr;
String ordqun;
char ordchoice;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double hf() throws IOException{
System.out.println("Please enter the quantity.ex-'f'for full plate or 'h'for half plate");
try{
ordqun=br.readLine();
ordchoice=ordqun.charAt(0);
}catch(IOException e){
System.out.println("Error");
}
if(ordchoice=='f')
return 1.0;
else
return 0.5;
}
}

