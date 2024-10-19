package сhancellery.pen;

import сhancellery.Chancellery;

public class Pen extends Chancellery {
    private Refill refill;
    private Corpus corpus;

    public Pen (String firm, double price, Refill refill, Corpus corpus) {
        this.firm = firm;
        this.price = price;
        this.refill = refill;
        this.corpus = corpus;
    }

    public Refill getRefill() {
        return refill;
    }

    public Corpus getCorpus() {
        return corpus;
    }

    public void printInfo() {
        System.out.printf("Фирма ручки: %s\nЦена ручки: %f\nТолщина стержня: %f\nЦвет Стержня: %s\n" +
                        "Толщина корпуса: %d\nДлина Корпуса: %d\nЦвет корпуса: %s\nНаличие колпочка: %s\nМатериал корпуса: %s\n",
                firm, price, refill.refillWidth, refill.refillColor, corpus.corpusWidth, corpus.corpusLength,
                corpus.corpusColor, corpus.containsCap, corpus.corpusMaterial);
    }
}