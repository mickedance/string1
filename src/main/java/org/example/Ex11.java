package org.example;
/*
* Convert the following char[]: {'J','a','v','a'} to a
String and print it out.*/

public class Ex11 {
    public static void main(String[] args) {
        char[] ch =  {'J','a','v','a'};
        String s = new String(ch);

        System.out.println(s);
        //Another way
        s = String.valueOf(ch);
        System.out.println("---Other wat");
        System.out.println(s);
        //other way
        s = String.copyValueOf(ch);
        System.out.println("----Other way");
        System.out.println(s);
    }
}
