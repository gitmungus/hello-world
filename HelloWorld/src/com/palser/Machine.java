package com.palser.stuff;

public class Machine {

    public static  String ISON;
    public static  String ISOFF;

    public boolean C_OFF0= true;

    protected boolean isOn;
    protected boolean code;

    public void turnOn(boolean isOn) {

        this.isOn = isOn;
    }


}


