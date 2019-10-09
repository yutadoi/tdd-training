package jp.co.bizreach.training.tdd.demo;

public class Factorial {

    public int calculate(int inputValue) {
        if (inputValue == 0 || inputValue > 10)
            return -1;

        int ans = 1;
        for (int i = 2 ; i <= inputValue ; i++){
            ans *= i;
        }
        return ans;
    }
}
