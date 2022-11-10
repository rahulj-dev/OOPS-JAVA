import java.util.*; 					
interface stack{				      
    void push(int data);
    void pop();
    void disp();
    boolean isEmpty();
    boolean isFull();
}
class isFull extends Exception{
public isFull(String s){
super(s);
}
}
class isEmpty extends Exception{
public isEmpty(String s){
super(s);
}
}
class inter implements stack{
    int top=-1;
    int elements[]=new int[5];
    public boolean isFull(){
        if(top==elements.length-1)
            return true;
        else
            return false;
    }
    public boolean isEmpty(){
        if(top==-1)
            return true;
        else
            return false;
    }
    public void push(int data){
    try{
        if(!isFull())
            elements[++top]=data;
        else
            throw new isFull("Stack is Full");
        }
        catch(isFull e){
        System.out.println("Exception : "+e);
        }
    }
    public void pop(){
    try{
        if(!isEmpty())
            top--;
        else
            throw new isEmpty("Stack is Empty");
        }
        catch(isEmpty e){
            System.out.println("Exception : "+e);
        }}
    public void disp(){
	try{
        if(!isEmpty()){
			System.out.println("The elements are: ");
            for(int i=0;i<=top;i++){
                System.out.println(elements[i]);
            }
        }
        else
            throw new isEmpty("Stack is Empty");
        }
        catch(isEmpty e){
        System.out.println("Exception : "+e);
        }}}
class main{
public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    inter i=new inter();
    int ch,data;
	System.out.println("ARRAY STACK");      
	System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit\n");
	System.out.println("Enter ur choice:");
    ch=s.nextInt();
    while(ch<4){
    switch(ch){
    case 1:
        System.out.println("Enter the value to push:");
        data=s.nextInt();
        i.push(data);
        break;
    case 2:
        i.pop();
        break;
    case 3:
        i.disp();
        break;
}
System.out.println("Enter your choice : \n1.Push\n2.Pop\n3.Display\n4.Exit");
    ch=s.nextInt();
}}}
