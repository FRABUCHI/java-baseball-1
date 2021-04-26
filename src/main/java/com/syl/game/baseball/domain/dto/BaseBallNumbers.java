package com.syl.game.baseball.domain.dto;

public class BaseBallNumbers {
    private int first;
    private int second;
    private int third;

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getThird() {
        return third;
    }

    public void setThird(int third) {
        this.third = third;
    }

    public boolean validateNumber(int number) {
        boolean result = false;
        if ( 1<= number && number <= 9 ) {
            result = true;
        }
        return result;
    }

    public int countStrike(BaseBallNumbers inputNumbers) {
        int count = 0;
        if ( compareFirst(inputNumbers.getFirst()) ) count += 1;
        if ( compareSecond(inputNumbers.getSecond()) ) count += 1;
        if ( compareThird(inputNumbers.getThird()) ) count += 1;
        return count;
    }

    public int countBall(BaseBallNumbers inputNumbers) {
        int count = 0;
        if ( !compareFirst(inputNumbers.getFirst()) && ( compareSecond(inputNumbers.getFirst()) || compareThird(inputNumbers.getFirst()) ) ) count += 1;
        if ( !compareSecond(inputNumbers.getSecond()) && ( compareFirst(inputNumbers.getSecond()) || compareThird(inputNumbers.getSecond()) ) ) count += 1;
        if ( !compareThird(inputNumbers.getThird()) && ( compareFirst(inputNumbers.getThird()) || compareSecond(inputNumbers.getThird()) ) ) count += 1;
        return count;
    }

    public int checkNothing(BaseBallNumbers inputNumbers) {
        int count = 0;
        if ( !compareFirst(inputNumbers.getFirst()) && !compareSecond(inputNumbers.getFirst()) && !compareThird(inputNumbers.getFirst()) ) count += 1;
        if ( !compareFirst(inputNumbers.getSecond()) && !compareSecond(inputNumbers.getSecond()) && !compareThird(inputNumbers.getSecond()) ) count += 1;
        if ( !compareFirst(inputNumbers.getThird()) && !compareSecond(inputNumbers.getThird()) && !compareThird(inputNumbers.getThird()) ) count += 1;
        return count;
    }

    public boolean compareFirst(int num) {
        return first == num;
    }

    public boolean compareSecond(int num) {
        return second == num;
    }

    public boolean compareThird(int num) {
        return third == num;
    }
}
