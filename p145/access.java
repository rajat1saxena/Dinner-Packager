package p145;
import java.io.*;
//following class contains menu items 
class menu{
String s1=new String("Palak Paneer  ");
String s2=new String("Khoya Paneer  ");
String s3=new String("Malai Kofta   ");
String s4=new String("Dal Fry       ");
String s5=new String("Navratan Curry");
String s6=new String("Shahi Paneer  ");
String s7=new String("Do Pyaza      ");
String s8=new String("Dal MaKhani   ");
String s9=new String("Tawa Roti     ");
String s10=new String("Tandoori Roti ");
String s11=new String("Nan           ");
String s12=new String("Missi Roti    ");
String s13=new String("Vanilla    ");
String s14=new String("Cassata    ");
String s15=new String("Chocobar    ");
String s16=new String("Sundaes    ");
String s17=new String("Kulfi    ");
String s18=new String("Ice lollies    ");
String s19=new String("Chowmein    ");
String s20=new String("Dosa    ");
String s21=new String("Idli    ");
String s22=new String("Chole Bhature    ");
//creating object of rates
rates r=new rates();
//following are the procedures to access menu items
void printmenu1(){
System.out.println(s1+"-----------------------------------Rs."+r.ratePP);
System.out.println(s2+"-----------------------------------Rs."+r.rateKP);
System.out.println(s3+"-----------------------------------Rs."+r.rateMK);
System.out.println(s4+"-----------------------------------Rs."+r.rateDF);
System.out.println(s5+"-----------------------------------Rs."+r.rateNC);
System.out.println(s6+"-----------------------------------Rs."+r.rateSP);
System.out.println(s7+"-----------------------------------Rs."+r.rateDP);
System.out.println(s8+"-----------------------------------Rs."+r.rateDM);
}
void printmenu2(){
System.out.println(s13+"-----------------------------------Rs."+r.rateVL);
System.out.println(s14+"-----------------------------------Rs."+r.rateCS);
System.out.println(s15+"-----------------------------------Rs."+r.rateCC);
System.out.println(s16+"-----------------------------------Rs."+r.rateSN);
System.out.println(s17+"-----------------------------------Rs."+r.rateKF);
System.out.println(s18+"-----------------------------------Rs."+r.rateIL);
}
void printmenu3(){
System.out.println(s19+"-----------------------------------Rs."+r.rateCW);
System.out.println(s20+"-----------------------------------Rs."+r.rateDO);
System.out.println(s21+"-----------------------------------Rs."+r.rateID);
System.out.println(s22+"-----------------------------------Rs."+r.rateCB);
}
void chappatymenu(){
System.out.println(s9+"-----------------------------------Rs."+r.rateTW);
System.out.println(s10+"-----------------------------------Rs."+r.rateTR);
System.out.println(s11+"-----------------------------------Rs."+r.rateNN);
System.out.println(s12+"-----------------------------------Rs."+r.rateMR);
}
}
//following class contains rates of menu items
class rates{
static int ratePP=78;
static int rateKP=100;
static int rateMK=90;
static int rateDF=50;
static int rateNC=260;
static int rateSP=140;
static int rateDP=160;
static int rateDM=120;
static int rateTW=8;
static int rateTR=10;
static int rateNN=15;
static int rateMR=12;
static int rateVL=150;
static int rateCS=120;
static int rateCC=50;
static int rateSN=50;
static int rateKF=30;
static int rateIL=20;
static int rateCW=40;
static int rateDO=30;
static int rateID=20;
static int rateCB=40;
}
//following class serves for ordering
class ordering{
void numsys1(){
System.out.println("1-Palak Paneer");
System.out.println("2-Khoya Paneer");
System.out.println("3-Malai Kofta");
System.out.println("4-Dal Fry");
System.out.println("5-Navratan Curry");
System.out.println("6-Shahi Paneer");
System.out.println("7-Do Pyaza");
System.out.println("8-Dal Makhani");
}
void numsys2(){
System.out.println("i-Vanilla");
System.out.println("j-Cassata");
System.out.println("k-Chocobar");
System.out.println("l-Sundaes");
System.out.println("m-Kufli");
System.out.println("n-Ice lollies");
}
void numsys3(){
System.out.println("a-Tawa Roti");
System.out.println("b-Tandoori Roti");
System.out.println("c-Nan");
System.out.println("d-Missi Roti");
}
void numsys4(){
System.out.println("u-Chowmein");
System.out.println("v-Dosa");
System.out.println("w-Idli");
System.out.println("x-Chole Bhature");
}
void orderprinter(){
System.out.println("Use following number system");
switch(f.fl){
case 1:
numsys1();
break;
case 2:
numsys2();
break;
case 3:
numsys4();
break;
default:
System.out.println("No valid number system for you sir");
break;
}
}
double oPP=0;
double oKP=0;
double oMK=0;
double oDF=0;
double oNC=0;
double oSP=0;
double oDP=0;
double oDM=0;
int i;
flag f=new flag();
String ordstr;
String ordqun;
char ordchoice;
void order() throws IOException{
try{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Let's begin with ur ordering sir");
System.out.println("To make a order press 'p'");
ordstr=br.readLine();
ordchoice=ordstr.charAt(0);
quanti q=new quanti();
int amt;
if(ordchoice=='p')
{
fullhalf half=new fullhalf();
double i;
ordstr=br.readLine();
ordchoice=ordstr.charAt(0);
switch(ordchoice){
case '1':
System.out.println("Palak Paneer");
i=half.hf();
f.flPP+=i;
break;
case '2':
System.out.println("Khoya Paneer");
i=half.hf();
f.flKP+=i;
break;
case '3':
System.out.println("Malai Kofta");
i=half.hf();
f.flMK+=i;
break;
case '4':
System.out.println("Dal Fry");
i=half.hf();
f.flDF+=i;
break;
case '5':
System.out.println("Navratran Curry");
i=half.hf();
f.flNC+=i;
break;
case '6':
System.out.println("Shahi Paneer");
i=half.hf();
f.flSP+=i;
break;
case '7':
System.out.println("Do Pyaza");
i=half.hf();
f.flDP+=i;
break;
case '8':
System.out.println("Dal Makhani");
i=half.hf();
f.flDM+=i;
break;
case 'i':
System.out.println("Vanilla");
i=half.hf();
f.flVL+=i;
break;
case 'j':
System.out.println("Cassata");
i=half.hf();
f.flCS+=i;
break;
case 'k':
System.out.println("Chocobar");
i=half.hf();
f.flCC+=i;
break;
case 'l':
System.out.println("Sundaes");
i=half.hf();
f.flSN+=i;
break;
case 'm':
System.out.println("Kulfi");
amt=q.quantizer();
f.flKF+=amt;
break;
case 'n':
System.out.println("Ice Lollies");
amt=q.quantizer();
f.flIL+=amt;
break;
case 'u':
System.out.println("Chowmein");
i=half.hf();
f.flCW+=i;
break;
case 'v':
System.out.println("Dosa");
f.flDO+=1;
break;
case 'w':
System.out.println("Idli");
f.flID+=1;
break;
case 'x':
System.out.println("Chole Bhature");
f.flCB+=1;
break;
default:
System.out.println("Error");
break; 
}
}
}catch(IOException e){
System.out.println("Error");
}
}
menu mu=new menu();
quanti q=new quanti();
int amt;
void orderchappaty() throws IOException{
numsys3();
try{
BufferedReader gr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("To make order press 'p' OR any other key to Cancel");
ordstr=gr.readLine();
ordchoice=ordstr.charAt(0);
if(ordchoice=='p'){
System.out.println("Enter your choice");
ordstr=gr.readLine();
ordchoice=ordstr.charAt(0);
if(ordchoice=='a'){
System.out.println(mu.s9);
amt=q.quantizer();
f.flTW+=amt;
}
else if(ordchoice=='b'){
System.out.println(mu.s10);
amt=q.quantizer();
f.flTR+=amt;
}
else if(ordchoice=='c'){
System.out.println(mu.s11);
amt=q.quantizer();
f.flNN+=amt;
}
else if(ordchoice=='d'){
System.out.println(mu.s12);
amt=q.quantizer();
f.flMR+=amt;
}else{
System.out.println("Invalid option");
}
}
}catch(IOException e){
System.out.println("Error in inputing");
}
}
}
//
//
//
//following is the accessing class of above classes-----------------------------------------------------------------------------------------------------------------------------------------------------
//
//
//
class access{
public static void main(String args[])
throws java.io.IOException 
{
BufferedReader cr=new BufferedReader(new InputStreamReader(System.in));
String s;
String ins;
char choice;
menu m=new menu();
flag f=new flag();
Enter e=new Enter();
ordering or=new ordering();
System.out.println("Your name Sir");
s=cr.readLine();
System.out.println("Thank u,Which facility whould u like to avail?");
e.entry();
System.out.println("Thanks for ur visit "+s);
}
}
//
//
//
//This is for flag use------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//
//
//
class flag{
static int fl;
static double flPP;
static double flKP;
static double flMK;
static double flDF;
static double flNC;
static double flSP;
static double flDP;
static double flDM;
static double flTW;
static double flTR;
static double flNN;
static double flMR;
static double flVL;
static double flCS;
static double flCC;
static double flSN;
static double flKF;
static double flIL;
static double flCW;
static double flDO;
static double flID;
static double flCB;
}
//
//
//
//This Biller class calculates basic bill---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//
//
//
class Biller{
rates r=new rates();
flag f=new flag();
double amount;
double bill(){
amount=f.flPP*r.ratePP+f.flKP*r.rateKP+f.flMK*r.rateMK+f.flDF*r.rateDF+f.flNC*r.rateNC+f.flSP*r.rateSP+f.flDP*r.rateDP+f.flTW*r.rateTW+f.flTR*r.rateTR+f.flNN*r.rateNN+f.flMR*r.rateMR+f.flVL*r.rateVL+f.flCS*r.rateCS+f.flCC*r.rateCC+f.flSN*r.rateSN+f.flKF*r.rateKF+f.flIL*r.rateIL+f.flCW*r.rateCW+f.flDO*r.rateDO+f.flID*r.rateID+f.flCB*r.rateCB;
return amount;
}
}
//
//
//
//following class will print the bill on screen-----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//
//
class Billprinter{
Biller b=new Biller();
flag f=new flag();
rates r=new rates();
menu m=new menu();
void printbill(){
System.out.println("Item                                       units               rates/unit                        ");
System.out.println("--------------------------------------------------------------------------------");
if(f.flPP!=0){
System.out.println(m.s1+":                             "+f.flPP+" units           Rs"+r.ratePP);
}
if(f.flKP!=0){
System.out.println(m.s2+":                             "+f.flKP+" units           Rs"+r.rateKP);
}
if(f.flMK!=0){
System.out.println(m.s3+":                             "+f.flMK+" units           Rs"+r.rateMK);
}
if(f.flDF!=0){
System.out.println(m.s4+":                             "+f.flDF+" units           Rs"+r.rateDF);
}
if(f.flNC!=0){
System.out.println(m.s5+":                             "+f.flNC+" units           Rs"+r.rateNC);
}
if(f.flSP!=0){
System.out.println(m.s6+":                             "+f.flSP+" units           Rs"+r.rateSP);
}
if(f.flDP!=0){
System.out.println(m.s7+":                             "+f.flDP+" units           Rs"+r.rateDP);
}
if(f.flDM!=0){
System.out.println(m.s8+":                             "+f.flDM+" units           Rs"+r.rateDM);
}
if(f.flTW!=0){
System.out.println(m.s9+":                             "+f.flTW+" units           Rs"+r.rateTW);
}
if(f.flTR!=0){
System.out.println(m.s10+":                             "+f.flTR+" units          Rs"+r.rateTR);
}
if(f.flNN!=0){
System.out.println(m.s11+":                             "+f.flNN+" units          Rs"+r.rateNN);
}
if(f.flMR!=0){
System.out.println(m.s12+":                             "+f.flMR+" units          Rs"+r.rateMR);
}
if(f.flVL!=0){
System.out.println(m.s13+":                             "+f.flVL+" units          Rs"+r.rateVL);
}
if(f.flCS!=0){
System.out.println(m.s14+":                             "+f.flCS+" units          Rs"+r.rateCS);
}
if(f.flCC!=0){
System.out.println(m.s15+":                             "+f.flCC+" units          Rs"+r.rateCC);
}
if(f.flSN!=0){
System.out.println(m.s16+":                             "+f.flSN+" units          Rs"+r.rateSN);
}
if(f.flKF!=0){
System.out.println(m.s17+":                             "+f.flKF+" units          Rs"+r.rateKF);
}
if(f.flIL!=0){
System.out.println(m.s18+":                             "+f.flIL+" units          Rs"+r.rateIL);
}
if(f.flCW!=0){
System.out.println(m.s19+":                             "+f.flCW+" units         Rs"+r.rateCW);
}
if(f.flDO!=0){
System.out.println(m.s20+":                             "+f.flDO+" units         Rs"+r.rateDO);
}
if(f.flID!=0){
System.out.println(m.s21+":                             "+f.flID+" units         Rs"+r.rateID);
}
if(f.flCB!=0){
System.out.println(m.s22+":                             "+f.flCB+" units         Rs"+r.rateCB);
}
}
}
//
//
//
//this class is for making an order loop------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//
//
class Nexbil{
BufferedReader cr=new BufferedReader(new InputStreamReader(System.in));
String s;
String ins;
char choice;
menu m=new menu();
flag f=new flag();
Enter e=new Enter();
ordering or=new ordering();
double bil;
Biller b=new Biller();
Billprinter bp=new Billprinter();
void nextbill() throws IOException{
System.out.println("Press 's' for next order OR 'b' for producing bill");
try{
ins=cr.readLine();
choice=ins.charAt(0);
if(choice=='s'){
e.entry();
}
if(choice=='b'){
bil=b.bill();
bp.printbill();
System.out.println("Your Basic Bill is:           Rs"+bil);
double vat=12.5;
System.out.println("Vat is:                       Rs"+(bil*vat)/100);
bil=bil+((bil*vat)/100);
System.out.println("Your Total Bill is:           Rs"+bil);
}
}catch(IOException e){
System.out.println("Output/Input Error");
}
}
}
//
//
//
//This class shows menu to user----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//
//
class Enter{
BufferedReader cr=new BufferedReader(new InputStreamReader(System.in));
String s;
String ins;
char choice;
menu m=new menu();
flag f=new flag();
ordering or=new ordering();
void entry() throws IOException{
System.out.println("Press 1 for Dinner menu,2 for Ice Cream Menu,3 for Junk Food Menu");
try{
ins=cr.readLine();
choice=ins.charAt(0);
if(choice=='1'){
m.printmenu1();
f.fl=1;}
if(choice=='2')
{m.printmenu2();
f.fl=2;}
if(choice=='3')
{m.printmenu3();
f.fl=3;}
Nexbil nb=new Nexbil();
System.out.println("So,would u like to order something.(Press 'y' for yes OR any other key to SKIP)");
ins=cr.readLine();
choice=ins.charAt(0);
if(choice=='y')
{
System.out.println("Ok");
or.orderprinter();
or.order();
}
System.out.print("Would u like to have Chappaties(Press 'y'=YES and for CANCEL=any other key)");
ins=cr.readLine();
choice=ins.charAt(0);
if(choice=='y'){
m.chappatymenu();
or.orderchappaty();
nb.nextbill();
}
else{
nb.nextbill();
}
}catch(IOException e){
System.out.println("Input Error");
}
}
}






