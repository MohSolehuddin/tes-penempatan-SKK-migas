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
        Integer nilai = 1;
        boolean isIncrement = true;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i  ; j++) {
                if (nilai.equals(n) && isIncrement){
                    isIncrement = false;
                }
                if (nilai == 1 & !isIncrement){
                    isIncrement = true;
                }
                if (isIncrement){
                    System.out.print(nilai);
                    nilai++;
                }else {
                    System.out.print(nilai);
                    nilai--;
                }
            }
            System.out.println();
        }
    }

    public static void no2d(Integer n){
        Integer total = n * n;

        List<Integer> listAngkaGanjil = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1){
                listAngkaGanjil.add(i);
            }
        }
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                if (j % 2 == 0){
                    Integer result = i;
                    System.out.println();
                }else {

                }
            }
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
