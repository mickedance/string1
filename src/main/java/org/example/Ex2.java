package org.example;
/*1. What char is at index position 6 in the following String:
"Long example sentence" ?*/


public class Ex2 {
    public static void main(String[] args) {
        String s = "Long example sentence";

        char[] ch = s.toCharArray();
        char charAt6 = s.charAt(6);

        System.out.println(ch[6]);
        System.out.println(charAt6);
    }
}
