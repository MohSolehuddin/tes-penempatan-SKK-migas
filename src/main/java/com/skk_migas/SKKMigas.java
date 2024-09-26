package com.skk_migas;

import java.util.ArrayList;
import java.util.List;

public class SKKMigas {
    public static void OkYes(Integer n){
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0){
                System.out.print("OKYES ");
            } else if (i % 3 == 0) {
                System.out.print("OK ");
            }else if (i % 4 == 0){
                System.out.print("YES ");
            }else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void no2a(Integer n){
        for (int i = 1; i <= n ; i++) {
            String number = String.valueOf(i);
            System.out.println(number.repeat(i));
        }
    }

    public static void no2b(Integer n){
        for (int i = 1; i <= n ; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void no2c(Integer n){
        for (int i = 1; i <= n ; i++) {
            List<Integer> numbers = new ArrayList<>();
            Integer temp = i;
            for (int j = 1; j <= i; j++) {
                if (numbers.isEmpty()){
                    numbers.add(temp);
                } else if (numbers.size() > 5) {
                    numbers.add(temp);
                    temp++;
                } else {
                    numbers.add(temp);
                    temp--;
                }
                System.out.print(temp);
            }
            System.out.println();
        }
    }

    public static void no3(List<Integer> list){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 != 0){
                result.add(list.get(i));
            }
        }

        for (int i = 0; i < result.size(); i++) {
            for (int j = i; j < result.size(); j++) {
                if (result.get(i) > result.get(j)){
                    Integer temp = result.get(i);
                    result.set(i, result.get(j));
                    result.set(j, temp);
                }
            }
        }

        System.out.println(result.toString());
    }
}
