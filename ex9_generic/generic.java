import java.util.*;
public class generic{
public static <T extends Comparable<T>> T max(T n1,T n2){
T max=n1;
if(n2.compareTo(max)>0)
max=n2;
return max;
}
public static void main(String args[]){
generic g=new generic();
int a,b,c;
Scanner s = new Scanner(System.in);
System.out.println("Enter the first number : ");
a=s.nextInt();
System.out.println("Enter the second number : ");
b=s.nextInt();
c=g.<Integer>max(a,b);
System.out.println("Maximum is : "+c);
}
}
