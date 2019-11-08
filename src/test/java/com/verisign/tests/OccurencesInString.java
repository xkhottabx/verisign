package com.verisign.tests;

import java.util.*;


public class OccurencesInString {

    public static void main(String[] args) {
        String str = "kharebovvladyslav";

        int count = 0;
        String result="";
        for (int i = 0; i < str.length(); i++) {
            String temp=""+str.charAt(i);
            if (result.contains(temp)){
                continue;
            }
            for (int j = i; j < str.length(); j++) {

                if (temp.equals(""+str.charAt(j))){
                    count++;
                }
            }
            result+=(temp+count);
            count=0;
        }
        System.out.println("result = " + result);
    }
}
