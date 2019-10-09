package jp.co.bizreach.training.tdd.demo;

public class Franc {
    private int amount;

    // TODO yuta.doi DollarとFrancの重複 (2019/09/18)
    Franc(int amount) {
        this.amount = amount;
    }

    // TODO yuta.doi timesの一般化 (2019/09/18)
    Franc times(int multiplier){
        return new Franc(amount * multiplier);
    }

    // TODO yuta.doi equalsの一般化 (2019/09/18)
    public boolean equals(Object obj){
        Franc franc = (Franc) obj;
        return amount == franc.amount;
    }
}
