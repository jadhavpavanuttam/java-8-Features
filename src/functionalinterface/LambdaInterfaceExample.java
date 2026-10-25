package com.pavan.lambda;

import java.util.Locale;
import java.util.Scanner;

@FunctionalInterface
public interface LambdaInterfaceExample {
    public String getNeme(String name);
}

class pa1 implements LambdaInterfaceExample {

    @Override
    public String getNeme(String name) {
        return name;
    }

    public static void main(String[] args) {
        System.out.println("Please , Enter the name ?");
        String s = new Scanner(System.in).nextLine();
        pa1 pa1 = new pa1();
//        String upperCase = pa1.getNeme(s).toUpperCase(Locale.ROOT);
        for (char c : pa1.getNeme(s).toUpperCase(Locale.ROOT).toCharArray()) {
            System.out.println((c) + " : " + (int) (c));
        }
        System.out.println("------------------------------------------");
        for (char c : pa1.getNeme(s).toCharArray()) {
            System.out.println((c) + " : " + (int) (c));
        }
//        System.out.println("Your Name In Upper Case Is : " + upperCase);
    }
}