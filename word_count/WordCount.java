import java.io.*;


class WordCount{
    public static void main(String[] args) {
        String givenFile = args[0];
        WcFacilities myFacility = new WcFacilities(givenFile);

        if(args.length == 1)
            System.out.println("\t"+myFacility.noOfLine()+"\t"+myFacility.noOfWord()+"\t"+myFacility.noOfChar()+" "+givenFile);
    }
}
