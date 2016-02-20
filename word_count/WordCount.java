import java.io.*;


class WordCount{
    public static void main(String[] args) {
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

        WcFacilities myFacility = new WcFacilities(content);

        System.out.println("char -> "+myFacility.noOfChar());
        System.out.println("line -> "+myFacility.noOfLine());
        System.out.println("word -> "+myFacility.noOfWord());


    }
}
