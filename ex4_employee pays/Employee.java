import java.util.*;
class Employee{
String Emp_name;
int Emp_id;
String address;
String mailID;
long mobileNumber;
double da,hra,pf,sc,ns,gs;
Scanner s=new Scanner(System.in);
void empdetails(){
System.out.println("Enter the Employee Name : ");
Emp_name=s.nextLine();
System.out.println("Enter the Employee Address : ");
address=s.nextLine();
System.out.println("Enter the Employee MailID : ");
mailID=s.nextLine();
System.out.println("Enter the Employee ID : ");
Emp_id=s.nextInt();
System.out.println("Enter the Employee Mobile Number : ");
mobileNumber=s.nextLong();
}
void display(){
System.out.println("Employee Name : "+Emp_name);
System.out.println("Employee ID : "+Emp_id);
System.out.println("Employee Address : "+address);
System.out.println("Employee Mail ID : "+mailID);
System.out.println("Employee Mobile Number : "+mobileNumber);
}
}
class Programmer extends Employee{
public void grosspay(double x){
empdetails();
display();
da=x*0.97;
hra=x*0.1;
pf=x*0.12;
sc=x*0.01;
gs=x+da+hra;
ns=gs-pf-sc;
System.out.println("Grosspay : "+gs);
System.out.println("Netpay : "+ns);
}
}
class AssistantProfessor extends Employee{
public void grosspay(double x){
empdetails();
display();
da=x*1.10;
hra=x*0.2;
pf=x*0.12;
sc=x*0.05;
gs=x+da+hra;
ns=gs-pf-sc;
System.out.println("Grosspay : "+gs);
System.out.println("Netpay : "+ns);
}
}
class AssociateProfessor extends Employee{
public void grosspay(double x){
empdetails();
display();
da=x*1.30;
hra=x*0.3;
pf=x*0.12;
sc=x*0.1;
gs=x+da+hra;
ns=gs-pf-sc;
System.out.println("Grosspay : "+gs);
System.out.println("Netpay : "+ns);
}
}
class Professor extends Employee{
public void grosspay(double x){
empdetails();
display();
da=x*1.40;
hra=x*0.4;
pf=x*0.12;
sc=x*0.15;
gs=x+da+hra;
ns=gs-pf-sc;
System.out.println("Grosspay : "+gs);
System.out.println("Netpay : "+ns);
}
}
class main{
public static void main(String args[]){
double bpay;
Scanner s=new Scanner(System.in);
System.out.println("Enter Basic Pay value : ");
bpay=s.nextDouble();
if(bpay>=15000 && bpay<=20000.0){
Programmer p=new Programmer();
p.grosspay(bpay);
}
else if(bpay>=20001 && bpay<=30000){
AssistantProfessor as=new AssistantProfessor();
as.grosspay(bpay);
}
else if(bpay>=30001 && bpay<=40000){
AssociateProfessor ap=new AssociateProfessor();
ap.grosspay(bpay);
}
else if(bpay>40000){
Professor pf=new Professor();
pf.grosspay(bpay);
}
else{
System.out.println("Invalid");
}
}
}



