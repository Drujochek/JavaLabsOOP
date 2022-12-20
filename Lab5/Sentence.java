package Lab5;

public class Sentence {
    private SentenceMember[] sentenceMembers;
    public Sentence(String sent) {
        String[] sentenceSplit = sent.split("(?=[,.!?])|\\s");
        sentenceMembers = new SentenceMember[sentenceSplit.length];
        for (int i = 0; i < sentenceSplit.length; i++) {
            String sentenceVar = sentenceSplit[i];
            if (sentenceVar.matches("(?=[,.!?])|\\s")) {
                sentenceMembers[i] = new Punctuation(sentenceSplit[i]);
            } else {
                sentenceMembers[i] = new Word(sentenceSplit[i]);
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder sentencelast = new StringBuilder();
        for(int i=0 ; i < sentenceMembers.length;i++){
            if (sentenceMembers[i] instanceof Word){
                sentencelast.append(" ");
            }
            sentencelast.append(sentenceMembers[i].toString());
        }
        return sentencelast.toString();
    }
}

