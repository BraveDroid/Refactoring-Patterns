package com.bravedroid.code_reuse.problem1.before;

public class Main {
    void treatAllCases(int monthNumber) {
        switch (monthNumber) {
            case 1:
            case 2:
            case 3:
                doAlgo1();
                break;
            case 4:
            case 5:
            case 6:
                doAlgo2();
                break;
            case 7:
            case 8:
            case 9:
                doAlgo3();
                break;
            case 10:
            case 11:
            case 12:
                doAlgo4();
                break;

        }

    }

    private void doAlgo1() {}
    private void doAlgo2() {}
    private void doAlgo3() {}
    private void doAlgo4() {}
}
