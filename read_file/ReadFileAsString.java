class ReadFileAsString {
    public static void main(String[] args) {
        String content = readFile("input.txt", defaultCharset());
        System.out.println(content);
    }
}
