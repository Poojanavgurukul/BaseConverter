package main.java.converter;

import java.util.*;

public class Digit {
        public static List<Integer> getDigits(String Number) {
            String[] userNumber=Number.split("");
            ArrayList<Integer> list = new ArrayList<Integer>();
            int i=userNumber.length;
            while(i>0){
                list.add(Integer.valueOf(userNumber[i-1]));
                i--;
            }
            return list;
        }
    }

