package com.skk_migas;

import javax.sound.midi.Soundbank;
import java.time.temporal.JulianFields;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Jawaban Soal No 1");
        SKKMigas.OkYes(15);

        System.out.println("Jawaban No 2");
        SKKMigas.no2a(5);
        SKKMigas.no2b(5);
        SKKMigas.no2c(5);

        System.out.println("Jawaban No 3");
        List<Integer> integerList = Arrays.asList(12, 9, 13, 6, 10, 4, 7, 2);
        SKKMigas.no3(integerList);
    }
}
