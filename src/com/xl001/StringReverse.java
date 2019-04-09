package com.xl001;

import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {
    public static String  reverse(String str){
        char[] st = str.toCharArray();
        for(int i=0; i<st.length/2; i++){
            char s = st[i];
            st[i] = st[st.length-i-1];
            st[st.length-i-1] = s;
        }
        return new String(st);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] rst = reverse(str).split(" ");

        for(int i=0; i<rst.length; i++){
            System.out.print(reverse(rst[i]) + " ");
        }

    }

}
