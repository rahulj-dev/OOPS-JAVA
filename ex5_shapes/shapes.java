import java.util.*;
abstract class shapes
{
int len,br;
shapes(int l1,int b1)
{
len = l1;
br = b1;
}
abstract void printarea();
}
class rectangle extends shapes
{
rectangle(int l,int b)
{
super(l,b);
}
void printarea()
{
System.out.println("area of rectangle :"+len * br);
}
}
class triangle extends shapes
{
triangle(int l,int b)
{
super(l,b);
}
void printarea()
{
System.out.println("area of triangle :"+0.5*(len * br));
}
}

class circle extends shapes
{
circle(int l,int b)
{
super(l,1);
}
void printarea()
{
System.out.println("area of circle :"+(3.14*len*len));
}
}





class demo
{
public static void main(String []arg)
{

Scanner s = new Scanner(System.in);
rectangle re = new rectangle(2,4);
triangle tr = new triangle(2,4);
circle c = new circle(2,4);
re.printarea();

tr.printarea();
c.printarea();
}

}
