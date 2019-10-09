package jp.co.bizreach.training.tdd.demo;

public class Leapyear {
    public boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
