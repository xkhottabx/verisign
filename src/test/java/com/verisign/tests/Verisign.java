package com.verisign.tests;

import java.io.*;
import java.util.*;

public class Verisign {
    public static void main(String[] args) throws IOException {
        //C:\Users\HP\Desktop\Verisign

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Verisign\\PE.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            String str="";
            List<List<String>> list=new ArrayList<>();
            while (line != null) {
                str=line;
                String[]arr=str.split(",");//create array
                List<String>query=Arrays.asList(arr);//list with query
                if (query.size()<4){
                    list.add(query);//list of queries
                }
                line = br.readLine();
            }
            System.out.println(list.size());


            String everything = sb.toString();

            System.out.println(list.get(0).get(0));
            System.out.println("Number of queries: "+list.size());
            Set<String> setSourceIP=new HashSet<>();
            for (int i=0; i<list.size(); i++) {
                setSourceIP.add(list.get(i).get(0));
            }

            System.out.println();

//            for (String sourceIP: setSourceIP ) {
//                System.out.println("sourceIP = " + sourceIP);
//            }

            System.out.println("Number of unique source IPs: "+setSourceIP.size());
            List<String>listOfSourceIP=new ArrayList<>(setSourceIP);

            Map <String, Integer> map=new HashMap<>();
            int count=0;
            for (int i = 0; i <listOfSourceIP.size(); i++) {
                        for (int j = 0; j <list.size(); j++) {
                            if (listOfSourceIP.get(i).equals(list.get(j).get(0))){
                                count++;
                            }
                }
                map.put(listOfSourceIP.get(i),count);
                count=0;
            }

            System.out.println("map = " + map);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }



    }


}
