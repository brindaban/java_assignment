import java.io.*;

class WC{
    public static void main(String[] args) throws IOException,FileNotFoundException {
        int[] storage = {0,0,0};
        for (int count =0;count<args.length ;count++ ) {
            if((args[0].equals("-l")||args[0].equals("-c")||args[0].equals("-w")) && count==0) count=1;
            String givenFile = args[count];
            File file = new File(givenFile);
            String fileContent = null;
            // try {
            FileReader reader = new FileReader(file);
            char []item = new char[(int) file.length()];
            reader.read(item);
            fileContent = new String(item);
            reader.close();
            // }
            // catch(IOException e){
                // e.printStackTrace();
            // }

            WcUtil myContentFacility = new WcUtil(fileContent);
            if(args[0].equals("-l"))
                System.out.println("\t"+myContentFacility.countLine()+" "+givenFile);
            else if(args[0].equals("-w"))
                System.out.println("\t"+myContentFacility.countWord()+" "+givenFile);
            else if(args[0].equals("-c"))
                System.out.println("\t"+myContentFacility.countChar()+" "+givenFile);
            else
                System.out.println(myContentFacility.giveAllInformation()+" "+givenFile);
            storage[0] += myContentFacility.countLine();
            storage[1] += myContentFacility.countWord();
            storage[2] += myContentFacility.countChar();

        }
        if(args[0].equals("-l"))
            System.out.println("\t"+storage[0]+" Total");
        else if(args[0].equals("-w"))
            System.out.println("\t"+storage[1]+" Total");
        else if(args[0].equals("-c"))
            System.out.println("\t"+storage[2]+" Total");
        else
            System.out.println("\t"+storage[0]+"\t"+storage[1]+"\t"+storage[2]+" Total");
    }
}
