package org.example;
/*
* Parse the following int: 20 to a String and add a 20 to the
end of the String. Printing it out should return: "2020".*/


public class Ex7 {

    public static void main(String[] args) {
        int nr = 20;
        String s = Integer.toString(nr);
        s += "20";

        System.out.println(s);

        //another way
        s = s.concat("220");
        System.out.println(s);
    }
}
