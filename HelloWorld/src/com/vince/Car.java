package com.vince;

public class Car {

    public Engine engine = new Engine(2000);


    public String toString() {

        return "This is a CAR!";
    }

    /**
     * @param copies
     */
    public void print(int copies) {

        switch (copies) {
            case 0: System.out.println("One copy");
            case 1: System.out.println("Two copies");
            case 10: System.out.println("Ten copies");
            case 8: System.out.println("Eight copies");
            default : System.out.println("BOLLOX");
        }
    }
}
