class Split {

    public static void main(String[] args) {

        String text = "Java,Python,React";

        String[] languages = text.split(",");

        for (String language : languages) {
            System.out.println(language);
        }
    }
}