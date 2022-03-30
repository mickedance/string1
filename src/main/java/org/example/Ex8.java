package org.example;
/*
* Oil and water don't go well together. Given the String:
"Oil and Water", split them up into the words "Oil","Water"
and store them in a String array.*/

public class Ex8 {

    public static void main(String[] args) {
        String s = "Oil and water don't go well together";
        String[] words = s.split("and");
        String word1 = words[0];
        String word2 = words[1].trim().split(" ")[0];
        System.out.println(word1);
        System.out.println(word2);
        // Another way
        System.out.println("----Another Way------");
        words[0] = "Oil And Water";

        word1 = words[0].split("And")[0].trim();
        word2 = words[0].split("And")[1].trim();

        System.out.println(word1);
        System.out.println(word2);


    }
}
