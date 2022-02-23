package com.leetcode.level.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

    public static Integer convertRomanToArabic (String s){
        Integer answer = 0;
        StringBuilder sb = new StringBuilder(s);
        while(sb.toString().contains("CM")){
            answer += 900;
            sb.delete(sb.indexOf("CM"), sb.indexOf("CM")+2);
        }
        while(sb.toString().contains("CD")){
            answer += 400;
            sb.delete(sb.indexOf("CD"), sb.indexOf("CD")+2);
        }
        while(sb.toString().contains("XC")){
            answer += 90;
            sb.delete(sb.indexOf("XC"), sb.indexOf("XC")+2);
        }
        while(sb.toString().contains("XL")){
            answer += 40;
            sb.delete(sb.indexOf("XL"), sb.indexOf("XL")+2);
        }
        while(sb.toString().contains("IX")){
            answer += 9;
            sb.delete(sb.indexOf("IX"), sb.indexOf("IX")+2);
        }
        while(sb.toString().contains("IV")){
            answer += 4;
            sb.delete(sb.indexOf("IV"), sb.indexOf("IV")+2);
        }
        while(sb.toString().contains("M")){
            answer += 1000;
            sb.delete(sb.indexOf("M"), sb.indexOf("M")+1);
        }
        while(sb.toString().contains("D")){
            answer += 500;
            sb.delete(sb.indexOf("D"), sb.indexOf("D")+1);
        }
        while(sb.toString().contains("C")){
            answer += 100;
            sb.delete(sb.indexOf("C"), sb.indexOf("C")+1);
        }
        while(sb.toString().contains("L")){
            answer += 50;
            sb.delete(sb.indexOf("L"), sb.indexOf("L")+1);
        }
        while(sb.toString().contains("X")){
            answer += 10;
            sb.delete(sb.indexOf("X"), sb.indexOf("X")+1);
        }
        while(sb.toString().contains("V")){
            answer += 5;
            sb.delete(sb.indexOf("V"), sb.indexOf("V")+1);
        }
        while(sb.toString().contains("I")){
            answer += 1;
            sb.delete(sb.indexOf("I"), sb.indexOf("I")+1);
        }

        if(sb.length() > 0){
            System.out.println("convertRomanToArabic() - method: error: sb remains " + sb);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        System.out.println(convertRomanToArabic(val));
    }
}
