package com.tw;

public class MultiplicationTable {
    public String create(int startNumber, int endNumber) {
        String multiplicationTable = "";
        boolean isInputInOrder = isInputInOrder(startNumber, endNumber);
        boolean isInputInRange = isInputInRange(startNumber, endNumber);

        for (int i = startNumber; i <= endNumber; i++) {
            for (int j = startNumber; j <= i; j++) {
                multiplicationTable += j + "*" + i + "=" + (j * i);

                if (i != j) {
                    multiplicationTable += "  ";
                }
            }
            multiplicationTable += "\r\n";
        }

        return isInputInOrder && isInputInRange ? multiplicationTable.trim(): null;
    }

    public boolean isInputInRange(int startNumber, int endNumber) {
        return (startNumber > 0 && startNumber <= 1000) && (endNumber > 0 && endNumber <= 1000);
    }

    public boolean isInputInOrder(int startNumber, int endNumber) {
        return startNumber <= endNumber;
    }

//    public static void main (String[]args) {
//        MultiplicationTable multiplicationTable = new MultiplicationTable();
//        System.out.println(multiplicationTable.create(2, 4));
//    }

}
