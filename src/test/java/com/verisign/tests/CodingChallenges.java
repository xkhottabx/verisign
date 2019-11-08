package com.verisign.tests;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.*;
import java.util.stream.Collectors;

public class CodingChallenges {

    public static void calculator(String expression) throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        System.out.println(engine.eval(expression));
    }

    //param 5 --> 1****/12***/123**/1234*/12345
    public static String slashesAndStars(int num){
        if (num<=0){
            System.out.println("Invalid number");
            return num+"";
        }
        String[]stars=new String[num];
        for (int i = 0; i <num; i++) {
            stars[i]="*";
        }
        StringBuilder sb=new StringBuilder();
        for (int i=0; i<num; i++){
            for (int j=0; j<num; j++){
                if (i==j){
                    stars[i]=(i+1)+"";
                }
                sb.append(stars[j]);
            }
            if (i!=num-1){
                sb.append("/");
            }

        }
        return sb.toString();
    }

    public static List removeDuplicates(List list){
        Set set= new HashSet(list);
        return new ArrayList(set); //not sorted
    }





    public static void main(String[] args) throws ScriptException {
        //calculator("2*2+5*4-8/2");
        System.out.println(slashesAndStars(10));
//        List list=new ArrayList();
//        list.add(5);list.add(5);list.add(5);list.add("Agnostic Front");list.add("NYHC");list.add("Deez Nuts");
//        list.add("Deez Nuts");
//        List list1=removeDuplicates(list);
//        // create a list of integers
//        List<Integer> number = Arrays.asList(2,3,4,5);
//
//        // demonstration of map method
//        List<Integer> square = number.stream().map(x -> x*x).
//                collect(Collectors.toList());
//        System.out.println(square);
//
//        for(int i=5; i>0 ;i--){
//
//            for(int j=0; j < i; j++){
//                System.out.print(j+1);
//            }
//
//            System.out.println("");
//        }

    }


    }

