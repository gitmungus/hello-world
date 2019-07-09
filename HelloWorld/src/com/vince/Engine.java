package com.vince;

import java.util.StringTokenizer;

public class Engine {

    private static int cc;

    public String toString(){

        return "This is an ENGINE";
    }

    private void setSize(int ccSize) {
        ccsize = ccSize;
    }
    public int ccsize;

    Engine(int ccSize) {
        setSize(ccSize);
        cc = ccSize;
    }
}
