package com.jiankang.javacoretechnologythetenversion.chapter5.v9;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;


/**
 * lambdaTest
 *
 * @author jiankang.xu
 * @date 2020/6/7
 */
public class lambdaTest {
    public static void main(String[] args) {
        String[] plants = new String[]{"Mercury", "Venus", "Earth"};
        System.out.println(Arrays.toString(plants));
        System.out.println("Sorted in dictionary order: ");
        Arrays.sort(plants);
        System.out.println(Arrays.toString(plants));
        System.out.println("Sorted by length： ");
        Arrays.sort(plants, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(plants));

        Timer t = new Timer(1000, event -> System.out.println("The time is " + new Date()));
        t.start();
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);

    }
}
