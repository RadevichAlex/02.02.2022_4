package com.company;

public class Main {
    /*
    Implement the method that takes two Strings and as result return
    the index of the first character that not the same in the both Strings.
    Example: "Hello", "Hi" -> 1;
             "Hello", "Hello, and lets start" -> 5;
              "Hello", "Hello" -> -1;
     */
    public static void main(String[] args) {
        System.out.println(findFirstDiff2("Hello", "Hi"));
        System.out.println(findFirstDiff2("Hello", "Hello, and lets start"));
        System.out.println(findFirstDiff2("Hello", "Hello"));
    }

    public static int findFirstDiff(String str1,String str2){
        if(str1.equals(str2)){
            return -1;
        }
        int i=0;
        while(i<str1.length() && i<str2.length() && str1.charAt(i)==str2.charAt(i)){
            i++;
        }
        return i;
    }

    public static int findFirstDiff2(String str1,String str2){
        if(str1.equals(str2)){
            return -1;
        }
        int i;
        for(i=0;i<str1.length() && i<str2.length() && str1.charAt(i)==str2.charAt(i);i++ );
        return i;
    }

}