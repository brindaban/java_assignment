class WcFacilities{
    private final String content;

    public WcFacilities(String fileContent){
        this.content = fileContent;
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
