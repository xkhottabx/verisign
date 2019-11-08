package com.verisign.tests;


public class FINRA {

    public static void main(String[] args) {
        System.out.println(palindrome(45678));
    }

    public static int palindrome(int num){
        //input  45678
        //output 87654
        int pal=0;
        int remainder=0;
        do {
            remainder=num%10;//8, 7,6,5,4
            pal=pal*10+remainder;//8,87,876,8765,87654
            num=num/10;//4567,456,45,4,0
        }while(num>0);
        return pal;
    }
}
