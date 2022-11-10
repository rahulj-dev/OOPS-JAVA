import java.lang.*;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
class lowercase
{
public static void main(String args[]) throws IOException
{
try
{
FileReader reader = new FileReader("filename.txt");
FileWriter writer = new FileWriter("filename.txt", true);
int character=' ';
char m;
while ((character = reader.read()) != -1)
{
m=Character.toLowerCase((char)character);
System.out.print(m);
writer.write(m);
}
reader.close();
writer.close();
}
catch (IOException e)
{
e.printStackTrace();
}
}
}