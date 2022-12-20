package Lab5;



public class Word extends SentenceMember {
    private Letter[] letters;

    public Word(String x) {
        char[] chars = x.toCharArray();
        this.letters = new Letter[x.length()];
        for (int i = 0; i < chars.length; i++) {
            this.letters[i] = new Letter(chars[i]);
        }
    }
    @Override
    public String toString() {
        StringBuilder wordString = new StringBuilder();
        for (Letter letter : letters) {
            wordString.append(letter);
        }
        return wordString.toString();
    }
}
