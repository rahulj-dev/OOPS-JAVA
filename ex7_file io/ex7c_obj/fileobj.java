import java.io.*;
class  student implements Serializable
{
String name = "Suresh";
String roll = "9204";
}
class fileobj
{
public static void main(String arg[]) throws Exception
{
File file = new File("file1.txt");
ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));
student s1=new student();
oos.writeObject(s1.name);
//oos.writeObject(s1.roll);
oos.close();
/*ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
student s=(student)ois.readObject();
ois.close();
System.out.println(s);*/
}
}