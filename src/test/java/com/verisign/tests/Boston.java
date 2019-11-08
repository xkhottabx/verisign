package com.verisign.tests;

/*
a). Write a program to sort and filter a list of company names.
Program should accept company names and return a filtered list of names based on input.
Filtering can be partial or by complete names.
Filtering should not be case sensitive
Ignore white spaces while filtering
Program allows for sorting the list of company names in alphabetical and reverse alphabetical order.
b. Write test cases to test your program
 */

import java.util.*;

public class Boston {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        List<String> companies=new ArrayList<>();
        String company="";
        System.out.println("Type the company name and press ENTER to continue. If done, type DONE and press ENTER");
        while (!company.equalsIgnoreCase("done")){
            company=scan.nextLine().trim();
            if (company.isEmpty()){
                System.out.println("Company name cannot be blank. Try again");
            }
            if (!company.equalsIgnoreCase("done") && !company.isEmpty()) {
                companies.add(company);
            }
        }
        if (companies.size()==0){
            System.out.println("List is empty");
            System.exit(0);
        }

        System.out.println("Do you want to sort result? Enter TRUE or FALSE");
        boolean sort=false;
        try{
             sort=scan.nextBoolean();
        }catch (InputMismatchException e){
            System.out.println("Invalid input");
        }
        String order="";
        if (sort){
            System.out.println("Sort in ascending or descending order? Type ASC or DESC and press ENTER");
            order=scan.next().trim();
            if (order.equalsIgnoreCase("asc")){
                Collections.sort(companies);
            }
            else if(order.equalsIgnoreCase("desc")){
                Collections.sort(companies);
                Collections.reverse(companies);
            }
            else{
                System.out.println("Invalid input");
            }

        }

            System.out.println(companies);


        System.out.println("Enter filter word or phrase:");
        List<String>filtered=new ArrayList<>();
        String filter=scan.next().trim();
        if (filter.isEmpty()){
            System.out.println(companies);
            System.exit(0);
        }

            for (String name: companies){
                if (name.toLowerCase().contains(filter.toLowerCase())){
                    filtered.add(name);
                }
            }
            if (filtered.size()!=0){
                System.out.println(filtered);
            }
            else{
                System.out.println("Filtered list is empty");
            }


        scan.close();
    }
}

/*
Test cases:
1. Enter 5 companies. Sort in ascending order. No filter. Assert output.
2. Enter 5 companies. Sort in descending order. No filter. Assert output.
3. Enter 20 companies which can be partially filter. No sort. Put filter. Assert output.
4. Empty input 3 times. Assert, that list is empty.
5. Enter 3 companies. No sort. Filter with empty input. Assert valid output.

 */