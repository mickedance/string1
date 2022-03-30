package org.example;
/*
* 2. What is the index position of 'o' in the following String:
"Even longer example sentence" ?*/


import java.util.Arrays;

public class Ex3 {

    public static void main(String[] args) {
        String s = "Even longer example sentence";
        char[] ch = s.toCharArray();
        int index = s.indexOf("o");
        System.out.println(index);
    }
}
