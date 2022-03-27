package com.company;

public class Main2 {
// "qwertyuiop"
// 1. Бежим по строке
// 2. если символ на четной позиции ->  копируем его в результат

    public static void main(String[] args) {
        System.out.println(getEvenString2("012345678"));
    }
    public static String getEvenString(String str){
        String rez="";
        for (int i=0;i<str.length(); i++){
            if(i%2==0){
                rez+=str.charAt(i);
            }
        }
        return rez;
    }
    public static String getEvenString2(String str){
        String rez="";
        for (int i=0;i<str.length(); i+=2){
            rez+=str.charAt(i);

        }
        return rez;
    }


}









