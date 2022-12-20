package Lab5;

public class Punctuation extends SentenceMember {
    private final String symbolpunct;

    public Punctuation(String symbolpunct) {

        this.symbolpunct = symbolpunct;
    }

    @Override
    public String toString() {
        return this.symbolpunct;
    }
}
