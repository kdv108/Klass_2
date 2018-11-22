package com.itschool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double a, b, S, P;

	    Scanner in = new Scanner(System.in);
	    System.out.println("Программма расчитывает периметр и площадь прямоугольника по заданным сторонам.");
	    System.out.println("Введите одну сторону прямоугольника:");
	    b = in.nextDouble();
	    System.out.println("Введите другую сторону прямоугольника:");
	    a = in.nextDouble();

	    if (a<0 || b<0){
	        System.out.println("Введены неверные данные. Стороны прямоугольника не могут быть отрицательными.");
        }
        else {
            S = a*b;
            P = 2*(a+b);
            System.out.println("Периметр прямоугольника равен: P = "+P+", Площадь прямоугольника равна: S = "+S);
        }
    }
}
