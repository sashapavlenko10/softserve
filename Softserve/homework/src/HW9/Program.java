package HW9;
import java.io.*;

public class Program {
 
    public static void main(String[] args) {
        
        try(FileWriter writer = new FileWriter("E:/a/homework/src/HW9/notes.txt", true))
        {
           
            String text = "Hello World!";
            writer.write(text);
 
            writer.append('\n');
            writer.append('E');
             
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    } 
}