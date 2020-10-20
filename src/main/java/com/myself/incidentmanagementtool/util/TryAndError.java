package com.myself.incidentmanagementtool.util;

public class TryAndError {
    int[] myNumbers = {1, 2, 3};

    public void verwalteKlasse(){
        tryAndCatch();
    }

    public void tryAndCatch(){
        try {
            /*System.out.println(myNumbers[10]); // gives an Error cause index 10 is out of range*/
            Integer myInt = 100;
            String myString = myInt.toString();
            System.out.println(myInt.toString().length());
        }catch(Exception exception) {
            System.out.println(exception);
        }
    }
}
