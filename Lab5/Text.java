package Lab5;

import java.util.Locale;

public class Text {
    private final Sentence[] sentences;

    public static int function(String var, String n) {
        int len = var.length();
        int len2 = var.replace(n, "").length();
        return len - len2;
    }

    public Text(String textString) {
        String[] array_sort = textString.split(" ");
        String n = "а";
        for (int i = array_sort.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (function(array_sort[j].toLowerCase(Locale.ROOT), n) > function(array_sort[j + 1].toLowerCase(Locale.ROOT), n)) {
                    String variable = array_sort[j];
                    array_sort[j] = array_sort[j + 1];
                    array_sort[j + 1] = variable;
                }
            }
        }
        String joined = String.join(" ", array_sort);
        String[] sentenceStrings = joined.split("(?<=[?.!])\\s?");
        this.sentences = new Sentence[sentenceStrings.length];
        for (int i = 0; i < sentenceStrings.length; i++) {
            this.sentences[i] = new Sentence(sentenceStrings[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder textStringBuilder = new StringBuilder();
        for (int i = 0; i < sentences.length - 1; i++) {
            textStringBuilder.append(sentences[i]).append(" ");
        }
        textStringBuilder.append(sentences[sentences.length - 1]);
        return textStringBuilder.toString();
    }
}
