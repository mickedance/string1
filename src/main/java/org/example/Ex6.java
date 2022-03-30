package org.example;

/*
* What is the output of the following String:
"\tJ\ta\tv\ta\t" after you trim it?*/

public class Ex6 {
    public static void main(String[] args) {
        String s ="\tJ\ta\tv\ta\t";
        String s2 = s.trim();
        String s3 = s.replaceAll("\t", "").trim();
        System.out.println(s2);
        System.out.println(s3);
    }
}
