package src;

import java.io.*;

class WcFacilities{
    private final String content;

    public WcFacilities(String fileName){
        this.content = getFileContents(fileName);
    }

    private String getFileContents(String givenFile){
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
        return fileContent;
    }

    public int noOfChar(){
        return content.length();
    }

    public int noOfLine(){
        int count = 0;
        for(int index = 0; index<content.length(); index++){
            if(content.charAt(index)=='\n')
                count++;
        }
        return count;
    }

    public int noOfWord(){
        int count = 0;
        for(int index = 0; index<content.length(); index++){
            if(content.charAt(index)==' ')
                count++;
        }
        return count + noOfLine();
    }
}
