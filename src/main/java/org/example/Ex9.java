package org.example;
/*
* Split the following String: "Carl,Susie,Fredrick,Bob,Erik"
into an array. Print out all names separately*/

public class Ex9 {

    public static void main(String[] args) {
        String s = "Carl,Susie,Fredrick,Bob,Erik";
        String[] str = s.split(",");

        for (String st : str) {
            System.out.println(st);
        }
    }
}
