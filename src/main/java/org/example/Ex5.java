package org.example;
/*
* Correct the following String: "Java is the worst
programming language!" by replacing the (obviously
incorrect) word "worst" with the word "best". Then print
out the sentence.*/


public class Ex5 {
    public static void main(String[] args) {
        String s = "Java is the worst programming language!";
        String s2 = s.replaceAll("worst", "best");

        System.out.println(s2);
    }
}
