package com.bravedroid.code_reuse.problem1.after;


import java.util.HashMap;

public class Main {
    private HashMap<Integer, Action> hashmapMonthAction;

    public Main() {
        hashmapMonthAction=new HashMap<>();

        hashmapMonthAction.put(1, new Algo1());
        hashmapMonthAction.put(1, new Algo1());
        hashmapMonthAction.put(1, new Algo1());

        hashmapMonthAction.put(2, new Algo2());
        hashmapMonthAction.put(2, new Algo2());
        hashmapMonthAction.put(2, new Algo2());

        hashmapMonthAction.put(3, new Algo3());
        hashmapMonthAction.put(3, new Algo3());
        hashmapMonthAction.put(3, new Algo3());

        hashmapMonthAction.put(4, new Algo4());
        hashmapMonthAction.put(4, new Algo4());
        hashmapMonthAction.put(4, new Algo4());
    }

    void treatAllCases(int monthNumber) {
        hashmapMonthAction.get(monthNumber).doAlgo();
    }

    interface Action {
        void doAlgo();
    }

    private static class Algo1 implements Action {
        @Override
        public void doAlgo() {
            doAlgo1();
        }
    }

    private static class Algo2 implements Action {
        @Override
        public void doAlgo() {
            doAlgo2();
        }
    }

    private static class Algo3 implements Action {
        @Override
        public void doAlgo() {
            doAlgo3();
        }
    }

    private static class Algo4 implements Action {
        @Override
        public void doAlgo() {
            doAlgo4();
        }
    }

    private static void doAlgo1() {
    }

    private static void doAlgo2() {
    }

    private static void doAlgo3() {
    }

    private static void doAlgo4() {
    }
}
