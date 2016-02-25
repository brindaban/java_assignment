public class WcUtil {
    private final String content;

    public WcUtil(String fileContent) {
        this.content = fileContent;
    }

    public int countChar() {
        return content.length();
    }

    public int countLine() {
        return content.split("\n").length;
    }

    public int countWord() {
        return content.split("\\ ").length;
    }

    public String giveAllInformation() {
        return "\t" + countLine() + "\t" + countWord() + "\t" + countChar();
    }

}
