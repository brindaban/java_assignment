import java.io.*;

public class CopyFile {
   public static void main(String args[]){
      File file = new File("input.txt");
      String content = null;
      try {
        FileReader reader = new FileReader(file);
        char []item = new char[(int) file.length()];
        reader.read(item);
        content = new String(item);
        reader.close();
      }
      catch(IOException e){
         e.printStackTrace();
      }
      System.out.println(content);
   //    FileInputStream in = null;
   //    FileOutputStream out = null;
   //
   //    try {
   //       in = new FileInputStream("input.txt");
   //       out = new FileOutputStream("out.txt");
   //
   //       int c;
   //       while ((c = in.read()) != -1) {
   //          out.write(c);
   //       }
   //    }finally {
   //       if (in != null) {
   //          in.close();
   //       }
   //       if (out != null) {
   //          out.close();
   //       }
   //    }
   }
}
