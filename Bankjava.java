package test;
import java.util.*;
//import java.lang.Math;
import java.io.*;
public class BankJava

{
int balance;
int previoustransaction;
String customername;
int customerid;
Scanner scanner=new Scanner(System.in);
BankJava( String cname,int cid)
{
customername=cname;
customerid=cid;
}
void deposit(int amount)
{ int depositid;
System.out.println("enter the id");
depositid=scanner.nextInt();
if(depositid==customerid)
{
if(amount!=0&&amount>=100)
{
balance = balance+amount;
previoustransaction = amount;
System.out.println("DEPOSITED SUCCESFULLY");


}
else
{
System.out.println("enter the correct amount");
}
}
else
{
System.out.println("INVALID ID");
}
}
void withdraw(int amount)
{
int withdrawid;
System.out.println("Enter the id");
withdrawid=scanner.nextInt();
if(withdrawid==customerid)
{
if(amount!=0&&amount<=balance)
{
balance = balance-amount;
previoustransaction =-amount;
System.out.println("withdrawed succesfully");
}
else {
System.out.println("please enter the appropriate amount");
}}
else {
System.out.println("invalid id");


}
}
void getprevioustransaction()
{
if(previoustransaction>0)
{
System.out.println("Deposited :" +previoustransaction);
}
else if(previoustransaction<0)
{
System.out.println("withdrawn :"+ Math.abs(previoustransaction));
}
else
{
System.out.println("no transaction record");
}
}
void setpwd()
{
int pwd1,pwd2;
System.out.println("enter your previous password");
pwd1=scanner.nextInt();
if(pwd1>9999)
{
System.out.println(" enter 4 digits password only ");

}
else
{
System.out.println(" enter your new password");


pwd2=scanner.nextInt();
if(pwd1==pwd2)
{
System.out.println("your previous and new password both are same");
}
else
{
System.out.println("your new password saved");
}
}
}
void showmenu()
{
char option='\0';
Scanner sc=new Scanner(System.in);
System.out.println("________________welcome " +customername +"_____________________");
System.out.println("\n");
System.out.println("A. checkbalance");
System.out.println("B. deposit");
System.out.println("C. withdraw");
System.out.println("D. previoustransaction");
System.out.println("E. exit");
System.out.println("S. setpassword");

do
{


System.out.println("========================================================");
System.out.println("enter an option");
System.out.println("==========================================================");
option=sc.next().charAt(0);
System.out.println("\n");

switch(option)
{
case 'A':

System.out.println("----------------------------------------------------------");
System.out.println("Balance =" +balance);
System.out.println("----------------------------------------------------");
System.out.println("\n");
break;
case 'B':
System.out.println("----------------------------------------------------");
System.out.println("enter amount to deposit");
System.out.println("amount should be greater than 100");
System.out.println("----------------------------------------------------");
int amount=sc.nextInt();
deposit(amount);
System.out.println("\n");
break;
case 'C':
System.out.println("----------------------------------------------------");
System.out.println("enter amount to with draw");
System.out.println("----------------------------------------------------");
int amount2=sc.nextInt();
withdraw(amount2);
System.out.println("\n");
break;
case 'D':
System.out.println("----------------------------------------------------");
getprevioustransaction();
System.out.println("----------------------------------------------------");
System.out.println("\n");
break;
case 'S':
System.out.println("---------------------------------------------------");
setpwd();
System.out.println("----------------------------------------------------");
System.out.println("\n");

case 'E':
System.out.println("----------------------------------------------------");
break;
default :
System.out.println("Invaild option!!1 .please enter again");
break;
}
}while(option!='E');

System.out.println("Thankyou for using our services");
}
}
