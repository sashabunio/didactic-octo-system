package сhancellery.pen;

public class Corpus {
        int corpusWidth;
        int corpusLength;
        String corpusColor;
        boolean containsCap;
        String corpusMaterial;

        public Corpus(int corpusWidth, int corpusLength, String corpusColor, boolean containsCap,
                      String corpusMaterial) {
            this.corpusWidth = corpusWidth;
            this.corpusLength = corpusLength;
            this.corpusColor = corpusColor;
            this.containsCap = containsCap;
            this.corpusMaterial = corpusMaterial;
        }
}
