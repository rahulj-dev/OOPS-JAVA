import java.io.*;
import java.nio.file.Files;
public class GetFileInfo {
public static void main(String[] args) {
File myObj = new File("GetFileInfo.java");
if (myObj.exists()) {
String fileType="Undetermined";
String extension="";
String fileName = myObj.getName();
System.out.println("File Name: " + fileName);
int i=fileName.lastIndexOf('.');
if(i>0){
extension=fileName.substring(i+1);
}
try{
fileType=Files.probeContentType(myObj.toPath());
}
catch(IOException ioException){
System.out.println("Cannot determine the type "+ ioException);
}
System.out.println("File Type: "+extension);
System.out.println("Writeable: " + myObj.canWrite());
System.out.println("Readable " + myObj.canRead());
System.out.println("Length of the file in bytes " + myObj.length());
}
else{
System.out.println("The file does not exist.");
}
}
}