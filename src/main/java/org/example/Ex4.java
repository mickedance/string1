package org.example;
/*Given the following String: "Ok this is not as long!"
create a substring of only "not as long" (excluding the
exclamation point) and print it ou*/


public class Ex4 {
    public static void main(String[] args) {
        String s = "Ok this is not as long!";
        String s2 = s.replaceAll("Ok this is ", "");
        int index = s.indexOf("not");
        String s3 = s.substring(index);
        System.out.println(s2);
        System.out.println(s3);
    }
}
