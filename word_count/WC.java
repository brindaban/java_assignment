import java.io.*;

class WC{
    public static void main(String[] args) {
        String givenFile = args[0];
        File file = new File(givenFile);
        String fileContent = null;
        try {
            FileReader reader = new FileReader(file);
            char []item = new char[(int) file.length()];
            reader.read(item);
            fileContent = new String(item);
            reader.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

        WcUtil myContentFacility = new WcUtil(fileContent);
        System.out.println(myContentFacility.countChar()+"  "+myContentFacility.countWord()+"  "+myContentFacility.countLine());
    }
}
