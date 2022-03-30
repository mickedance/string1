package org.example;
/*
* Convert the following String: "ThisShouldBeConverted" to
a char array. Iterate through the char array and print out
each element.*/

public class Ex10 {
    public static void main(String[] args) {
        String s = "ThisShouldBeConverted";
        char[] ch = s.toCharArray();

        for (char c : ch)
            System.out.print(c + " ");
    }
}
