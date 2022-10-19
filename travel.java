import java.util.Scanner;
class train
{
public int tno,noseat,price;
public String tname,ststation,endstation,sttime,endtime;
public void input()
{
Scanner sc1=new Scanner(System.in);
Scanner sc2=new Scanner(System.in);
System.out.println("enter train number");
tno=sc1.nextInt();
System.out.println("enter train name");
tname=sc2.nextLine();
System.out.println("enter the start station");
ststation=sc2.nextLine();
System.out.println("enter the end station");
endstation=sc2.nextLine();
System.out.println("enter the start time");
sttime=sc2.nextLine();
System.out.println("enter the destination time");
endtime=sc2.nextLine();
System.out.println("enter no of seat");
noseat=sc1.nextInt();
System.out.println("enter price of each seat");
price=sc1.nextInt();
}
public void display()
{
System.out.println(tno+"\t"+tname+"\t"+ststation+"\t"+endstation+"\t"+sttime+"\t"+endtime+"\t"+noseat+"\t"+price);
}
public void update()
{
Scanner sc3=new Scanner(System.in);
Scanner sc4=new Scanner(System.in);
int choice;
System.out.println("1.to update price\n2.to update source\n3.to update destination\n4.to update number of seats");
System.out.println("enter your choice:");
choice=sc3.nextInt();
switch(choice)
{
case 1:
System.out.println("enter new price");
price=sc3.nextInt();
break;
case 2:
System.out.println("enter new source");
ststation=sc4.nextLine();
break;
case 3:
System.out.println("enter new destination");
endstation=sc4.nextLine();
break;
case 4:
System.out.println("enter new price");
price=sc3.nextInt();
break;
default:
System.out.println("wrong choice");
}
}
}
class admintrain
{

train t[];
int tc;
admintrain()
{
t=new train[1000];
for(int i=0;i<1000;i++)
{
t[i]=new train();
}
tc=0;
}
public void trainjob()
{
System.out.println("1.to add new train\n2.to book ticket\n3.to cancel ticket\n4.to update train information");
int choice;
Scanner sc=new Scanner(System.in);
choice=sc.nextInt();
switch(choice)
{
case 1:
t[tc].input();
tc++;
break;
case 2:
int tn;
int i;
System.out.println("enter the train number");
tn=sc.nextInt();
for(i=0;i<tc;i++)
{
if(tn==t[i].tno)
break;
}
if(i>=tc)
System.out.println("wrong train number");
else
{
System.out.println("enter number of ticket to be booked");
int tt=sc.nextInt();
if(tt>t[i].noseat)
System.out.println("booking not possible");
else
{
int tprice=tt*t[i].price;
t[i].noseat=t[i].noseat-tt;
System.out.println("total price="+tprice);
}
}
break;
case 3:
int ct;
int ctn;
int j;
System.out.println("enter train number");
ctn=sc.nextInt();
for(j=0;j<tc;j++)
{
if(ctn==t[j].tno)
break;
}
if(j>=tc)
System.out.println("wrong train number");
else
{
System.out.println("enter no ofseats to be cancelled");
ct=sc.nextInt();
t[j].noseat+=ct;
}
break;
case 4:
int k;
int tttn;
System.out.println("enter the train no");
tttn=sc.nextInt();
for(k=0;k<tc;k++)
{
if(tttn==t[k].tno)
break;
}
if(k>=tc)
System.out.println("wrong train number");
else
t[k].update();
break;
default:
System.out.println("wrong choice");
}
}
}
class bus
{
public int tno,noseat,price;
public String tname,ststation,endstation,sttime,endtime;
public void input()
{
Scanner sc1=new Scanner(System.in);
Scanner sc2=new Scanner(System.in);
System.out.println("enter bus number");
tno=sc1.nextInt();
System.out.println("enter bus name");
tname=sc2.nextLine();
System.out.println("enter the start station");
ststation=sc2.nextLine();
System.out.println("enter the end station");
endstation=sc2.nextLine();
System.out.println("enter the start time");
sttime=sc2.nextLine();
System.out.println("enter the destination time");
endtime=sc2.nextLine();
System.out.println("enter no of seat");
noseat=sc1.nextInt();
System.out.println("enter price of each seat");
price=sc1.nextInt();
}
public void display()
{
System.out.println(tno+"\t"+tname+"\t"+ststation+"\t"+endstation+"\t"+sttime+"\t"+endtime+"\t"+noseat+"\t"+price);
}
public void update()
{
Scanner sc3=new Scanner(System.in);
Scanner sc4=new Scanner(System.in);
int choice;
System.out.println("1.to update price\n2.to update source\n3.to update destination\n4.to update number of seats");
System.out.println("enter your choice:");
choice=sc3.nextInt();
switch(choice)
{
case 1:
System.out.println("enter new price");
price=sc3.nextInt();
break;
case 2:
System.out.println("enter new source");
ststation=sc4.nextLine();
break;
case 3:
System.out.println("enter new destination");
endstation=sc4.nextLine();
break;
case 4:
System.out.println("enter new price");
price=sc3.nextInt();
break;
default:
System.out.println("wrong choice");
}
}
}
class adminbus
{

bus t[];
int tc;
adminbus()
{
t=new bus[1000];
for(int i=0;i<1000;i++)
{
t[i]=new bus();
}
tc=0;
}
public void busjob()
{
System.out.println("1.to add new bus\n2.to book ticket\n3.to cancel ticket\n4.to update bus information");
int choice;
Scanner sc=new Scanner(System.in);
choice=sc.nextInt();
switch(choice)
{
case 1:
t[tc].input();
tc++;
break;
case 2:
int i;
int tn;
System.out.println("enter the bus number");
tn=sc.nextInt();
for(i=0;i<tc;i++)
{
if(tn==t[i].tno)
break;
}
if(i==tc)
System.out.println("wrong bus number");
else
{
System.out.println("enter number of ticket to be booked");
int tt=sc.nextInt();
if(tt>t[i].noseat)
System.out.println("booking not possible");
else
{
int tprice=tt*t[i].price;
t[i].noseat=t[i].noseat-tt;
System.out.println("total price="+tprice);
}
}
break;
case 3:
int j;
int ct;
int ctn;
System.out.println("enter bus number");
ctn=sc.nextInt();
for(j=0;j<tc;j++)
{
if(ctn==t[j].tno)
break;
}
if(j==tc)
System.out.println("wrong bus number");
else
{
System.out.println("enter no of seats to be cancelled");
ct=sc.nextInt();
t[j].noseat+=ct;
}
break;
case 4:
int k;
int tttn;
System.out.println("enter the bus no");
tttn=sc.nextInt();
for(k=0;k<tc;k++)
{
if(tttn==t[k].tno)
break;
}
if(k==tc)
System.out.println("wrong bus number");
else
t[k].update();
break;
default:
System.out.println("wrong choice");
}
}
}
class travel
{
public static void main(String args[])
{
int pass;
adminbus ab=new adminbus();
admintrain at=new admintrain();
Scanner sc=new Scanner(System.in);
int choice1=1,choice2;
System.out.println("enter the password");
pass=sc.nextInt();
if(pass!=12345)
System.out.println("wrong password");
else
{
while(choice1==1)
{
System.out.println("1.for train system\n2.for bus system");
choice2=sc.nextInt();
if(choice2==1)
at.trainjob();
else
if(choice2==2)
ab.busjob();
else
System.out.println("wrong choice");
System.out.println("want to continue(1/0)?");
choice1=sc.nextInt();
}
}
}
}