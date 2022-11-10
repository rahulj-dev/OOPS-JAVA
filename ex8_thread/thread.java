import java.util.*;
class ThreadA extends Thread{
Scanner s = new Scanner(System.in);
Random r = new Random();
public void run(){
int i,n,r1;
n=s.nextInt();
for(i=0;i<n;i++){
r1=r.nextInt(10);
if(r1%2==0){
ThreadB b=new ThreadB(r1);
b.start();
}
else{
ThreadC c=new ThreadC(r1);
c.start();
}
try{
Thread.sleep(1000);
}catch(InterruptedException ex){
System.out.println(ex);
}
}
}
}
class ThreadB extends Thread{
int x;
ThreadB(int l){
x=l;
}
public void run(){
System.out.println("Number : "+x+" Square : "+(x*x));
}
}
class ThreadC extends Thread{
int x;
ThreadC(int l){
x=l;
}
public void run(){
System.out.println("Number : "+x+" Cube : "+(x*x*x));
}
}
class main{
public static void main(String args[]){
ThreadA a=new ThreadA();
a.start();
}
}