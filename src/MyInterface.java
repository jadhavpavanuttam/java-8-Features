package com.pavan.lambda;

import java.util.Scanner;

/*
Functional Interface:
1. A Interface Which Contains only one abstract methos is known as functional interface
2. contains default and static method
3. we can make with the help of functional interface  lambda expression

 */
@FunctionalInterface
public interface MyInterface {
    public void sayHellow();

    public default void sayBye() {
        System.out.println("This is my (default ) Method in the Interface");
    }

    public static int sayOk(int n) {
        int f = 1;
        if (n == 1 || n == 0)
            return 1;
        if (n < 0)
            throw new RuntimeException("Invalid input..!!");
        for (int i = n; i >= 1; i--) f *= i;
        return f;
    }

    public static void main(String[] args) {
        System.out.println("Enter Any Number's :");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Factorial of " + a + "given number is :" + (MyInterface.sayOk(a)));
    }
}