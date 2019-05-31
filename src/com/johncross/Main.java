package com.johncross;

public class Main {
    public static void main(String[] args) {

        byte myByteVar = 10;
        short myShortVar = 20;
        int myIntVar = 50;

        long myLongVar = 50_000L + 10L * (myByteVar + myShortVar + myIntVar);
        short myOtherShortVar = (short) (1000 + 10 * (myByteVar + myShortVar + myIntVar));

        System.out.println("myLongVar = " + myLongVar);
        System.out.println("myOtherShortVar = " + myOtherShortVar);

//        // int has a width of 32
//        int myMinValue = -2_147_483_648;
//        int myMaxValue = 2_147_483_647;
//        int myTotal = (myMinValue/2);
//        System.out.println("myTotal = " + myTotal);
//
//        // byte has a width of 8
//        byte myByteValue = -128;
//        byte myNewByteValue = (byte) (myByteValue/2);
//        System.out.println("myNewBtyeValue = " + myNewByteValue);
//
//        // short has a width of 16
//        short myShortValue = 32767;
//        short myNewShortValue = (short) (myShortValue / 2);
//
//        // long has a width of 64
//        long myLongValue = 9_223_372_036_854_775_807L;

    }
}
